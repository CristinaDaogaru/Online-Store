<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@page import="com.game.model.ProductModel"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.game.OperationDatabaseServlet.ProductsPage"%>

<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/css/bootstrap-select.min.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/js/bootstrap-select.min.js"></script>
<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'>
</script>
<%@ page import="java.sql.*" %>
<%@ page import="com.game.dataBase.*" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
		<%@include file="products.css" %>
</style> 
</head>

<body data-spy="scroll" data-target=".navbar" data-offset="50">

<%@include file="header.jsp" %>
<br><br><br><br>


<script type='text/javascript'>
$(document).ready(function() { 
	   $('input[name="radio"]').on('change', function(){
		   var pret = $('input[name="radio"]').val();
		   
		 });
	  });
$(document).ready(function() {
    $("button").click(function(){
        var op = [];
        $.each($(".selectpicker option:selected"), function(){            
            op.push($(this).val());
        });
       
    });
});
</script>

	

<% 
if (request.getAttribute("products") != null) {
	ArrayList<ProductModel> product =  (ArrayList)request.getAttribute("products");
%>

<div class="container-fluid text-center">
	<div class="row content">
		<div class="col-sm-2 sidenav">
			<div class="containerFilter">
				<h3>Filtrare dupa</h3>

				<h4 style="color:white;">Pret</h4>
				<form action="/productPage" method="post">
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="price" value="0 and 100" />Sub 100
							LEI</label>
					</div>
					
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="price" value="100 and 500" />100-500
							LEI</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="price" value="500 and 700" />500-700
							LEI</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="price" value="700 and 1000" />700-1000
							LEI</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="price" value="1000 and 2000" />1000-2000
							LEI</label>
					</div>
					
				</form>

				<br>
				<h4 style="color:white;">Brand</h4>
				<form action="/productPage" method="post">
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="brand" value="Ubisoft" />Ubisoft</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="brand" value="Nintendo" />Nintendo</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="brand" value="Rockstar" />Rockstar</label>
					</div> 
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="brand" value="Valve" />Valve</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="brand" value="EA" />EA</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="brand" value="Blizzard" />Blizzard</label>
					</div>
				</form>

				<br>
				<h4 style="color:white;">Varsta</h4>
				<form action="/productPage" method="post">
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="age" value="0 and 3" />Sub 3
							ani</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="age" value="3 and 6" />3-6
							ani</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="age" value="6 and 12" />6-12
							ani</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="age" value="12 and 18" />12-18
							ani</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="age" value="18 and 100" />Peste
							18 ani </label>
					</div>

				</form>
				<br>
				<h4 style="color:white;">Categorie</h4>
				<form action="/productPage" method="post">
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="Actiune" />Actiune</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="Aventura" />Aventura</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="Curse" />Curse</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="Puzzle" />Puzzle</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="Strategie" />Strategie</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="Sport" />Sport</label>
					</div>
					<div class="radio">
						<label style="color:white;"><input onChange='this.form.submit();' type="radio" name="categ" value="FPS" />FPS</label>
					</div>

				</form>
			</div>
		</div>

		<div class="col-sm-8 text-left">

			<div class="container">
				<div class="well">
				<form action="/productPage" method="post">
					<select id="dataCombo" class="selectpicker"  name = "orderBy" onChange='this.form.submit();' ">
						<option selected disabled>Ordoneaza dupa : </option>
						<option value="Name">Alfabetic</option>
						<option value="YearAp">Cele mai noi</option>
						<option value="Price ASC">Pret crescator</option>
						<option value="Price DESC">Pret descrescator</option>
					</select>
					
					
					</form>
				</div>
				<br>
				<div class="row">
				<% for(int i=0 ; i<product.size();i++){ %>
						
					<div class="col-md-4">
						<div class="thumbnail">
								<a href="/product" target="_blank">
								
									<img src=<%= product.get(i).getImg()%> alt="Lights" style="width: 100%">
										<div class="caption">
											<p><%=product.get(i).getName()%></p>
										</div>
										<div class="caption">
											<p> <%=product.get(i).getPrice()%> </p>
										</div>
								</a>
						</div>
							
					</div>
				<%}}%>
				
				
				</div>
			</div>
		</div>
	</div>
	</div>
<br><br>

<%@include file="footer.jsp" %>

</body>
</html>