<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style type="text/css">
 
   .navbar
{
    font-size: 15px !important;

    margin-bottom: 0;

    letter-spacing: 4px;

    opacity: .9;
    border: 0;
    background-color: white;
}

/* Add a gray color to all navbar links */
.navbar li a,
.navbar .navbar-brand
{
    color: black !important;
}

/* On hover, the links will turn white */
.navbar-nav li a:hover
{
    color: black !important;
}

/* The active link */
.navbar-nav li.active a
{
 
    color: white !important;
     background-color:#444444;
}

/* Remove border color from the collapsible button */
.navbar-default .navbar-toggle
{
    border-color: transparent;
}

   body{
   background-color:#444444;
   }
</style> 
</head>

<body data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/home">Jocuti Pentru Toti</a>
    </div>
    <ul class="nav navbar-nav">
  		<li><a href="/home"><span class="glyphicon glyphicon-home"style="font-size:20px"></span> Home </a></li>
         <li><a href="#contact">Contact</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="/cosulMeu"><span class="fa fa-cart-plus"style="font-size:20px"></span>  Cosul meu</a></li>
      <li><a href="/login"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
    </ul>
    <form class="navbar-form navbar-left">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>
       <button type="submit" class="btn btn-info">
      		<span class="glyphicon glyphicon-search"></span> Search
    	</button>
    </form>
  </div>
</nav>
<br><br><br><br><br><br>

<%@include file="gameItemPage.jsp" %>
<br><br><br><br><br><br>
<%@include file="contactUs.jsp" %>
<br><br>
<%@include file="footer.jsp" %>


</body>
</html>