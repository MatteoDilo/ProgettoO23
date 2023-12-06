package it.unipv.sfw.model.prenotazione;
import java.time.LocalDate;
import java.time.LocalTime;

import it.unipv.sfw.model.persona.IAccount;
import it.unipv.sfw.model.persona.ICliente;


public class Prenotazione implements IPrenotazione {
	private int idPren;
	private ICliente cliente;
	private IAccount dipendente;
	private PrestazioneSanitaria prestazione;
	private LocalDate data;
	private LocalTime orario;
	
	public Prenotazione(int idPren, ICliente cliente, IAccount dipendente, 
			LocalDate data, LocalTime orario) {
		super();
		this.idPren = idPren;
		this.cliente = cliente;
		this.dipendente = dipendente;
		this.data = data;
		this.orario = orario;
	}

	public int getIdPren() {
		return idPren;
	}

	public void setIdPren(int idPren) {
		this.idPren = idPren;
	}

	public ICliente getCliente() {
		return cliente;
	}

	public void setCliente(ICliente cliente) {
		this.cliente = cliente;
	}

	public PrestazioneSanitaria getPrestazione() {
		return prestazione;
	}

	public void setPrestazione(PrestazioneSanitaria prestazione) {
		this.prestazione = prestazione;
	}

	public IAccount getDipendenti() {
		return dipendente;
	}

	public void setDipendenti(IAccount dipendente) {
		this.dipendente = dipendente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getOrario() {
		return orario;
	}

	public void setOrario(LocalTime orario) {
		this.orario = orario;
	}





}