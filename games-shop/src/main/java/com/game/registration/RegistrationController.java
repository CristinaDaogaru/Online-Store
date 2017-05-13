package com.game.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.dataBase.DaoMVC;
import com.game.model.RegistrationModel;


@WebServlet("/registration")
public class RegistrationController extends HttpServlet {

	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		
		String username = request.getParameter("username");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
	
		
		RegistrationModel registrModel = new RegistrationModel();
		
		registrModel.setUsername(username);
		registrModel.setFname(fname);
		registrModel.setLname(lname);
		registrModel.setEmail(email);
		registrModel.setPassword(password);
		
		
		
		String sql = "insert into registration(username,fname,lname,email,userPassword) values(?,?,?,?,?);";
		
		int i = DaoMVC.registerUser(registrModel,sql);
		
		if(i!=0)
		{
			System.out.println("value inserted");
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		}
		else
		{
			System.out.println("value not inserted");
		}


		
				
	}
	

}