package db;

import javax.sql.DataSource;

import model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class ItemDBUtil {
	
	private DataSource dataSource;
	
	public ItemDBUtil(DataSource datasource) {
		this.dataSource = datasource;
	}
	
	
	
	public void insertItem(String itemName) throws Exception
	{
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		//String iName = itemName;
		
		try {
			
			conn =  this.dataSource.getConnection();
			
			String sql = String.format("INSERT INTO items (itemName) VALUES('%s')",itemName);
			
			stmt = conn.createStatement();
			
			stmt.executeUpdate(sql);
			
		} finally {
			// TODO: handle finally clause
			close(conn,stmt,pstmt,res);
		}
	}
	
	public void deleteItem(int itemId) throws Exception
	{
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
	try {
			
			conn =  this.dataSource.getConnection();
			
			String sql = String.format("DELETE from items where itemId = ?");
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, itemId);
			
			pstmt.executeUpdate();
			
		} finally {
			// TODO: handle finally clause
			close(conn,stmt,pstmt,res);
		}
		
	}
	
	
	public ArrayList<Item> getItems() throws Exception
	{
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		ArrayList<Item> list = new ArrayList<Item>();
		
		//String iName = itemName;
		
		try {
			
			conn =  this.dataSource.getConnection();
			
			String sql = String.format("SELECT * FROM items");
			
			stmt = conn.createStatement();
			
			res = stmt.executeQuery(sql);
			
			while(res.next()) {
				
				int id = res.getInt("itemId");
				
				String itemName = res.getString("itemName"); 
				
				//System.out.println(itemName);
				
				list.add(new Item(id,itemName));
				

			}
		
			
		} finally {
			// TODO: handle finally clause
			close(conn,stmt,pstmt,res);
		}
		
		return list;
	}
		
		private void close(Connection conn, Statement stmt, PreparedStatement pstmt, ResultSet res) {
			
			try {
				
				if(conn != null){				
					conn.close();
				}
				
				if(stmt != null) {				
					stmt.close();
				}
				
				if(pstmt != null) {				
					pstmt.close();
				}
				
				if(res != null) {				
					res.close();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
		}
		
}



