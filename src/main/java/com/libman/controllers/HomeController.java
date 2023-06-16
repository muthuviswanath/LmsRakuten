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

import com.libman.dao.AuthorDao;
import com.libman.dao.BooksDao;
import com.libman.dao.LendRequestDao;
import com.libman.dao.PublisherDao;
import com.libman.dao.UsersDao;
import com.libman.models.Authors;
import com.libman.models.Books;
import com.libman.models.Lends;
import com.libman.models.Login;
import com.libman.models.Publishers;
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
	
	@Autowired
	AuthorDao authorDao;
	
	@Autowired
	PublisherDao publisherDao;
	
	@Autowired
	UsersDao usersDao;
	
	Users user;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		return mav;
	}

	@RequestMapping(value="/loginProcess", method=RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login ) {
		ModelAndView mav = null;
		user = userService.validateUser(login);
		if (null != user && user.getUsername().equals("admin")) {
			mav = new ModelAndView("lendrequestlist");
			List<Lends> list = lendRequestDao.getLentRecords();
			mav.addObject("lendlist", list);
		} 
		else if (null != user) {
			mav = new ModelAndView("viewbooks");
			login.setUsername(user.getUsername());
			login.setLoginid(user.getUserid());
			List<Books> list = booksDao.getAllBooks();
			
			mav.addObject("username",user.getUsername());
			mav.addObject("loginuserid", user.getUserid());
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
		System.out.println(approve_req + "book(s) have been approved" );
		model.addAttribute("command",lend);
		return "redirect:/lendrequestlist";
	}
	
	@RequestMapping(value="/rejectrequest/{id}")
	public String reject(@PathVariable int id, Model model) {
		Lends lend = lendRequestDao.getLendRequestById(id);
		int approve_req = lendRequestDao.lendRequestRejectAction(lend);
		System.out.println(approve_req + "book(s) have been rejected" );
		model.addAttribute("command",lend);
		return "redirect:/lendrequestlist";
	}
	
	@RequestMapping(value="/viewbooks")
	public String viewBooks(Model model) {
		List<Books> list = booksDao.getAllBooks();
		model.addAttribute("username",user.getUsername());
		model.addAttribute("loginuserid", user.getUserid());
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
		List<Authors> authlist = authorDao.getAuthorRecords();
		List<Publishers> publishlist = publisherDao.getPublishersRecords();
		model.addAttribute("bookinvlist",list);
		model.addAttribute("authorlist",authlist);
		model.addAttribute("publisherlist",publishlist);
		model.addAttribute("command", new Books());
		return "addbooks";
	}
	
	@RequestMapping(value="/saveBooks", method=RequestMethod.POST)
	public String saveBooks(@ModelAttribute("books") Books book) {
		booksDao.saveBooks(book);
		return "redirect:/booksinventory";
	}
	
	@RequestMapping(value="/lentlist")
	public String lentList(Model model) {
		List<Lends> list = lendRequestDao.getApprovedLentRecords();
		model.addAttribute("approvedlist",list);
		return "lentlist";
	}
	
	@RequestMapping(value="/lendhistory")
	public String lentHistory(Model model) {
		List<Lends> list = lendRequestDao.getLentHistoryRecords();
		model.addAttribute("lendhistory",list);
		return "lendhistory";
	}
	
	@RequestMapping(value="/authorrecords")
	public String authorRecords(Model model) {
		List<Authors> list = authorDao.getAuthorRecords();
		model.addAttribute("authorlist",list);
		return "authorrecords";
	}
	
	@RequestMapping("/addauthors")
	public String showAuthorForm(Model model) {
		List<Authors> list = authorDao.getAuthorRecords();
		model.addAttribute("authlist",list);
		model.addAttribute("command", new Authors());
		return "addauthors";
	}
	
	@RequestMapping(value="/saveAuthors", method=RequestMethod.POST)
	public String saveAuthors(@ModelAttribute("authors") Authors book) {
		authorDao.saveAuthors(book);
		return "redirect:/booksinventory";
	}

	@RequestMapping(value="/editauthors/{id}", method=RequestMethod.GET)
	public String editAuthor(@PathVariable int id, Model model) {
		Authors author = authorDao.getAuthorById(id);
		model.addAttribute("command",author);
		return "editauthors";
	}

	@RequestMapping(value="/deleteauthors/{id}",method = RequestMethod.GET)    
	public String deleteAuthor(@PathVariable int id){    
		authorDao.deleteAuthors(id);    
		return "redirect:/authorrecords";    
	}
	
	@RequestMapping(value="/editbooks/{id}", method=RequestMethod.GET)
	public String editBooks(@PathVariable int id, Model model) {
		Books book = booksDao.getBooksById(id);
		List<Authors> authlist = authorDao.getAuthorRecords();
		List<Publishers> publishlist = publisherDao.getPublishersRecords();
		model.addAttribute("editauthorlist",authlist);
		model.addAttribute("editpublisherlist",publishlist);
		model.addAttribute("command",book);
		return "editbooks";
	}

	@RequestMapping(value="/deletebooks/{id}",method = RequestMethod.GET)    
	public String deleteBooks(@PathVariable int id){    
		booksDao.deleteBooks(id);    
		return "redirect:/booksinventory";    
	}
	
	@RequestMapping(value="/publisherrecords")
	public String publisherRecords(Model model) {
		List<Publishers> list = publisherDao.getPublishersRecords();
		model.addAttribute("publisherlist",list);
		return "publisherrecords";
	}
	
	@RequestMapping("/addpublishers")
	public String showPublisherForm(Model model) {
		List<Publishers> list = publisherDao.getPublishersRecords();
		model.addAttribute("publishlist",list);
		model.addAttribute("command", new Publishers());
		return "addpublishers";
	}
	
	@RequestMapping(value="/savepublishers", method=RequestMethod.POST)
	public String savePublishers(@ModelAttribute("publishers") Publishers publisher) {
		publisherDao.savePublishers(publisher);
		return "redirect:/publisherrecords";
	}

	@RequestMapping(value="/editpublishers/{id}", method=RequestMethod.GET)
	public String editPublishers(@PathVariable int id, Model model) {
		Publishers publisher = publisherDao.getPublishersById(id);
		model.addAttribute("command",publisher);
		return "editpublishers";
	}

	@RequestMapping(value="/deletepublishers/{id}",method = RequestMethod.GET)    
	public String deletePublishers(@PathVariable int id){    
		publisherDao.deletePublishers(id);
		return "redirect:/publisherrecords";    
	}
	
	@RequestMapping(value="/userrecords")
	public String userRecords(Model model) {
		List<Users> list = usersDao.getUserRecords();
		model.addAttribute("userlist",list);
		return "userrecords";
	}
	
	@RequestMapping("/addusers")
	public String showUsersForm(Model model) {
		List<Users> list = usersDao.getUserRecords();
		model.addAttribute("usrlist",list);
		model.addAttribute("command", new Users());
		return "addusers";
	}
	
	@RequestMapping(value="/saveusers", method=RequestMethod.POST)
	public String saveUsers(@ModelAttribute("users") Users usrs) {
		usersDao.register(usrs);
		return "redirect:/userrecords";
	}

	@RequestMapping(value="/editusers/{id}", method=RequestMethod.GET)
	public String editUsers(@PathVariable int id, Model model) {
		Users user = usersDao.getUserById(id);
		model.addAttribute("command",user);
		return "editusers";
	}

	@RequestMapping(value="/deleteusers/{id}",method = RequestMethod.GET)    
	public String deleteUsers(@PathVariable int id){    
		usersDao.deleteUsers(id);
		return "redirect:/userrecords";    
	}
	
	
	@RequestMapping(value="/issuedbooks/{id}", method=RequestMethod.GET)
	public String IssuedBooks(@PathVariable int id, Model model) {
		List<Lends> issuedbooklist = lendRequestDao.getLentRecords(id);
		model.addAttribute("issuedbook",issuedbooklist);
		model.addAttribute("userid",id);
		return "issuedbooks";
	}
	
	@RequestMapping(value="/userhistory/{id}", method=RequestMethod.GET)
	public String userHistory(@PathVariable int id, Model model) {
		List<Lends> issuedbooklist = lendRequestDao.getUserRecords(id);
		model.addAttribute("userhistorylist",issuedbooklist);
		model.addAttribute("userid",id);
		return "userhistory";
	}
	
}
