package com.libman.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.libman.dao.BooksDao;
import com.libman.dao.LendRequestDao;
import com.libman.models.Books;
import com.libman.models.Lends;
import com.libman.models.Login;
import com.libman.models.Users;
import com.libman.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
	@Autowired
	UserService userService;

	@Autowired
	LendRequestDao lendRequestDao;
	
	@Autowired
	BooksDao booksDao;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		return mav;
	}

	@RequestMapping(value="/loginProcess", method=RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		Users user = userService.validateUser(login);
		if (null != user && user.getUsername().equals("admin")) {
			mav = new ModelAndView("lendrequestlist");
			List<Lends> list = lendRequestDao.getLentRecords();
			mav.addObject("lendlist", list);
		} 
		else if (null != user) {
			mav = new ModelAndView("viewbooks");
			List<Books> list = booksDao.getAllBooks();
			mav.addObject("bookslist", list);
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		return mav;
	}
	@RequestMapping(value="/lendrequestlist")
	public String viewRequest(Model model) {
		List<Lends> list = lendRequestDao.getLentRecords();
		model.addAttribute("lendlist",list);
		return "lendrequestlist";
	}
	
	@RequestMapping(value="/approverequest/{id}")
	public String approve(@PathVariable int id, Model model) {
		Lends lend = lendRequestDao.getLendRequestById(id);
		int approve_req = lendRequestDao.lendRequestApproveAction(lend);
		model.addAttribute("command",lend);
		return "redirect:/lendrequestlist";
	}
	
	@RequestMapping(value="/rejectrequest/{id}")
	public String reject(@PathVariable int id, Model model) {
		Lends lend = lendRequestDao.getLendRequestById(id);
		int approve_req = lendRequestDao.lendRequestRejectAction(lend);
		model.addAttribute("command",lend);
		return "redirect:/lendrequestlist";
	}
	
	@RequestMapping(value="/viewbooks")
	public String viewBooks(Model model) {
		List<Books> list = booksDao.getAllBooks();
		model.addAttribute("bookslist",list);
		return "viewbooks";
	}
	
	@RequestMapping(value="/booksinventory")
	public String booksInventory(Model model) {
		List<Books> list = booksDao.getAllBooks();
		model.addAttribute("bookinvlist",list);
		return "booksinventory";
	}
	
	@RequestMapping("/addbooks")
	public String showform(Model model) {
		List<Books> list = booksDao.getAllBooks();
		model.addAttribute("bookinvlist",list);
		model.addAttribute("command", new Books());
		return "addbooks";
	}
	
	@RequestMapping(value="/saveBooks", method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("books") Books book) {
		booksDao.saveBooks(book);
		return "redirect:/booksinventory";
	}
	


}
