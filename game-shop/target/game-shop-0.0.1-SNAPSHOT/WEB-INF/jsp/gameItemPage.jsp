<%@page import="com.game.OperationDatabaseServlet.StatemantForDatabaseOp"%>
<%@page import="com.game.servlet.PageController"%>
<%@page import="com.game.OperationDatabaseServlet.GetRadioButtonValue"%>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/css/bootstrap-select.min.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/js/bootstrap-select.min.js"></script>
<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'>
</script>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import = "com.game.model.ProductModel" %>
<%@ page import="com.game.dataBase.*" %>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
	.container {
		margin-left: 300px;
	}
	.well{
		border: 1px solid black;
   		margin-top: 100px;
    	margin-bottom: 100px;
    	margin-right: 150px;
    	margin-left: 80px;
    	background-color: lightblue;
	}

}
h4{
color:white

}
label{
	color:white

}
</style>
<% ArrayList<ProductModel> result  = new ArrayList<ProductModel>(); 
   
%>
<script type='text/javascript'>
$(document).ready(function() { 
	   $('input[name="radio"]').on('change', function(){
		   var pret = $('input[name="radio"]').val();
		 });
	  });

</script>

<div class="container-fluid text-center">
	<div class="row content">
		<div class="col-sm-2 sidenav">
			<div class="containerFilter">
				<h3>Filtrare dupa</h3>

				<h4>Pret</h4>
				<form>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="<% result = StatemantForDatabaseOp.queryExForProd(0, 100);%>" />Sub 100
							LEI</label>
					</div>
					
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="<% result = StatemantForDatabaseOp.queryExForProd(100, 500);%>"/>100-500
							LEI</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="<% result = StatemantForDatabaseOp.queryExForProd(500,700);%>" />500-700
							LEI</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="<% result = StatemantForDatabaseOp.queryExForProd(700,1000);%>" />700-1000
							LEI</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="<% result = StatemantForDatabaseOp.queryExForProd(1000,2000);%>" />1000-2000
							LEI</label>
					</div>
					
				</form>

				<br>
				<h4>Brand</h4>
				<form>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="1" />Ubisoft</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="2" />Nintendo</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="3" />Rockstar</label>
					</div> 
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="4" />Valve</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="5" />EA</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="6" />Blizzard</label>
					</div>
				</form>

				<br>
				<h4>Varsta</h4>
				<form>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="1" />Sub 3
							ani</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="2" />3-6
							ani</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="3" />6-12
							ani</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="4" />12-18
							ani</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="5" />Peste
							18 ani </label>
					</div>

				</form>
				<br>
				<h4>Categorie</h4>
				<form>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="1" />Actiune</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="2" />Aventura</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="" />Curse</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="" />Puzzle</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="" />Strategie</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="" />Sport</label>
					</div>
					<div class="radio">
						<label><input onChange='this.form.submit();' type="radio" name="radio" value="" />FPS</label>
					</div>

				</form>
			</div>
		</div>

		<div class="col-sm-8 text-left">

			<div class="container">
				<div class="well">
					<select id="dataCombo" class="selectpicker" >
						<option selected disabled>Ordoneaza dupa : </option>
						<option value="one">Alfabetic</option>
						<option value="two">Cele mai noi</option>
						<option value="three">Pret crescator</option>
						<option value="four">Pret descrescator/option>
					</select>
				</div>
				<br>
				<div class="row">
						 <%for(int index = 0;index<result.size();index++ ){ %>
							<div class="col-md-4">
								<div class="thumbnail">
									<a href="/product" target="_blank"> <img
										src="<%result.get(index).getImg(); %>"
										alt="Lights" style="width: 100%">
										<div class="caption">
											<p> result.get(index).getName(); </p>
										</div>
										<div class="caption">
											<p> result.get(index).getPrice(); </p>
										</div>
									</a>
								</div>
							</div>
							<%} %>

				</div>
			</div>
		</div>
	</div>
	</div>