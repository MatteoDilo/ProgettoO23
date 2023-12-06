package it.unipv.sfw.model.persona;

import java.time.LocalDate;
import java.util.ArrayList;

import it.unipv.sfw.model.prenotazione.IPrenotazione;
import it.unipv.sfw.model.persona.*;

public class Cliente extends Account implements ICliente {
	
	private ArrayList<IPrenotazione> prenotazioni;

	//costruttore 1
	public Cliente(String cf,String pw, TipoAccount tipoAcc, String nome,
			String cognome, String dataNascita, String luogoNascita, String provinciaNascita,
			String regioneRes, String provinciaRes, String cittaRes, String indirizzo, String cap, String eMail,
			String cellulare) {
		super(cf, pw, tipoAcc, nome, cognome, dataNascita, luogoNascita, provinciaNascita, regioneRes,
				provinciaRes, cittaRes, indirizzo, cap, eMail, cellulare);
		this.prenotazioni = new ArrayList<>();
	}
	//costruttore 2
	public Cliente(String cf,String pw, TipoAccount tipoAcc, String nome,
			String cognome, String dataNascita, String luogoNascita, String provinciaNascita,
			String regioneRes, String provinciaRes, String cittaRes, String indirizzo, String cap, String eMail,
			String cellulare) {
		super(cf, pw, tipoAcc, nome, cognome dataNascita, luogoNascita, provinciaNascita, regioneRes,
				provinciaRes, cittaRes, indirizzo, cap, eMail, cellulare);
		this.prenotazioni = new ArrayList<>();
	}

	
		
	public boolean spostaPrenotazioniErogate() {
		boolean check = false;
		try {
			LocalDate oggi = LocalDate.now();
			for(IPrenotazione p : this.prenotazioni) {
				if(p.getData().isBefore(oggi)) {
					this.prenotazioni.remove(p);
				}
			}
			check = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return check;
	}


	public ArrayList<IPrenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(ArrayList<IPrenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}


}