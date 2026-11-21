package aulas.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

// https://www.mysql.com/products/connector/
// https://dev.mysql.com/downloads/connector/j/

public class Exemplo2 {
    
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

        // cria Statement para executar script SQL no banco de dados
        statement = connection.createStatement();

        // gerencia resultados
        ResultSet resultSet = null; 

        // executa o script SQL de consulta  no banco de dados
        resultSet = statement.executeQuery( "select id as ID, nome as Nome from usuario" );

        // processa os resultados da consulta

        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
        
        // 1 to <=
        for(int i = 1; i <= numberOfColumns; i++) {
             System.out.print( metaData.getColumnLabel( i ) + " " );
        }
        System.out.println("");
        
        // 1 to <=
        while( resultSet.next() ) {
            for(int i = 1; i <= numberOfColumns; i++) {
                System.out.print( resultSet.getObject( i ) + " " );
            }
            System.out.println("");
        }

        // fechar os "resultados" da consulta SQL
        resultSet.close();

        // fechar o "script" SQL
        statement.close();

        // fechar a conexão
        connection.close();
        
    }
    
}
