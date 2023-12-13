package it.unipv.sfw.view.account;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import it.unipv.sfw.model.prenotazione.IPrenotazione;

public class ClientePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel nome, cognome, cf, tipoAccount;
	private JLabel pNome, pCognome, pCf, pTipoAccount;
	private JList<String> listaPrenotazioni, listaPrenErogate;
	private JButton prenota, cancella, logout, cambiaPw;
	private DefaultListModel<String> modelloLista, modelloListaDue;
	private JLabel altezza, peso, gruppoSanguigno;
	private JLabel pAltezza, pPeso, pGruppoSanguigno;
	private JLabel prenotazione, prenotazioniErogate;
	private JScrollPane scrollVisite, scrollErogate;
	
	public ClientePanel() {
		setLayout(new GridLayout(3,2));
		
		
		JPanel barNordOvest = new JPanel();
		barNordOvest.setLayout(new BorderLayout());
		JPanel barNordEst = new JPanel();
		barNordEst.setLayout(new GridLayout(2,1));
		JPanel barCentroSx = new JPanel();
		barCentroSx.setLayout(new BorderLayout());
		JPanel barCentroDx = new JPanel();
		barCentroDx.setLayout(new GridLayout(2,1));
		JPanel barSudEst = new JPanel();
		barSudEst.setLayout(new GridLayout(6,1));
		JPanel barSudOvest = new JPanel();
		barSudOvest.setLayout(new GridLayout(8,1));
		
		
		nome = new JLabel("NOME:");
		pNome = new JLabel();
		cognome = new JLabel("COGNOME:");
		pCognome = new JLabel();
		cf = new JLabel("CF:");
		pCf = new JLabel();
		tipoAccount = new JLabel("TIPO ACCOUNT:");
		pTipoAccount = new JLabel("Paziente");
		prenota = new JButton("PRENOTA");
		cancella = new JButton("CANCELLA");
		logout = new JButton("LOGOUT");
		cambiaPw = new JButton("CAMBIA PASSWORD");
		altezza = new JLabel("ALTEZZA:");
		pAltezza = new JLabel();
		peso = new JLabel("PESO:");
		pPeso = new JLabel();
		gruppoSanguigno = new JLabel("GRUPPO SANGUIGNO:");
		pGruppoSanguigno = new JLabel("");
		prenotazione = new JLabel("PRENOTAZIONI");
		prenotazioniErogate = new JLabel("PRENOTAZIONI EROGATE");
		
		
		listaPrenotazioni = new JList<>();
		listaPrenotazioni.setPreferredSize(new Dimension(1000, 1000));
		modelloLista = new DefaultListModel<>();
		
		listaPrenErogate = new JList<>();
		listaPrenErogate.setPreferredSize(new Dimension(1000, 1000));
		modelloListaDue = new DefaultListModel<>();
		
		listaPrenotazioni.setModel(modelloLista);
		listaPrenErogate.setModel(modelloListaDue);
		
		scrollVisite = new JScrollPane(listaPrenotazioni);
		scrollVisite.setPreferredSize(new Dimension(650,150));
		scrollVisite.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollVisite.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        scrollErogate = new JScrollPane(listaPrenErogate);
        scrollErogate.setPreferredSize(new Dimension(650,150));
        scrollErogate.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollErogate.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        

		
		barNordOvest.add(prenotazione, BorderLayout.PAGE_START);
		barNordOvest.add(scrollVisite, BorderLayout.CENTER);
		add(barNordOvest);
		
		barNordEst.add(prenota);
		barNordEst.add(cancella);
		add(barNordEst);
		
		barCentroSx.add(prenotazioniErogate, BorderLayout.PAGE_START);
		barCentroSx.add(scrollErogate, BorderLayout.CENTER);
		add(barCentroSx);
		
		barCentroDx.add(cambiaPw);
		barCentroDx.add(logout);
		add(barCentroDx);
		
		barSudOvest.add(nome);
		barSudOvest.add(pNome);
		barSudOvest.add(cognome); 
		barSudOvest.add(pCognome);
		barSudOvest.add(cf);
		barSudOvest.add(pCf);
		barSudOvest.add(tipoAccount);
		barSudOvest.add(pTipoAccount);
		add(barSudOvest);
		
		barSudEst.add(altezza);
		barSudEst.add(pAltezza);
		barSudEst.add(peso);
		barSudEst.add(pPeso);
		barSudEst.add(gruppoSanguigno);
		barSudEst.add(pGruppoSanguigno);
		add(barSudEst);
		
	}
	
	public void setListaPrenotazioni (ArrayList<IPrenotazione> arrayList) {
		modelloLista.clear();
		for(IPrenotazione p : arrayList) {
			
			String idPren = String.valueOf(p.getIdPren());
			String prest = p.getPrestazione().getTipo().name();
			String data = p.getData().toString();
			String orario = p.getOrario().toString();
			String s = new String("Data: "+data+" | Ora: "+orario+" | Prestazione: "+prest+" | ID: "+idPren
					);
			
			modelloLista.addElement(s);
		}
		listaPrenotazioni.setModel(modelloLista);
	}
	
	public void setListaPrenotazioniErogate (ArrayList<IPrenotazione> arrayList) {
		modelloListaDue.clear();
		for(IPrenotazione p : arrayList) {
			
			String idPren = String.valueOf(p.getIdPren());
			String prest = p.getPrestazione().getTipo().name();
			String data = p.getData().toString();
			String orario = p.getOrario().toString();
			String s = new String("Data: "+data+" | Ora: "+orario+" | Prestazione: "+prest+" | ID: "+idPren
					);
			
			modelloListaDue.addElement(s);
		}
		listaPrenErogate.setModel(modelloListaDue);
	}
	
	public void setNome(String nome) {
	    pNome.setText(nome);
	}

	public void setCognome(String cognome) {
		pCognome.setText(cognome);
	}

	public void setCf(String cf) {
		pCf.setText(cf);
	}
	
	public void setAltezza(String altezza){
		pAltezza.setText(altezza+" cm");
	}

	public void setPeso(String peso){
		pPeso.setText(peso+" kg");
	}

	public void setGruppoSanguigno(String sangue){
		pGruppoSanguigno.setText(sangue);
	}
	
	public JButton getCambiaPw() {
		return cambiaPw;
	}
	
	public JButton getPrenotaBtn() {
		return prenota;
	}
	
	public JButton getLogoutBtn() {
		return logout;
	}
	
	public JButton getCancellaBtn() {
		return cancella;
	}

	
}
