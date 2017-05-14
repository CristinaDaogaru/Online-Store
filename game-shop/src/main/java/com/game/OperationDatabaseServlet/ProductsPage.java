package com.game.OperationDatabaseServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.dataBase.DaoMVC;
import com.game.model.ProductModel;

@WebServlet(urlPatterns="/productPage")
public class ProductsPage extends HttpServlet {
	public static String radio;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = "select * from product";
		Connection conn = DaoMVC.connection();
		Statement st;
		ArrayList<ProductModel> result = new ArrayList<ProductModel>();
		
		
        try {
        	st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				ProductModel product = new ProductModel();
				product.setImg(rs.getString(11));
				product.setName(rs.getString(2));
				product.setPrice(rs.getString(5));
				result.add(product);
				
			}
			request.setAttribute("products", result);
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/productPage.jsp");
            view.forward(request, response);
            conn.close();
            System.out.println("conexiune inchisa " + result.get(0).getName());
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String price = request.getParameter("price");
		String brand = request.getParameter("brand");
		String age = request.getParameter("age");
		String categ = request.getParameter("categ");
		
		String orderBy = request.getParameter("orderBy");
		
		String query;
	
		if(price!=null && brand == null && age==null && categ==null )
			query = "select * from product where Price between " + price;
		
		else if(brand!=null && price == null && age==null && categ==null )
			query = "select * from product where Brand = \'" + brand + "\'";
		
		else if(age!=null && brand == null && price==null && categ==null )
			query = "select * from product where YearCateg between " + age;
		
		else if(categ!=null && brand == null && price==null && age==null )
			query = "select * from product where Genres =\'" + categ + "\'";
		else if( orderBy !=null)
			query = "select * from product order by " + orderBy ;
		else
			query = "select * from product";
		
		
		
		Connection conn = DaoMVC.connection();
		Statement st;
		ArrayList<ProductModel> result = new ArrayList<ProductModel>();
		
		
        try {
        	st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				ProductModel product = new ProductModel();
				product.setImg(rs.getString(11));
				product.setName(rs.getString(2));
				product.setPrice(rs.getString(5));
				result.add(product);
				
			}
			if(result.size()==0)
			{
				request.setAttribute("errorFilter", "Nu exista produsele cautate");
				doGet(request, response);
			}
			else{
				request.setAttribute("products", result);
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/jsp/productPage.jsp");
				view.forward(request, response);
				conn.close();
				System.out.println("conexiune inchisa " + result.get(0).getName());
			}
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	
}
