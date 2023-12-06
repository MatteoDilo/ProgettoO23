package it.unipv.sfw.model.persona;

import java.time.LocalDate;
import java.util.ArrayList;

import it.unipv.sfw.model.prenotazione.IPrenotazione;
import it.unipv.sfw.model.prenotazione.TipoPrestazione;

public class Dipendente extends Account implements IDipendenti{
	
	private TipoPrestazione specializzazione;
	private ArrayList<IPrenotazione> calendario;

	public Dipendente(String cf, String pw, TipoAccount tipoAcc, String nome, String cognome, Sesso sesso,
			String dataNascita, String luogoNascita, String provinciaNascita, String regioneRes, String provinciaRes,
			String cittaRes, String indirizzo, String cap, String eMail, String cellulare,
			TipoPrestazione specializzazione, ArrayList<IPrenotazione> calendario) {
		super(cf, pw, tipoAcc, nome, cognome, sesso, dataNascita, luogoNascita, provinciaNascita, regioneRes,
				provinciaRes, cittaRes, indirizzo, cap, eMail, cellulare);
		this.specializzazione = specializzazione;
		this.calendario = calendario;
	}
	
	public Dipendente(String cf, String pw, TipoAccount tipoAcc, String nome, String cognome, Sesso sesso,
			String dataNascita, String luogoNascita, String provinciaNascita, String regioneRes, String provinciaRes,
			String cittaRes, String indirizzo, String cap, String eMail, String cellulare,
			TipoPrestazione specializzazione) {
		super(cf, pw, tipoAcc, nome, cognome, sesso, dataNascita, luogoNascita, provinciaNascita, regioneRes,
				provinciaRes, cittaRes, indirizzo, cap, eMail, cellulare);
		this.specializzazione = specializzazione;
		this.calendario = new ArrayList<>();
	}

	public boolean eliminaPrenotazioniErogate() {
		boolean check = false;
		try {
			LocalDate oggi = LocalDate.now();
			for(IPrenotazione p : this.calendario) {
				if(p.getData().isBefore(oggi)) {
					this.calendario.remove(p);
				}
			}
			check = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return check;
	}
	
	@Override
	public TipoPrestazione getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(TipoPrestazione specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	public ArrayList<IPrenotazione> getCalendario() {
		return calendario;
	}

	public void setCalendario(ArrayList<IPrenotazione> calendario) {
		this.calendario = calendario;
	}
	
}
