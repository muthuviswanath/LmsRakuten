<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
  <link rel="icon" type="image/x-icon" href="resources/images/others/favicon.ico">
  <style>
@charset "ISO-8859-1";

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
.banner{

  background-image: url('resources/images/others/divback.png');
  top: 100px;
  margin-left:108px;
  height: 600px;
  width: 50%;
  background-size: cover;
  float:left;
  align-items: center;
  align-content: center;
  text-align: center;
  
}
.banner-right{
top: 100px;
margin-left: 836px;
width: 38.56%;
height: 600px;
background: transparent linear-gradient(90deg, #FFFFFF 0%, #00bebe 180%) 0% 0% no-repeat padding-box;
opacity: 1;
}
.footer{
    background-color: #60d7d7;
    padding-top: 10px;
    margin-top: 2px;
    margin-left: 108px;
    height: 40px;
    width: 85.95%;
    font-size: 13px;
    font-style: oblique;
    font-weight: bold;
    text-align: center;
}


.login-form{
position: absolute;
top: 170px;
margin-left: 40px;
width: 400px;
height: 500px;
background: #FFFFFF 0% 0% no-repeat padding-box;
box-shadow: 2px 4px 6px #00000029;

border-radius: 27px;
opacity: 1;
padding-top: 55px;
padding-left: 15px;
padding-right: 15px;
padding-bottom: 20px;
text-align: center;

}
.login-form-circle{
    /* Layout Properties */
position: absolute;
top: 220px;
left: 1050px;
width: 130px;
height: 130px;
border-radius: 50%;
/* UI Properties */
background: #0b001f no-repeat padding-box;
opacity: 1;
padding: 20px;

}
.login {
	width: 320px;
	padding: 30px;
}

.login__field {
	padding: 10px 0px;	
	position: relative;	
}

.login__icon {
	position: absolute;
	top: 30px;
	color: #7875B5;
}

.login__input {
	border: none;
	border-bottom: 2px solid #D1D1D4;
	background: none;
	padding: 10px;
	padding-left: 24px;
	font-weight: 700;
	width: 75%;
	transition: .5s;
}

.login__input:active,
.login__input:focus,
.login__input:hover {
	outline: none;
	border-bottom-color: #6A679E;
}

.login__submit {
    
	background: #fff;
	font-size: 14px;
	margin-top: 30px;
    margin-left: 30px;
	padding-top: 16px;
    padding-bottom: 16px;
    padding-left: 70px;
    padding-right: 40px;
	border-radius: 26px;
	border: 1px solid #D4D3E8;
	text-transform: uppercase;
	font-weight: 700;
	display: flex;
	align-items: center;
	width: 80%;
	color: #4C489D;
	box-shadow: 0px 2px 2px #5C5696;
	cursor: pointer;
	transition: .5s;
	text-decoration: none;
}

.login__submit:active,
.login__submit:focus,
.login__submit:hover {
	border-color: #6A679E;
    box-shadow: 5px 5px 5px #5C5696;
	outline: none;
    background: #009999;
    color: #fff;
}

.button__icon {
	font-size: 24px;
	margin-left: auto;
	color: #4C489D;
}
</style>
<title>E-Library | Login</title>
</head>
<body>
    <div class="container">
        <div class="logo-container">
        <div class="LogoImg">
        <a href="/LibraryManagement/"><img src="resources/images/others/books.png"/> </a>
        </div>
        
    </div>
    <div class="homepagemenu">
        <ul class="homepagemenuitems">
            <li><a href="#">About</a></li>
            <li><a href="#"><i class="fa fa-phone" aria-hidden="true"></i> Contact</a></li>
            
        </ul>
    </div>

    </div>
    <div class="banner">
        <img src="resources/images/others/elearning.png"/>
    </div>
    <span style="font-size: 32px;position: absolute;top:105px;font-weight: bolder;left:925px">Sign in to Digital Library</span>
    <div class="banner-right">
        <span class="login-form">
            <h6 style="font-weight: bold; text-align: center;margin-top: 140px;">Member Login</h6>
            
            <form:form method="POST" class="login" action="loginProcess" modelAttribute="login" id="userLoginForm">
                    <div class="login__field">
                        <i class="login__icon fas fa-user"></i>
                        <form:input type="text" class="login__input" placeholder="User name" path="username" />
                    </div>
                    <div class="login__field">
                        <i class="login__icon fas fa-lock"></i>
                        <form:input type="password" class="login__input" placeholder="Password" path="password" />
                    </div>
                    <button class="button login__submit">
                        <span class="button__text">Log In</span>
                         &nbsp;&nbsp;>>
                    </button>				
            </form:form>
        </span>
        <p style="color:red">${message}</p>
        <span class="login-form-circle">
            <img src="resources/images/others/adminuser.png" style="width: 100%; height: 100%;">
        </span>
        
    </div>
    <div class="footer">
        Copyrights &copy; Rakuten
    </div>
</body>
</html>
