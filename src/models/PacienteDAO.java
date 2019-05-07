package models;

import db.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PacienteDAO {
    Conexao conex = new Conexao();
    
    public void inserirPaciente (Paciente paciente) {
        String sql = "INSERT INTO paciente VALUES (DEFAULT,?,?,?,?)";
        conex.conectar();
        try {
            PreparedStatement psmt = conex.con.prepareStatement(sql);
            psmt.setString(1, paciente.getRg());
            psmt.setString(2, paciente.getNome());
            psmt.setString(3, paciente.getNasc());
            psmt.setString(4, paciente.getCidade());
            psmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu erro!" + e);
            System.out.println(e);
        } finally {
            conex.desconectar();
        }
    }
}
