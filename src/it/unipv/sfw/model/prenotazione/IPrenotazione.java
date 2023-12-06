package it.unipv.sfw.model.prenotazione;

import java.time.LocalDate;
import java.time.LocalTime;

import it.unipv.sfw.model.persona.IAccount;
import it.unipv.sfw.model.persona.ICliente;

public interface IPrenotazione {
	int getIdPren();
	void setIdPren(int idPren);
	ICliente getCliente();
	void setCliente(ICliente cliente);
	PrestazioneSanitaria getPrestazione();
	void setPrestazione(PrestazioneSanitaria prestazione);
	IAccount getDipendenti();
	void setDipendenti(IAccount personaleSanitario);
	LocalDate getData();
	void setData(LocalDate data);
	LocalTime getOrario();
	void setOrario(LocalTime orario);
}
