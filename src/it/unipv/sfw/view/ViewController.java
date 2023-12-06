package it.unipv.sfw.view;

import java.awt.*;  
import javax.swing.*;

import it.unipv.sfw.view.account.ClientePanel;
import it.unipv.sfw.view.login.LoginPanel;
import it.unipv.sfw.view.prenotazione.CancellaPrenotazionePanelCliente;
import it.unipv.sfw.view.prenotazione.PrenotaPanelCliente;

public class ViewController extends JFrame {
	
	//Questa riga definisce un campo privato (private) chiamato serialVersionUID che
	//serve a controllare la compatibilità della versione della classe serializzata quando
	//viene deserializzata.
	private static final long serialVersionUID = 1L;
	//
	private JFrame frame;
	private JPanel panel;
	private LoginPanel loginP;
	private ClientePanel ClienteC;
	private PrenotaPanelCliente prenotatiC;
	private CancellaPrenotazionePanelCliente cancellaPre;
	
	public ViewController() {
		frame = new JFrame();		//istanzio un nuovo jframe
		panel = new JPanel();		//istanzio un nuovo jpanel

		Image icon = Toolkit.getDefaultToolkit().getImage("img\\icona.png");  //da qui prendo l'icona
		frame.setIconImage(icon);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 750);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Albergo Alberelli");
		
		
		frame.getContentPane().add(panel);
		
		loginP = new LoginPanel();		//nuovo pannello di login
		panel.add(loginP);
		
		ClienteC = new ClientePanel();	//nuovo pannello per il cliente
		panel.add(ClienteC);
		ClienteC.setVisible(false);
		
		prenotatiC = new PrenotaPanelCliente();	//nuovo pannello per la prenotazione
		panel.add(prenotatiC);
		prenotatiC.setVisible(false);
		
		cancellaPre = new CancellaPrenotazionePanelCliente();	//nuovo pannello per la cancellazione di una prenotazione
		panel.add(cancellaPre);
		cancellaPre.setVisible(false);
		
		
		frame.setVisible(true);
		
	}
	
	public LoginPanel getLoginPanel() {
		return loginP;
	}

	public ClientePanel getPazientePanel() {
		return ClienteC;
	}

	public PrenotaPanelCliente getPrenotatiPanelPaziente() {
		return prenotatiC;
	}

	public CancellaPrenotazionePanelCliente getCancellaPanelPaziente() {
		return cancellaPre;
	}

	}
