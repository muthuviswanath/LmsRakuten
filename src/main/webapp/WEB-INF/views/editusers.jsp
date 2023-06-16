<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/brands.min.css" integrity="sha512-G/T7HQJXSeNV7mKMXeJKlYNJ0jrs8RsWzYG7rVACye+qrcUhEAYKYzaa+VFy6eFzM2+/JT1Q+eqBbZFSHmJQew==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css" integrity="sha512-giQeaPns4lQTBMRpOOHsYnGw1tGVzbAIHUyHRgn7+6FmiEgGGjaG0T2LZJmAPMzRCl+Cug0ItQ2xDZpTmEc+CQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/regular.min.css" integrity="sha512-k2UAKyvfA7Xd/6FrOv5SG4Qr9h4p2oaeshXF99WO3zIpCsgTJ3YZELDK0gHdlJE5ls+Mbd5HL50b458z3meB/Q==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/solid.min.css" integrity="sha512-6mc0R607di/biCutMUtU9K7NtNewiGQzrvWX4bWTeqmljZdJrwYvKJtnhgR+Ryvj+NRJ8+NnnCM/biGqMe/iRA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/svg-with-js.min.css" integrity="sha512-iyaXtrpKz7FIRsICgrvVtq1vkSJT/cfLeXA0sHSQaAs0y3LdqXWlQCXTxM246mTQ/M2qpyVX3A0aRfmTt0LOCQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-font-face.min.css" integrity="sha512-ueEJBIkl0DBM2fA8eS/o12U3l+ZUFn32IUY4jIaTZnNtKR4ktQw3cE/tx/tFIYJuBm4EVT7WUMqIXP1TUN0boA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-shims.min.css" integrity="sha512-SkKgNHAdwXn0lw1CzCwHFpNidxo0GTBZkWWuUHNahSjQZtmeoQYjMvmHe1WYuCT8HystwoBp8fYDfuWD6azryQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="icon" type="image/x-icon" href="/LibraryManagement/resources/images/others/favicon.ico">
  <style>
body {
  font-family: sans-serif;
}
.homepagemenuitems{
    display: flex;
    list-style-type:none;
}
.homepagemenuitems li{
    margin-left: 20px;
}

.homepagemenuitems li a{
    color: white;
    text-decoration: none;
}
.homepagemenuitems li a:active{
    color: white;
    text-decoration: none;
}
.homepagemenuitems li a:hover{
    color: white;
    font-size: 17px;
}
.container{
    margin-top: 20px;
    background-color: #009999;
    height: 70px;
    position: fixed;
    left:108px;
}
.LogoImg{
    max-height: 70px;
    max-width: 70px;
    padding: 10px;
    float:left;
}
.homepagemenu{
    float: right;
    color: white;
    padding: 20px;
    font-size: 16px;
}
.logo-container{
    float:left;
}

#navbar {
overflow: hidden;
position: fixed;
top:90px;
left:108px;
  overflow: hidden;
  background-color: #f8f8f8;
  width:85.96%;
}

#navbar a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

#navbar a:hover {
  background-color: #ddd;
  color: black;
}

#navbar a.active {
  background-color: #00d9d9;
  color: #001313;

  
}
.content{
    position: fixed;
    margin-top: 130px;
    height: 530px;
    overflow: auto;
    width: 85.10%;
    
}
.footer{
    position: fixed;
    background-color: #60d7d7;
    top: 690px;
    left: 108px;
    height: 40px;
    width: 85.95%;
    font-size: 13px;
    font-style: oblique;
    font-weight: bold;
    text-align: center;
    padding-top: 12px;
}
.userfriendly{
position: absolute;
top: 80px;
margin-left: 10px;
width: 98%;
height: 430px;
background: #FFFFFF 0% 0% no-repeat padding-box;
box-shadow: 2px 4px 6px #00000029;
color: #009999;
border-radius: 27px;
opacity: 1;
padding-top: 55px;
padding-left: 65px;
padding-right: 65px;
padding-bottom: 20px;
text-align: justify;

}

/* width */
::-webkit-scrollbar {
  width: 10px;
}

