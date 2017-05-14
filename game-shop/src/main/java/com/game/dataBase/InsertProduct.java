package com.game.dataBase;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

import com.game.model.ProductModel;

public class InsertProduct {

	static Connection conn = DaoMVC.connection();

	public static int insertProduct(ProductModel product, String sql) {

		int i = 0;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  product.getIdProduct());
			ps.setString(2,  product.getName());
			ps.setString(3,  product.getBrand());
			ps.setString(4,  product.getDetails());
			ps.setString(5,  product.getPrice());
			ps.setString(6,  product.getRating());
			ps.setString(7,  product.getYearAp());
			ps.setString(8,  product.getGenres());
			ps.setString(9,  product.getStoc());
			ps.setString(10, product.getYearCateg());
			ps.setString(11, product.getImg());
			i = ps.executeUpdate();
			//conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

}
