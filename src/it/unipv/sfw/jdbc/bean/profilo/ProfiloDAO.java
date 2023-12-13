package it.unipv.sfw.jdbc.bean.profilo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import it.unipv.sfw.jdbc.ConnessioneDB;
import it.unipv.sfw.model.persona.TipoAccount;

public class ProfiloDAO implements IProfiloDAO {
	private Connection conn;

	public ProfiloDAO() {
	}

	@Override
	public ArrayList<ProfiloDB> selectAllProfili() {
		ArrayList<ProfiloDB> accounts = new ArrayList<>();
		conn = ConnessioneDB.startConnection(conn, "albergo");
		Statement st1;
		ResultSet rs1;
		
		try {
			st1 = conn.createStatement();
			String query = "SELECT * FROM user";
			rs1 = st1.executeQuery(query);
			
			while(rs1.next()) {
				ProfiloDB a = new ProfiloDB(rs1.getInt("ID_USER"), rs1.getString("CF"),
						rs1.getString("NOME"), rs1.getString("COGNOME"), rs1.getString("DATA_NASCITA"), rs1.getString("CELLULARE"),
						 rs1.getString("INDIRIZZO"), rs1.getString("CITTA"), rs1.getString("PROVINCIA"),
						rs1.getString("CAP"), rs1.getString("EMAIL"), rs1.getString("USERNAME"), rs1.getString("PASSWORD"),
						rs1.getString("ID_TIPO"));
				accounts.add(a);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		ConnessioneDB.closeConnection(conn);
		
		return accounts;
	}

	@Override
	public ArrayList<ProfiloDB> selectAllDipendenti() {
		// TODO Auto-generated method stub
		ArrayList<ProfiloDB> dipendenti = new ArrayList<>();

		conn = ConnessioneDB.startConnection(conn, "albergo");
		Statement st1;
		ResultSet rs1;
		
		try {
			st1 = conn.createStatement();
			String query = "SELECT * FROM USER WHERE ID_TIPO = '2'";
			rs1 = st1.executeQuery(query);
			
			while(rs1.next()) {
				ProfiloDB a = new ProfiloDB(rs1.getInt("ID_USER"), rs1.getString("CF"),
						rs1.getString("NOME"), rs1.getString("COGNOME"), rs1.getString("DATA_NASCITA"), rs1.getString("CELL"),
						 rs1.getString("VIA"), rs1.getString("CITTA"), rs1.getString("PROVINCIA"),
						rs1.getString("CAP"), rs1.getString("EMAIL"), rs1.getString("USERNAME"), rs1.getString("PASSWORD"),
						rs1.getString("ID_TIPO"));
				dipendenti.add(a);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		ConnessioneDB.closeConnection(conn);
		return dipendenti;
	}

	
	@Override 
	public ArrayList<ProfiloDB> selectAllClienti() {
		// TODO Auto-generated method stub
		ArrayList<ProfiloDB> clienti = new ArrayList<>();
		conn = ConnessioneDB.startConnection(conn, "albergo");
		Statement st1;
		ResultSet rs1;
		
		try {
			st1 = conn.createStatement();
			String query = "SELECT * FROM USER WHERE ID_TIPO = '1'";
			rs1 = st1.executeQuery(query);
			
			while(rs1.next()) {
				ProfiloDB a = new ProfiloDB(rs1.getInt("ID_USER"), rs1.getString("CF"),
						rs1.getString("NOME"), rs1.getString("COGNOME"), rs1.getString("DATA_NASCITA"), rs1.getString("CELL"),
						 rs1.getString("VIA"), rs1.getString("CITTA"), rs1.getString("PROVINCIA"),
						rs1.getString("CAP"), rs1.getString("EMAIL"), rs1.getString("USERNAME"), rs1.getString("PASSWORD"),
						rs1.getString("ID_TIPO"));
				clienti.add(a);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		ConnessioneDB.closeConnection(conn);
		
		return clienti;
	}
	
	@Override
	public ProfiloDB selectProfiloByUsername(String username, TipoAccount tipo) {
		// TODO Auto-generated method stub
		ProfiloDB prof = null;
		
					conn = ConnessioneDB.startConnection(conn, "albergo");
					PreparedStatement ps1;
					ResultSet rs1;
		
					
					try {
						String query= "SELECT * from user WHERE USERNAME = ? and ID_TIPO=?";
						ps1 = conn.prepareStatement(query);
						ps1.setString(1, username);
						ps1.setString(2, tipo.toString());
						rs1 = ps1.executeQuery();
						
						while (rs1.next()) {
							 prof= new ProfiloDB(rs1.getInt("ID_USER"), rs1.getString("CF"),
										rs1.getString("NOME"), rs1.getString("COGNOME"), rs1.getString("DATA_NASCITA"), rs1.getString("CELL"),
										 rs1.getString("VIA"), rs1.getString("CITTA"), rs1.getString("PROVINCIA"),
										rs1.getString("CAP"), rs1.getString("EMAIL"), rs1.getString("USERNAME"), rs1.getString("PASSWORD"),
										rs1.getString("ID_TIPO"));
						}
					}
					catch(Exception e){
						e.printStackTrace();
					}
					
					ConnessioneDB.closeConnection(conn);
					return prof;
	}

}

