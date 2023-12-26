package com.mycompany.ejercicio1;

import java.sql.*;

/**
 *
 * @author Alfonso Márquez Gil
 */
public class Main
{

    static final String URL = "jdbc:mysql://localhost:3306/universidad";
    static final String USUARIO = "usuario";
    static final String PASSWORD = "1234";
    

    public static void main(String[] args)
    {
         
       try{
            Connection conexion = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            Statement statement = conexion.createStatement();
            ResultSet rs;
            String sql;
            
            
            sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('Alfonso', 25, 9.0)";
            statement.executeUpdate(sql);
            
            
            sql = "SELECT * FROM estudiantes";
            rs = statement.executeQuery(sql);
            
            while (rs.next()) {
               int id = rs.getInt("id");
               String nombre = rs.getString("nombre");
               int edad = rs.getInt("edad");
               double calificacion = rs.getDouble("calificacion");

               System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificacion: " + calificacion);
           }
            
            
            
            rs.close();
            statement.close();
            conexion.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
