package it.unipv.sfw.view.login;

import java.awt.GridLayout;

import javax.swing.*;

public class LoginPanel  extends JPanel{		//PANNELLO DI LOGIN, la prima schermata
	
	//la funzionalità di questa riga è stata spiegata in it.unipb.sfw.view
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	public JButton btnAccedi;
	public JButton btnPswdimenticata;
	public JLabel lblLogin;
	public JLabel lblPsw;

	public LoginPanel() {
		setVisible(true);
		setLayout(new GridLayout(5,2));

		username = new JTextField();
		password = new JPasswordField();
		lblLogin = new JLabel("Username\n");
		lblPsw = new JLabel ("Password");
		btnAccedi = new JButton("ACCEDI");
		btnPswdimenticata = new JButton("Password Dimenticata");
		
		//aggiungi a schermo i bottoni e tutto il resto
		add(lblLogin);
		add(username);
		add(lblPsw);
		add(password);
		add(btnAccedi);
		add(btnPswdimenticata);			
	}


	//GETTERS E SETTERS
	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JTextField getUsername() {
		return username;
	}


	public void setUsername(JTextField username) {
		this.username = username;
	}


	public JPasswordField getPassword() {
		return password;
	}


	public void setPassword(JPasswordField password) {
		this.password = password;
	}


	public JButton getBtnAccedi() {
		return btnAccedi;
	}


	public void setBtnAccedi(JButton btnAccedi) {
		this.btnAccedi = btnAccedi;
	}


	public JButton getBtnPswdimenticata() {
		return btnPswdimenticata;
	}


	public void setBtnPswdimenticata(JButton btnPswdimenticata) {
		this.btnPswdimenticata = btnPswdimenticata;
	}


	public JLabel getLblLogin() {
		return lblLogin;
	}


	public void setLblLogin(JLabel lblLogin) {
		this.lblLogin = lblLogin;
	}
	
	public JLabel getlblPsw() {
		return lblPsw;
	}
	
	public void setlblPsw(JLabel lblPsw) {
		this.lblPsw = lblPsw;
	}

}