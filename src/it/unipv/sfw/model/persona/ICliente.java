package it.unipv.sfw.model.persona;


//import it.unipv.sfw.model.cartellaclinica.CartellaClinica;
//import it.unipv.sfw.model.prenotazione.IPrenotazione;

public interface ICliente {
//	boolean spostaPrenotazioniErogate();	
//	ArrayList<IPrenotazione> getPrenotazioni();
//	void setPrenotazioni(ArrayList<IPrenotazione> prenotazioni);
	
	public String getCF();
	public int getId_User();
	public String getProvincia();
	public String getCellulare();
	public String geteMail();
	public String getCap();
	public String getIndirizzo();
	public String getCitta();
	public String getDataNascita();
	public String getCognome();
	public String getNome();
	public String getUsername();
	public String getPw();
	public TipoAccount getTipoAcc();
	
}
