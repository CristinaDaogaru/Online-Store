
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
  </style>


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
      <form action = "/productPage" method="post">
<!--         <a href="/productPage"> -->
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



 






