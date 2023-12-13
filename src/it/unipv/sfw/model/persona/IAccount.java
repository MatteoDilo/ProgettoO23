package it.unipv.sfw.model.persona;


import javax.security.auth.login.LoginException;


public interface IAccount {
	//richiamiamo il metodo per il controllo della password
	public boolean controllaPw(String pw) throws LoginException;
	//
	public String getCF();
	public void setCF(String cf);
	public int getId_User();
	public void setId_User(int id_user);
	public String getProvincia();
	public void setProvincia(String provincia);
	public String getCellulare();
	public void setCellulare(String cellulare);	
	public String geteMail();
	public void seteMail(String eMail);
	public String getCap();
	public void setCap(String cap);
	public String getPw();
	public void setPw(String pw);
	public TipoAccount getTipoAcc();
	public void setTipoAcc(TipoAccount tipoAcc);
	public void setIndirizzo(String indirizzo);
	public String getIndirizzo();
	public String getCitta();
	public void setCitta(String citta);
	public String getDataNascita();
	public void setDataNascita(String dataNascita);
	public String getCognome();
	public void setCognome(String cognome);
	public String getNome();
	public void setNome(String nome);
	public String getUsername();
	public void setUsername(String username);
}
