package aulas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

// https://www.mysql.com/products/connector/
// https://dev.mysql.com/downloads/connector/j/

public class Exemplo3 {
    public static void main(String[] args) throws SQLException {
        
        // URL do banco de dados 
        String DATABASE_URL = "jdbc:mysql://localhost:3307/sgcm";
        // usuário
        String USER = "root";
        // senha
        String PASS = "root";

        // gerencia a conexão
        Connection connection = null;

        // estabelece uma conexão com o banco de dados
        connection = DriverManager.getConnection( DATABASE_URL, USER, PASS );
        System.out.println( connection );

        // meio para script SQL padronizado
        String sql = "update usuario set senha = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setInt(2, 14);
        preparedStatement.setString(1, "5555");
        System.out.println( preparedStatement );

        // executa códio SQL no banco de dados
        preparedStatement.execute();

        // fechar o "script" SQL
        preparedStatement.close();

        // fechar a conexão
        connection.close();
       
    }
    
}