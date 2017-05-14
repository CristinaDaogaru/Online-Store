<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ page import="java.sql.*" %>
<%@ page import="com.game.dataBase.*" %>
  <style>
body {
	background-color: #444444;
}

table {
	background-color: white;
}

.descriere h5 {
	color: white;
}

hr {
	color: black;
	width: 100%;
	size: 100px;
}
@import url(//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css);

fieldset, label { margin: 0; padding: 0; }
body{ margin: 20px; }
h1 { font-size: 1.5em; margin: 10px; }

/****** Style Star Rating Widget *****/

.rating { 
  border: none;
  float: left;
}

.rating > input { display: none; } 
.rating > label:before { 
  margin: 5px;
  font-size: 1.25em;
  font-family: FontAwesome;
  display: inline-block;
  content: "\f005";
}

.rating > .half:before { 
  content: "\f089";
  position: absolute;
}

.rating > label { 
  color: #ddd; 
 float: right; 
}

/***** CSS Magic to Highlight Stars on Hover *****/

.rating > input:checked ~ label, /* show gold star when clicked */
.rating:not(:checked) > label:hover, /* hover current star */
.rating:not(:checked) > label:hover ~ label { color: #FFD700;  } /* hover previous stars in list */

.rating > input:checked + label:hover, /* hover current star when changing rating */
.rating > input:checked ~ label:hover,
.rating > label:hover ~ input:checked ~ label, /* lighten current selection */
.rating > input:checked ~ label:hover ~ label { color: #FFED85;  } 

</style>

</head>

<%
Connection conn = DaoMVC.connection();
Statement statement = conn.createStatement() ;
ResultSet resultset = statement.executeQuery("select * from produs ") ; 
%>
<body>

<%@include file="header.jsp" %>
<br><br><br><br><br><br>
<h1 style="text-align: center;color:white" >Product Name!!!!!!!!!!!</h1>
<br><br><br>
	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-6 text-left">
				<div class="imagineProdus">

   					<img src="http://3.bp.blogspot.com/-NCUItQJE_ms/T2tsj-IR-jI/AAAAAAAAAwM/JImx5n5xbJA/s1600/Angry+Birds+Space+Download.png">
    				</img>

			</div>
				<h2 style="color: white;">Detali Produs</h2>
				<p style="color:white;"> Multeeeeee detaliii pentru fiecare produs in parte</p>
			</div>
			<div class="col-sm-3 text-left">
				<h1 style="color:white;">Star Rating</h1>
				<fieldset class="rating">
				
					<input type="radio" id="star5" name="rating" value="5" /><label
						class="full" for="star5" title="Awesome - 5 stars"></label> 
					
					<input type="radio" id="star4" name="rating" value="4" /><label
						class="full" for="star4" title="Pretty good - 4 stars"></label> 
					
					 <input type="radio" id="star3" name="rating" value="3" /><label
						class="full" for="star3" title="Meh - 3 stars"></label>
					
					<input type="radio" id="star2" name="rating" value="2" /><label
						class="full" for="star2" title="Kinda bad - 2 stars"></label> 
					 
					<input type="radio" id="star1" name="rating" value="1" /><label
						class="full" for="star1" title="Sucks big time - 1 star"></label>
					
				</fieldset>
			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<button type="button" class="btn btn-primary btn-md"><span class="fa fa-cart-plus"style="font-size:20px"></span> Adauga In Cos</button>
					
				</div>
				<div class="well">
					<button type="button" class="btn btn-primary btn-md"><span class="fa fa-heart-o"style="font-size:20px"></span>Adauga La Favorite</button>
				</div>

			</div>
		</div>
		
		<div class="descriere">
			<h3>Produse asemanatoare:</h3>
			<br><br><br>
		<div class="row">
					<div class="col-md-3">
						<div class="thumbnail">
							<a href="/product" target="_blank"> <img
								src="https://static2.gamespot.com/uploads/screen_kubrick/1493/14930800/2412115-2204529282-tekke.jpg"
								alt="Lights" style="width: 100%">
								<div class="caption">
									<p>Tekken Tag Tournament 2</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-3">
						<div class="thumbnail">
							<a href="/product" target="_blank"> <img
								src="http://www.handy-games.com/wp-content/uploads/2015/11/handy-games-1944-burning-bridges-android-google-play-new-game-release-1280x720.jpg"
								alt="Nature" style="width: 100%">
								<div class="caption">
									<p>1944 Burning Bridges</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-3">
						<div class="thumbnail">
							<a href="/product" target="_blank"> <img
								src="http://www.handy-games.com/wp-content/uploads/2015/02/handy-games-1942-pacific-front-android-google-play-new-game-release-1280x720.jpg"
								alt="Fjords" style="width: 100%">
								<div class="caption">
									<p>Pacific Front</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-md-3">
						<div class="thumbnail">
							<a href="/product" target="_blank"> <img
								src="https://heavyeditorial.files.wordpress.com/2016/03/maxresdefault2.jpg?quality=65&strip=all"
								alt="Fjords" style="width: 100%">
								<div class="caption">
									<p>Stand Storm-Pirates Wars</p>
								</div>
							</a>
						</div>
					</div>
   			</div>
		</div>
	<br><br><br>
	<%@include file="footer.jsp"%>
</body>
</html>