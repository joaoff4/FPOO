package streaming.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import streaming.controller.ConexaoBD;
import streaming.model.Filme;


public class Crud {
	//CREATE
	public void create(Filme filme) {
		String sql = "INSERT INTO filmes(numero, nome, classificacao) VALUES (?, ?, ?)";
		Connection conn = null;
		PreparedStatement p = null;
		try {
		conn = ConexaoBD.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql);
		p.setInt(1, filme.getNumero()); 
		p.setString(2, filme.getNome());
		p.setString(3, filme.getClassi());
		p.execute();
		}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Erro ao inserir filme! \nERRO: " + e);
		}finally {
		try {
		if(p != null)
		p.close();
		} catch(Exception e) {
		e.printStackTrace();
		}
		}
		}
	//UPDATE
		public void update(Filme filme) {
		String sql = "UPDATE filmes SET nome = ?, classificacao = ? WHERE numero = ?" ;
		Connection conn = null;
		PreparedStatement p = null; 
		try {
			conn = ConexaoBD.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setString(1, filme.getNome());
			p.setString(2, filme.getClassi());
			p.setInt(3, filme.getNumero()); 
			p.execute();
		JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso!");
		}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
		}finally {
		try {
		if(p != null)
		p.close();
		} catch(Exception e) {
		e.printStackTrace();
		}
		}
		}
		//R - READ
		public List<Filme> read() {
		String sql = "SELECT * FROM filmes";
		List<Filme> Filme = new ArrayList<Filme>();
		Connection conn = null;
		PreparedStatement p = null;
		ResultSet resultado = null;
		try {
		conn = ConexaoBD.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql);
		resultado = p.executeQuery();
		while(resultado.next()) {
		Filme ver_Filme = new Filme();
		ver_Filme.setNumero(resultado.getInt("numero"));
		ver_Filme.setNome(resultado.getString("nome"));
		ver_Filme.setClassi(resultado.getString("classificacao"));
		//adicionar na lista de filmes
		Filme.add(ver_Filme);
		}
		}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
		}finally {
		try {
		if(p != null)
		p.close();
		} catch(Exception e) {
		e.printStackTrace();
		}
		}
		return Filme;
		}
		//D - DELETE
		public boolean delete(int numero) {
		String sql = "DELETE FROM filmes WHERE numero = ?";
		Connection conn = null;
		PreparedStatement p = null;
		try {
		conn = ConexaoBD.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql);//cast
		p.setInt(1, numero);
		p.execute();
		JOptionPane.showMessageDialog(null, "Filme excluido com sucesso!");
		}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
		}finally {
		try {
		if(p != null)
		p.close();
		} catch(Exception e) {
		e.printStackTrace();
		}
		}
		return false;
		}
}
