/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cassi
 */
public class ContatoConnection {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/contato";
    
    public static Connection createConnectionToMysql() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        
        Connection con = createConnectionToMysql();
        
        if(con!=null){
            System.out.println("Conexão obtida com sucesso");
            con.close();
        }else{
            System.out.println("Conexão Recusada");
            con.close();
        }
        
    }
    
}
