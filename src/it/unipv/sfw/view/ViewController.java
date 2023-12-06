package it.unipv.sfw.view;

import java.awt.*;  
import javax.swing.*;

import it.unipv.sfw.view.account.ClientePanel;
import it.unipv.sfw.view.login.LoginPanel;
import it.unipv.sfw.view.prenotazione.CancellaPrenotazionePanelCliente;
import it.unipv.sfw.view.prenotazione.PrenotaPanelCliente;

public class ViewController extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel panel;
	private LoginPanel loginP;
	private ClientePanel ClienteC;
	private PrenotaPanelCliente prenotatiC;
	private CancellaPrenotazionePanelCliente cancellaPre;
	
	public ViewController() {
		frame = new JFrame();
		panel = new JPanel();

		Image icon = Toolkit.getDefaultToolkit().getImage("img\\icona.png");  
		frame.setIconImage(icon);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 750);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Albergo Alberelli");
		
		
		frame.getContentPane().add(panel);
		
		loginP = new LoginPanel();
		panel.add(loginP);
		
		ClienteC = new ClientePanel();
		panel.add(ClienteC);
		ClienteC.setVisible(false);
		
		prenotatiC = new PrenotaPanelCliente();
		panel.add(prenotatiC);
		prenotatiC.setVisible(false);
		
		cancellaPre = new CancellaPrenotazionePanelCliente();
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
