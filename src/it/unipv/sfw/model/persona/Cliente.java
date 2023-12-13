package it.unipv.sfw.model.persona;


public class Cliente extends Account implements ICliente {

	public Cliente(int id_user, String cf, String nome, String cognome, String dataNascita,
			String cellulare, String via, String citta, String provincia, String cap, String eMail, String username,
			String pw, TipoAccount tipoAcc) {
		super(id_user, cf, nome, cognome, dataNascita, cellulare, via, citta, provincia, cap, eMail, username, pw, tipoAcc);
	}


}