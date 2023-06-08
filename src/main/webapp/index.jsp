<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

  background-image: url('images/others/divback.png');
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
.cataloguing{
position: absolute;
top: 350px;
margin-left: 10px;
width: 300px;
height: 130px;
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
.cataloguing-circle{
    /* Layout Properties */
position: absolute;
top: 280px;
left: 990px;
width: 88px;
height: 88px;
border-radius: 50%;
/* UI Properties */
background: transparent radial-gradient(closest-side at 50% 50%, #FFFFFF 0%, #FFFFFF 32%, #009999 250%) 0% 0% no-repeat padding-box;
opacity: 1;
padding: 20px;

}

.bookinventory{
position: absolute;
top: 170px;
margin-left: 230px;
width: 300px;
height: 130px;
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
.bookinventory-circle{
    /* Layout Properties */
position: absolute;
top: 100px;
left: 1220px;
width: 88px;
height: 88px;
border-radius: 50%;
/* UI Properties */
background: transparent radial-gradient(closest-side at 50% 50%, #FFFFFF 0%, #FFFFFF 32%, #009999 250%) 0% 0% no-repeat padding-box;
opacity: 1;
padding: 20px;

}

.userfriendly{
position: absolute;
top: 530px;
margin-left: 230px;
width: 300px;
height: 130px;
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
.userfriendly-circle{
    /* Layout Properties */
position: absolute;
top: 460px;
left: 1220px;
width: 88px;
height: 88px;
border-radius: 50%;
/* UI Properties */
background: transparent radial-gradient(closest-side at 50% 50%, #FFFFFF 0%, #FFFFFF 32%, #009999 250%) 0% 0% no-repeat padding-box;
opacity: 1;
padding: 20px;

}
</style>
<title>E-Library | Home</title>
</head>
<body>
    <div class="container">
        <div class="logo-container">
        <div class="LogoImg">
            <a href="index.html"><img src="resources/images/others/books.png"/> </a>
        </div>
        
    </div>
    <div class="homepagemenu">
        <ul class="homepagemenuitems">
            <li><a href="#">About</a></li>
            <li><a href="#"><i class="fa fa-phone" aria-hidden="true"></i> Contact</a></li>
            <li><a href="login"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a></li>
        </ul>
    </div>

    </div>
    <div class="banner">
    
        <img src="resources/images/others/elearning.png"/>
    </div>
    <div class="banner-right">
        <span class="cataloguing">
            <h6 style="font-weight: bold; text-align: center;margin-top: -30px;">cataloguing</h6>
            
            <p style="font-size: 11px;margin-top: 15px;">The cataloguing module of the library management system enables the librarian to create books, journals and other resources entries and create a database of the same for easy book search</p>
        </span>
        <span class="cataloguing-circle">
            <img src="resources/images/others/digital-data.png" style="width: 100%; height: 100%;">
        </span>

        <span class="bookinventory">
            <h6 style="font-weight: bold; text-align: center;margin-top: -30px;">Digital Book Inventory</h6>
            
            <p style="font-size: 11px;margin-top: 15px;">Enables Librarian to upload & share unlimited e- content and offers access to students in order to drive hassle- free teacher- student collaboration</p>
        </span>
        <span class="bookinventory-circle">
            <img src="resources/images/others/book-online.png" style="width: 100%; height: 100%;">
        </span>

        <span class="userfriendly">
            <h6 style="font-weight: bold; text-align: center;margin-top: -30px;">User Friendly</h6>
            
            <p style="font-size: 11px;margin-top: 15px;">The simple intuitive and easy to navigate LMS platform has a mobile based application that enables librarian & students to operate it with ease on mobile devices.</p>
        </span>
        <span class="userfriendly-circle">
            <img src="resources/images/others/library.png" style="width: 100%; height: 100%;">
        </span>
        
    </div>
    <div class="footer">
        Copyrights &copy; Rakuten
    

</body>
</html>
