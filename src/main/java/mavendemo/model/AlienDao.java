package mavendemo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mavendemo.pojo.Alien;

public class AlienDao {
	
	public static Alien getAlien(int id){
		System.out.println("Alien:getAlien "+id);
		Alien a = new Alien();
		String query= "select * from alien where id=? ";
		Connection con = null;
		PreparedStatement ps= null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//jdbc:mysql://localhost:3306/mysqljdbc"
			System.out.println("Driver REgistered"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?autoReconnect=true&useSSL=false","root","root");
			System.out.println("Connection established"+con);
			ps = con.prepareStatement(query);
			ps.setInt(1,id);
			ResultSet rs =ps.executeQuery();
			System.out.println(rs);
			if(rs.next()){
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setTech(rs.getString("tech"));
			}
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			try {
				if(con != null)
				con.close();
				if(ps!=null)
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		System.out.println("last"+a);
		return a;
	}

}
