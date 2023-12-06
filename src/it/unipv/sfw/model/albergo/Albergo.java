package it.unipv.sfw.model.albergo;

import java.util.ArrayList;
import java.util.HashMap;

import it.unipv.sfw.controller.facadecontroller.FacadeController;
import it.unipv.sfw.jdbc.FacadeSingletonDB;
import it.unipv.sfw.model.albergo.IntAlbergo;
import it.unipv.sfw.model.persona.IAccount;
import it.unipv.sfw.model.persona.ICliente;
import it.unipv.sfw.model.persona.IDipendenti;
import it.unipv.sfw.model.prenotazione.IPrenotazione;
import it.unipv.sfw.model.prenotazione.PrestazioneSanitaria;
import it.unipv.sfw.view.ViewController;

public class Albergo implements IntAlbergo {
	private String nome;
	private String indirizzo;
	private String telefono;
	private String email;
	
	private ArrayList<ICliente> clienti;
	private ArrayList<IDipendenti> dipendenti;
	
	HashMap<String,IAccount> cfPersone;
	HashMap<Integer, IPrenotazione> idPrenotazioni;
	
	private IAccount utenteCorrente = null;
	private int ultimaPrenotazione;
	
	public Albergo() {
		super();
		this.nome = "Albergo Alberelli Pavia";
		this.indirizzo = "Via Degli Alberi 18, Pavia(PV), Lombardia, Italia";
		this.telefono = "0382 33530";
		this.email = "AlbergoAlberelli@hm.it";
		
		this.clienti = new ArrayList<>();
		this.dipendenti = new ArrayList<>();
		this.cfPersone = new HashMap<>();
		this.idPrenotazioni = new HashMap<>();		
	}
	
	public static void main(String[] args) {
		FacadeSingletonDB db = FacadeSingletonDB.getIstanzaFacade();
		IntAlbergo model = db.getAlbergo();
		ViewController view = new ViewController();
		new FacadeController(model, view);		
	}
	
	@Override
	public boolean login(String cf, String pw) {
		boolean check = false;
		try {
			IAccount a = this.getCfPersone().get(cf);
			check = a.controllaPw(pw);
			if(check) {
				setUtenteCorrente(cf);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return check;
	}
	
	public HashMap<String, IAccount> getCfPersone() {
		return cfPersone;
	}

	public void setCfPersone(HashMap<String, IAccount> cfPersone) {
		this.cfPersone = cfPersone;
	}
	
	public void setUtenteCorrente(String cf) {
		this.utenteCorrente = this.cfPersone.get(cf);
	}
	
	public IAccount getUtenteCorrente() {
		return utenteCorrente;
	}
	
	
	
	
	
}
