package aulas.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// https://www.mysql.com/products/connector/
// https://dev.mysql.com/downloads/connector/j/

public class Exemplo4 {
    
    public static void main(String[] args) throws SQLException {

        // URL do banco de dados 
        String DATABASE_URL = "jdbc:mysql://localhost:3307/sgcm?allowMultiQueries=true";
        // usuário
        String USER = "root";
        // senha
        String PASS = "root";

        // gerencia a conexão
        Connection connection = null;

        // estabelece uma conexão com o banco de dados
        connection = DriverManager.getConnection( DATABASE_URL, USER, PASS );
        System.out.println( connection );

        // meio para script SQL
        Statement statement = null;

        // cria Statement para executar script SQL no banco de dados
        statement = connection.createStatement();
        
        // pegar um id informado do usuário
        String id = JOptionPane.showInputDialog("Informe o id (número inteiro):");
        System.out.println(id);    
        
        String sql = "update usuario set senha = 'abacaxi' where id = " + id;
        System.out.println(sql);
        
        // fechar o "script" SQL
        statement.close();

        // fechar a conexão
        connection.close();
        
    }
    
}