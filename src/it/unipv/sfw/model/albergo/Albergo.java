package it.unipv.sfw.model.albergo;

import java.util.ArrayList;
import java.util.HashMap;

import it.unipv.sfw.controller.facadecontroller.FacadeController;
import it.unipv.sfw.jdbc.FacadeSingletonDB;
import it.unipv.sfw.model.persona.Cliente;
import it.unipv.sfw.model.persona.IAccount;
import it.unipv.sfw.model.persona.ICliente;
import it.unipv.sfw.model.persona.IDipendenti;
import it.unipv.sfw.model.persona.TipoAccount;
import it.unipv.sfw.view.ViewController;

public class Albergo implements IntAlbergo {
	private String nome;
	private String indirizzo;
	private String telefono;
	private String email;
	
	private ArrayList<ICliente> clienti;
	private ArrayList<IDipendenti> dipendenti;
	
	HashMap<String,IAccount> usPersone;
	HashMap<String,IAccount> cfPersone;
	
	private IAccount utenteCorrente = null;
	
	public Albergo() {
		super();
		this.nome = "Albergo Alberelli Pavia";
		this.indirizzo = "Via Degli Alberi 18, Pavia(PV), Lombardia, Italia";
		this.telefono = "0382 33530";
		this.email = "AlbergoAlberelli@hm.it";
		
		this.clienti = new ArrayList<>();
		this.dipendenti = new ArrayList<>();
		
		this.usPersone = new HashMap<>();	
	}
	
	public static void main(String[] args) {
		FacadeSingletonDB db = FacadeSingletonDB.getIstanzaFacade();
		IntAlbergo model = db.getAlbergo();
		ViewController view = new ViewController();
		System.out.println(model);
		System.out.println(view);
		System.out.println(db);
		
		new FacadeController(model, view);		
	}
	
	@Override
	public boolean login(String username, String pw) {
		boolean check = false;
		try {
			IAccount a = this.getUsername().get(username);
			check = a.controllaPw(pw);
			if(check) {
				setUtenteCorrente(username);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return check;
	}
	
	@Override
	public boolean registrazioneAccount(int id_user, String cf, String nome, String cognome, String dataNascita,
			String cellulare, String via, String citta, String provincia,
			String cap, String eMail, String username,String pw, TipoAccount tipoAcc) {
		boolean check = false;
		try {
				Cliente c = new Cliente(id_user, cf, nome, cognome, dataNascita, cellulare, via, citta, provincia, cap, eMail, username, pw, tipoAcc);
				
//				FacadeSingletonDB.getIstanzaFacade().inserisciPaziente(c);
				clienti.add(c);
				this.getUsername().put(c.getUsername(), c);
				
				check = true;			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return check;
	} 
	
	public HashMap<String, IAccount> getUsername() {
		return usPersone;
	}

	public void setUsername(HashMap<String, IAccount> usPersone) {
		this.usPersone = usPersone;
	}
	
	public void setUtenteCorrente(String username) {
		this.utenteCorrente = this.usPersone.get(username);
	}
	
	public IAccount getUtenteCorrente() {
		return utenteCorrente;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<ICliente> getClienti() {
		return clienti;
	}

	public void setClienti(ArrayList<ICliente> clienti) {
		this.clienti = clienti;
	}
	
	public ArrayList<IDipendenti> getDipendenti(){
		return dipendenti;
	}
	
	public void setDipendenti(ArrayList<IDipendenti> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	
}
