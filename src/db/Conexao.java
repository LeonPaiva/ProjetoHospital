package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    private String caminho = "jdbc:mysql://localhost:3306/hospital";
    private String driver = "com.mysql.jdbc.Driver";
    private String usuario = "root";
    private String senha = "";
    
    public void conectar() {
        try {
            System.setProperty("jdbc.Driver", driver);
            con = DriverManager.getConnection(caminho,usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel abrir conexão! " + ex);
        }
    }
    
    public void executarSQL(String sql){
        try {
            stmt = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao execultar a query: " + ex);
        }
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: " + ex);
        }
    }
    
}
