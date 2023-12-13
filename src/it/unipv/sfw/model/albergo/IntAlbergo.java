package it.unipv.sfw.model.albergo;

import java.util.ArrayList;
import java.util.HashMap;

import it.unipv.sfw.model.persona.IAccount;
import it.unipv.sfw.model.persona.ICliente;
import it.unipv.sfw.model.persona.IDipendenti;
import it.unipv.sfw.model.persona.TipoAccount;

public interface IntAlbergo {

	boolean registrazioneAccount(int id_user, String cf, String nome, String cognome, String dataNascita,
			String cellulare, String indirizzo, String cittaRes, String provinciaRes,
			String cap, String eMail, String username,String pw, TipoAccount tipoAcc);
	
//	int generaIdPren();
//	String generaPwTemp();
	boolean login(String username, String pw);
	String getNome();
	void setNome(String nome);
	String getIndirizzo();
	void setIndirizzo(String indirizzo);
	String getTelefono();
	void setTelefono(String telefono);
	String getEmail();
	void setEmail(String email);
	ArrayList<ICliente> getClienti();
	void setClienti(ArrayList<ICliente> cliente);
	ArrayList<IDipendenti> getDipendenti();
	void setDipendenti(ArrayList<IDipendenti> dipendenti);
	HashMap<String, IAccount> getUsername();
	void setUsername(HashMap<String, IAccount> usPersone);
	void setUtenteCorrente(String username);
	IAccount getUtenteCorrente();
}