package com.myjava.ocp.lab17.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 更新資料列
public class UpdateRecord {
    
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student WHERE name = 'school'");) {

            if(rs.last()) {
                rs.updateInt("age", 99);
                rs.updateRow(); // 加上此行才會更新，且只有更新資料才需要加此行，新增和刪除不需要
            }
            System.out.println("修改完成");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}