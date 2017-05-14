<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>


<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/css/bootstrap-select.min.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/js/bootstrap-select.min.js"></script>
<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
		 .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  .carousel-inner img {
      
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
 
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }

  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  #JoinUs
{
    font-size: 170%;

    position: absolute;
    top: 70%;
    left: 60%;

    transition: .5s ease;
}
	body{
		background-color:#413a54;
	}

</style>
</head>

<body data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/welcomeAfterLogin">Jocuri Pentru Toti</a>
    </div>
    <ul class="nav navbar-nav">
  		<li><a href="/welcomeAfterLogin"><span class="glyphicon glyphicon-home"style="font-size:20px"></span> Home </a></li>
       
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


<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="https://www.gameogre.com/wp-content/uploads/2016/08/Space-Engineers.jpg" alt="New York" width="1200" height="700">
         
      </div>

      <div class="item">
        <img src="http://www.pennapowers.com/mainsite/wp-content/uploads/2015/04/20150313020809a0e1jzsc8j72jbja.jpg" alt="Chicago" width="1200" height="700">
              
      </div>
    
      <div class="item">
        <img src="https://i.ytimg.com/vi/vwiBxn6AgTw/maxresdefault.jpg" alt="Los Angeles" width="1200" height="700">
           
      </div>
      
       <div class="item">
        <img src="http://www.whatsageek.com/wp-content/uploads/2015/04/maxresdefault.jpg" alt="Los Angeles" width="1200" height="700">
           
      </div>
      <div class="JoinUS">
      <form action = "/welcome" method="post">
<!--         <a href="/welcome"> -->
          <button class="btn btn-danger navbar-btn" id="JoinUs">
            <span class="glyphicon glyphicon"></span> <b>See our products -></b>
          </button>
<!--         </a> -->

      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
<br><br><br><br>
<%@include file="footer.jsp" %>

</body>
</html>