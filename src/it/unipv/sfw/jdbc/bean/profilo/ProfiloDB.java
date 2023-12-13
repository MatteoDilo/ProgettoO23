package it.unipv.sfw.jdbc.bean.profilo;

import it.unipv.sfw.model.persona.TipoAccount;

public class ProfiloDB {
	private int id_user;
	private String Cf;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String cellulare;
	private String via;
	private String citta;
	private String provincia;
	private String cap;
	private String eMail;
	private String username;
	private String pw;
	private TipoAccount tipoAcc;
	
	public ProfiloDB(int id_user, String Cf, String nome, String cognome, String dataNascita,
			String cellulare, String via, String citta, String provincia, String cap,
			String eMail, String username, String pw,String tipoAcc) {
		super();
		this.id_user = id_user;
		this.Cf = Cf;
		this.nome = nome;
		this.cognome = cognome;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.cellulare = cellulare;
		this.via = via;
		this.citta = citta;
		this.provincia = provincia;
		this.cap = cap;
		this.eMail = eMail;
		this.username= username;
		this.pw = pw;
		this.tipoAcc = TipoAccount.valueOf(tipoAcc);
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
	public int getId_user() {
		return id_user;
	}
	
	public void setCf(String Cf) {
		this.Cf = Cf;
	}
	
	public String getCf() {
		return Cf;
	}
	
	public TipoAccount getTipoAcc() {
		return tipoAcc;
	}

	public void setTipoAcc(TipoAccount tipoAcc) {
		this.tipoAcc = tipoAcc;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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


	public String getProvincia() {
		return provincia;
	}

	public void setProvinciaNascita(String provincia) {
		this.provincia = provincia;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
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
	
	
	

}
