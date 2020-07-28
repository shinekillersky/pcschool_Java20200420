package com.myjava.ocp.lab17.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 刪除資料列
public class DeleteRecord {
    
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student WHERE name = 'pcschool'");) {
            
            if(rs.last()) {
                rs.deleteRow();
            }
            System.out.println("刪除完成");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}