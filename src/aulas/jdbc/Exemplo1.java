package aulas.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

// https://www.mysql.com/products/connector/
// https://dev.mysql.com/downloads/connector/j/

public class Exemplo1 {
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
       
       // meio para script SQL
       Statement statement = null;
//       
//       // cria Statement para executar script SQL no banco de dados
       statement = connection.createStatement();
//       
//       // executa códio SQL no banco de dados
//        statement.execute("insert into usuario (id, nome, senha) values (14, null, '1414')");
//        statement.execute("insert into usuario (id, nome, senha) values (15, null, '1515')");
//        statement.execute("insert into usuario (id, nome, senha) values (16, null, '1616')");

        statement.execute("update usuario set nome = 'Usuario 15' where id = 15");
        statement.execute("delete from usuario where id = 13");
        
        // fechar o "script" SQL
        statement.close();
        
        // fechar a conexão
        connection.close();

    }
    
}