/* Track */
::-webkit-scrollbar-track {
  box-shadow: inset 0 0 5px grey; 
  border-radius: 10px;
}
 
/* Handle */
::-webkit-scrollbar-thumb {
  background: #009999; 
  border-radius: 10px;
}

/* Handle on hover */
::-webkit-scrollbar-thumb:hover {
  background: #009999; 
}
.addpublisherbutton {
  display: inline-block;
  border-radius: 4px;
  background-color: #009999;
  border: none;
  color: #FFF;
  text-align: center;
  font-size: 14px;
  padding: 10px;
  width: 140px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.addpublisherbutton span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.addpublisherbutton span:after {
  content: '\002B';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.addpublisherbutton:hover span {
  padding-right: 15px;
}

.addpublisherbutton:hover span:after {
  opacity: 1;
  right: 0;
}
input[type=text] {
    border: 2px solid #009999;  
    border-radius: 5px;
    -webkit-transition: 0.5s;
    transition: 0.5s;
    box-sizing: border-box;
}
input[type=text]:focus {
    border: 3px solid #009999;  
    -webkit-transition: 0.5s;
    transition: 0.5s;
    box-sizing: border-box;
}
input[type=text]:focus-visible {
    border: 3px solid #009999;  
    -webkit-transition: 0.5s;
    transition: 0.5s;
    box-sizing: border-box;
}

input[type=password] {
    border: 2px solid #009999;  
    border-radius: 5px;
    -webkit-transition: 0.5s;
    transition: 0.5s;
    box-sizing: border-box;
}
input[type=password]:focus {
    border: 3px solid #009999;  
    -webkit-transition: 0.5s;
    transition: 0.5s;
    box-sizing: border-box;
}
input[type=password]:focus-visible {
    border: 3px solid #009999;  
    -webkit-transition: 0.5s;
    transition: 0.5s;
    box-sizing: border-box;
}
</style>
<title>E-Library | Add Users</title>
</head>
<body>
    <div class="container">
        <div class="logo-container">
        <div class="LogoImg">
            <a href="/LibraryManagement/"><img src="/LibraryManagement/resources/images/others/books.png"/> </a>
        </div>
        
    </div>
    <div class="homepagemenu">
        <ul class="homepagemenuitems">
            <li><a href="#">About</a></li>
            <li><a href="#"><i class="fa fa-phone" aria-hidden="true"></i> Contact</a></li>
            <li><i class="fa fa-user" aria-hidden="true"></i> Admin</li>
            <li><a href="/LibraryManagement/login">Logout <i class="fa fa-sign-out" aria-hidden="true"></i></a></li>
        </ul>
    </div>
    <div id="navbar">
        <a href="/LibraryManagement/booksinventory">Book Inventory</a>
        <a href="/LibraryManagement/authorrecords">Authors</a>
        <a href="/LibraryManagement/publisherrecords">Publishers</a>
        <a class="active" href="/LibraryManagement/userrecords">Users</a>
        <a href="/LibraryManagement/lendrequestlist">Request List</a>
        <a href="/LibraryManagement/lentlist">Lent Books</a>
        <a href="/LibraryManagement/lendhistory">Lend/Return History</a>
      </div>
      <div class="content">
        <a href="/LibraryManagement/userrecords">Back to Users List</a>
        <hr/>
        <span class="userfriendly">
            <div style="text-align: center;">
           <h3 style="color: #009999;">Create New User</h3>
        </div>
        <br/>
         <form:form method="POST" action="saveusers">
           <label>User Name</label>
           <br/>
           <form:input type="text" size="50%" path="username"/>
           <br/><br/>
           <label>Password</label>
           <br/>
           <form:input type="password" size="50%" path="password"/>
           <br/><br/>
           <label>Role</label>
           <br/>
           <form:input type="text" size="50%" path="role"/>
           <br/><br/>
           <button class="addpublisherbutton" style="vertical-align:middle" onclick="showAlert()"><span>Update User</span></button>
           </form:form>
        </span>
        
    </div>
</div>
<div class="footer">
    Copyrights &copy; Rakuten
</div>
<script>
    function showAlert() {
      alert ("User added successfully");
    }
    </script>
</body>
</html>