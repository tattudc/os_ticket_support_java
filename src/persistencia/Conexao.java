package persistencia;

/**
 *
 * @author Neto 
 */
import java.sql.*; //importa todas as classes da api java.sql

/**
 * CLASSE QUE CONFIGURA A CONEXAO COM O BANCO DE DADOS 
 *
 */
public class Conexao {
	//ATRIBUTOS DA CLASSE
	private static final String USUARIO = "root";	
	private static final String SENHA = "sd96n2aa";
	private static final String CAMINHO = "jdbc:mysql://127.0.0.1:3306/os_ticket";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private Connection conexao;		
	
	//METODO QUE EFETUA A CONEXAO COM O BANCO DE DADOS
	public void conecta() {
		try {
			Class.forName(DRIVER); //Carrega o driver (inicializa um objeto da classe org.postgresql.Driver) 
			conexao = DriverManager.getConnection(CAMINHO, USUARIO,SENHA); //Cria a conexao
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e);
		}
	}

	//METODO QUE DESCONECTA O BANCO DE DADOS
	public void desconecta() {
		try {
			conexao.close();//fecha a conexao
		} catch (SQLException ex) {
			System.err.println(ex);
		}
	}

	public Connection getConexao() {
		return conexao;
	}
		
}