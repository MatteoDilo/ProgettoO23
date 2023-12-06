package it.unipv.sfw.model.persona;

import java.util.ArrayList;

import it.unipv.sfw.model.prenotazione.IPrenotazione;

//import it.unipv.sfw.model.cartellaclinica.CartellaClinica;
//import it.unipv.sfw.model.prenotazione.IPrenotazione;

public interface ICliente {
	boolean spostaPrenotazioniErogate();	
	ArrayList<IPrenotazione> getPrenotazioni();
	void setPrenotazioni(ArrayList<IPrenotazione> prenotazioni);
	String getCf();
	String getNome();
	String getCognome();
	TipoAccount getTipoAcc();
	String getPw();
	String getDataNascita();
	String getLuogoNascita();
	String getProvinciaNascita();
	String getRegioneRes();
	String getProvinciaRes();
	String getCittaRes();
	String getIndirizzo();
	String getCap();
	String geteMail();
	String getCellulare();
}
