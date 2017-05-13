package com.game.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.game.dataBase.DaoMVC;

@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		
		
		
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		
		if(email.equalsIgnoreCase("cristina@bla") && password.equals("1234"))
		{
			 request.getRequestDispatcher("/WEB-INF/jsp/insertProduct.jsp").forward(request, response);
		}
		
			
		 try {
			    String dbEmail, dbPassword;
			    Connection conn = DaoMVC.connection();
		        Statement stmt = (Statement) conn.createStatement();
		        String query = "SELECT email, userPassword FROM registration WHERE email='" + email + "' AND userPassword='" + password + "';";
		        stmt.executeQuery(query);
	            ResultSet rs = stmt.getResultSet();
	         
	            while(rs.next()){
	                dbEmail = rs.getString("email");
	                dbPassword = rs.getString("userPassword");
	                System.out.println(dbEmail + " " + dbPassword);
	                if(email.equalsIgnoreCase(dbEmail) && password.equals(dbPassword)){
	                    System.out.println("OK");
	                    request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(request, response);
	                }
	                else {
	        			request.setAttribute("error", "Invalid email or password");
	        			request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
	        		}
	               
	            }
		   
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		
	}

}


