package it.unipv.sfw.jdbc;

import it.unipv.sfw.model.albergo.Albergo;
import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.jdbc.bean.profilo.*;
import it.unipv.sfw.jdbc.bean.prenotazione.*;

public class FacadeSingletonDB {

	private static FacadeSingletonDB istanzaDB = null;
	
	private IntAlbergo albergo;
	private IProfiloDAO profilo;
	private IPrenotazioneDAO prenotazione;	
	
	private FacadeSingletonDB() {
		super();
		
		this.albergo = new Albergo();
		this.profilo = new ProfiloDAO();
		this.prenotazione = new PrenotazioneDAO();
		
		/*popolaPrestazione();
		popolaPazienti();
		popolaMedici();
		popolaOperatoriSanitari();
		popolaOperatoriUfficio();
		popolaCartellaClinica(struttura.getPazienti());
		popolaPrenotazioni(struttura.getPazienti());
		recuperoIdUltimaPrenotazione();
		*/
	}
	
	public IntAlbergo getAlbergo() {
		return albergo;
	}
	
	public void setAlbergo(Albergo albergo) {
		this.albergo = albergo;
	}
	
	public static FacadeSingletonDB getIstanzaFacade() {
		if(istanzaDB == null) {
			istanzaDB = new FacadeSingletonDB();
		}
		return istanzaDB;
	}
	
/*public void inserisciPrenotazione(IPrenotazione p) {
		
		PrenotazioneDB prenotazioneDB = new PrenotazioneDB(p.getIdPren(), p.getPaziente().getCf(), p.getPersonaleSanitario().getCf(), 
				p.getPrestazione().getTipo().name(), p.getData().toString(), p.getOrario().toString());
		
		prenotazione.insertPrenotazione(prenotazioneDB);
		calendario.updateCalendarioNewPren(prenotazioneDB);	
	}
	
	public void cancellaPrenotazione(IPrenotazione p) {
		
		PrenotazioneDB prenotazioneDB = new PrenotazioneDB(p.getIdPren(), p.getPaziente().getCf(), p.getPersonaleSanitario().getCf(), 
				p.getPrestazione().getTipo().name(), p.getData().toString(), p.getOrario().toString());
		
		prenotazione.deletePrenotazione(prenotazioneDB);
		calendario.updateCalendarioDelPren(prenotazioneDB);		
	}
*/
	
}
