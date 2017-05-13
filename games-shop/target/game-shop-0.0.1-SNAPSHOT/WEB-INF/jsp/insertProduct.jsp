<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Insert Product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h1 style="text-align:center;"> Add Product  </h1>
<br><br><br><br>
<div class="container">
 
  <form class="form-horizontal" action="/insert" method="post">
   
    <div class="form-group">
      <label class="control-label col-sm-2" for="ProductId">Product Id:</label>
      <div class="col-sm-10">          
        <input type="ProductId" class="form-control" id="ProductId" placeholder="Product Id" name="ProductId">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="name">Name:</label>
      <div class="col-sm-10">          
        <input type="name" class="form-control" id="name" placeholder="Name" name="name">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="price">Price:</label>
      <div class="col-sm-10">          
        <input type="price" class="form-control" id="price" placeholder="Price" name="price">
      </div>
    </div>
    
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="Brand">Brand:</label>
      <div class="col-sm-10">          
        <input type="Brand" class="form-control" id="Brand" placeholder="Brand" name="Brand">
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="Details">Details:</label>
      <div class="col-sm-10">          
        <input type="Details" class="form-control" id="Details" placeholder="Details" name="Details">
      </div>
    </div>
    
      <div class="form-group">
      <label class="control-label col-sm-2" for="Rating">Rating:</label>
      <div class="col-sm-10">          
        <input type="Rating" class="form-control" id="Rating" placeholder="Rating" name="Rating">
      </div>
    </div>
    
      <div class="form-group">
      <label class="control-label col-sm-2" for="YearAp">Year:</label>
      <div class="col-sm-10">          
        <input type="YearAp" class="form-control" id="YearAp" placeholder="YearAp" name="YearAp">
      </div>
    </div>
    
    
      <div class="form-group">
      <label class="control-label col-sm-2" for="Genres">Genres:</label>
      <div class="col-sm-10">          
        <input type="Genres" class="form-control" id="Genres" placeholder="Genres" name="Genres">
      </div>
     </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="Stoc">Stoc:</label>
      <div class="col-sm-10">          
        <input type="Stoc" class="form-control" id="Stoc" placeholder="Stoc" name="Stoc">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="YearCateg">Year Category:</label>
      <div class="col-sm-10">          
        <input type="YearCateg" class="form-control" id="YearCateg" placeholder="YearCateg" name="Year Categ">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="Img">Image:</label>
      <div class="col-sm-10">          
        <input type="Img" class="form-control" id="Img" placeholder="Image" name="Img">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>