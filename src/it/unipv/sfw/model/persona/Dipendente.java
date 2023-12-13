package it.unipv.sfw.model.persona;


public class Dipendente extends Account implements IDipendenti{

	public Dipendente(int id_user, String cf, String nome, String cognome, String dataNascita,
			String cellulare, String via, String citta, String provincia, String cap, String eMail, String username,
			String pw, TipoAccount tipoAcc) {
		super(id_user, cf, nome, cognome, dataNascita, cellulare, via, citta, provincia, cap, eMail, username, pw, tipoAcc);
		}
	
	
}
