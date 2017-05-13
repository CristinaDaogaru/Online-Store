package com.game.OperationDatabaseServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.dataBase.DaoMVC;
import com.game.dataBase.InsertProduct;
import com.game.model.ProductModel;

@WebServlet("/insert")
public class ProductOp extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String idProduct = request.getParameter("ProductId");
		 String name = request.getParameter("name");
		 String brand = request.getParameter("Brand");
		 String details = request.getParameter("Details");
		 String price = request.getParameter("price");
		 String rating = request.getParameter("Rating");
		 String yearAp = request.getParameter("YearAp");
		 String genres = request.getParameter("Genres");
		 String stoc = request.getParameter("Stoc");
		 String yearCateg = request.getParameter("YearCateg");
		 String img = request.getParameter("Img");
		 
		 ProductModel product = new ProductModel();
		 
		 product.setIdProduct(idProduct);
		 product.setName(name);
		 product.setBrand(brand);
		 product.setDetails(details);
		 product.setPrice(price);
		 product.setRating(rating);
		 product.setYearAp(yearAp);
		 product.setGenres(genres);
		 product.setStoc(stoc);
		 product.setYearCateg(yearCateg);
		 product.setImg(img);
		 
		 String sql = "insert into produs(productId,Name,Brand,Details,Price,Rating,YearAp,Genres,Stoc,YearCateg,Img) values(?,?,?,?,?,?,?,?,?,?,?);";
			
			int i = InsertProduct.insertProduct(product, sql);
			
			if(i!=0)
			{
				System.out.println("value inserted");
				request.getRequestDispatcher("/WEB-INF/jsp/insertProduct.jsp").forward(request, response);
			}
			else
			{
				System.out.println("value not inserted");
			}

	}
}
