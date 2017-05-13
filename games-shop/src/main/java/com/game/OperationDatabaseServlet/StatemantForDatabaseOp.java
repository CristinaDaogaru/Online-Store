package com.game.OperationDatabaseServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.game.dataBase.DaoMVC;
import com.game.model.ProductModel;

@WebServlet("/viewResult")
public class StatemantForDatabaseOp extends HttpServlet {

	public static String val;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		val = request.getParameter("radio");
	}

	public static String query() {

		String query;

	
		if (val == null) {
			query = "select Img,Name,Price from produs";
		} else
			query = "select Img,Name,Price from produs where Price between " + val;
		
		
		return query;

	}
}
