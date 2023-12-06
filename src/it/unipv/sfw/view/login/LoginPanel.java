package it.unipv.sfw.view.login;

import java.awt.GridLayout;

import javax.swing.*;

public class LoginPanel  extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private  JTextField username;
	private  JPasswordField password;
	public JButton btnAccedi;
	public JButton btnPswdimenticata;
	public JLabel lblLogin;
	public JLabel lblPsw;

	public LoginPanel() {
		setVisible(true);
		setLayout(new GridLayout(5,2));

		password = new JPasswordField();
		username = new JTextField();
		lblLogin = new JLabel("Username\n");
		lblPsw = new JLabel ("Password");
		btnAccedi = new JButton("ACCEDI");
		btnPswdimenticata = new JButton("Password Dimenticata");
		
		
		add(password);
		add(username);
		add(lblLogin);
		add(btnAccedi);
		add(btnPswdimenticata);
				
	}


	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JTextField getUsernameText() {
		return username;
	}


	public void setUsernameText(JTextField usernameText) {
		this.username = usernameText;
	}


	public JPasswordField getPasswordField() {
		return password;
	}


	public void setPasswordField(JPasswordField passwordField) {
		this.password = passwordField;
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