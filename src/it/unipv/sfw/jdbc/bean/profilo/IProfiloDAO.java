package it.unipv.sfw.jdbc.bean.profilo;

import java.util.ArrayList;

import it.unipv.sfw.model.persona.TipoAccount;

public interface IProfiloDAO {
	ProfiloDB selectProfiloByUsername(String username, TipoAccount tipo);
	ArrayList<ProfiloDB> selectAllClienti();
	ArrayList<ProfiloDB> selectAllProfili();
	ArrayList<ProfiloDB> selectAllDipendenti();
	}
