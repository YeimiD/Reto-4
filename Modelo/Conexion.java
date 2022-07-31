package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Atributo tipo conexion
    Connection connection;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String urlConexion = "jdbc:mysql://localhost:3306/reto1_g54_db";

    //Añadimos el constructor sin argumentos
    public Conexion() {
        //Inicializamos la variable connection 
        try {
            Class.forName(driver);
            connection = (Connection)DriverManager.getConnection(urlConexion, user, password);
            if (connection != null) {
                System.out.println("Conexion exitosa con la base de datos");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion" + e);
        }

    }
    
    public void finalizarConexion(){
        if(connection != null){
            try{
                connection.close();
                connection = null;
            }catch(SQLException e){
                System.out.println(e.getMessage() +". >>> Error de Desconexion!!");
                
            }
        }
    }
    
    public Connection getConnection(){
        return connection;
    }

}
