package it.unipv.sfw.jdbc;

import it.unipv.sfw.model.albergo.Albergo;
import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.model.persona.Cliente;
import it.unipv.sfw.model.persona.Dipendente;

import java.util.ArrayList;
import it.unipv.sfw.jdbc.bean.profilo.*;

public class FacadeSingletonDB {

	private static FacadeSingletonDB istanzaDB = null;
	
	private IntAlbergo albergo;
	private IProfiloDAO profilo;	
	
	private FacadeSingletonDB() {
		super();
		
		this.albergo = new Albergo();
		this.profilo = new ProfiloDAO();
		
		//popolaPrestazione();
		popolaClienti();
		popolaDipendenti();
		/*popolaOperatoriSanitari();
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
	
	
	public void popolaClienti() {
		ArrayList<ProfiloDB> clienti = new ArrayList<>();
		
		clienti = profilo.selectAllClienti();
		
		for (ProfiloDB i: clienti) {
			
			Cliente c = new Cliente(i.getId_user(), i.getCf(), i.getNome(), i.getCognome(), i.getDataNascita(),
					i.getCellulare(), i.getVia(), i.getCitta(), i.getProvincia(), 
					i.getCap(), i.geteMail(), i.getUsername(), i.getPw(), i.getTipoAcc());
			
			
			albergo.getClienti().add(c);
			albergo.getUsername().put(i.getUsername(), c);
		}
	}
	
	public void popolaDipendenti() {
		ArrayList<ProfiloDB> dipendenti = new ArrayList<>();
		
		dipendenti = profilo.selectAllDipendenti();
		
		for (ProfiloDB pi: dipendenti) {
			
			Dipendente d = new Dipendente(pi.getId_user(), pi.getCf(), pi.getNome(), pi.getCognome(), pi.getDataNascita(),
					pi.getCellulare(), pi.getVia(), pi.getCitta(), pi.getProvincia(), 
					pi.getCap(), pi.geteMail(), pi.getUsername(), pi.getPw(), pi.getTipoAcc());
			
			albergo.getDipendenti().add(d);
			albergo.getUsername().put(pi.getCf(), d);
		}
	}
	
	/*public void inserisciPaziente(ICliente c) {
		ProfiloDB accountDB = new ProfiloDB(c.getUsername(), c.getTipoAcc().toString(), c.getPw(), null, c.getNome(), c.getCognome(),
				c.getDataNascita(), c.getLuogoNascita(), c.getProvinciaNascita(), c.getRegioneRes(), c.getProvinciaRes(),
				c.getCittaRes(), c.getIndirizzo(), c.getCap(), c.geteMail(), c.getCellulare());
		
		profilo.insertProfilo(accountDB);
		}*/
	
	
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
