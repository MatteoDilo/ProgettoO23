package it.unipv.sfw.model.persona;

import javax.security.auth.login.LoginException;

public abstract class Account implements IAccount {
	private int id_user;
	private String cf;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String cellulare;
	private String indirizzo;
	private String citta;	
	private String provincia;
	private String cap;
	private String eMail;
	private String username;
	private String pw;
	private TipoAccount tipoAcc;
	
	public Account(int id_user, String cf, String nome, String cognome, String dataNascita,
					String cellulare, String indirizzo, String citta, String provincia,
					String cap, String eMail, String username,String pw, TipoAccount tipoAcc) {
		super();
		this.id_user = id_user;
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.cellulare = cellulare;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
		this.cap = cap;
		this.eMail = eMail;
		this.username = username;
		this.pw = pw;
		this.tipoAcc = tipoAcc;
			}

	
	public boolean controllaPw(String pw) throws LoginException{
		boolean check = false;
		if(pw.equals(this.pw)) {
			check = true;
		}
		else {
			throw new LoginException("La password inserita non è corretta");
		}
		return check;
		
	}


	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public TipoAccount getTipoAcc() {
		return tipoAcc;
	}

	public void setTipoAcc(TipoAccount tipoAcc) {
		this.tipoAcc = tipoAcc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int getId_User() {
		return id_user;
	}
	public void setId_User(int id_user) {
		this.id_user = id_user;
	}
	
	public String getCF() {
		return cf;
	}
	public void setCF(String cf) {
		this.cf = cf;
	}
		
}