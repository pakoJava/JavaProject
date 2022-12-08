package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Service.UserService;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPane extends JPanel {

	private static final long serialVersionUID = -3321256659301735124L;
	
	private JTextField txtUsr;
	private JPasswordField pwdField;
	private UserService us = new UserService();
	JButton btnRegister;
	JButton btnBack;

	/**
	 * Create the panel.
	 */
	public RegisterPane() {
		setLayout(null);
		
		JLabel lblUsrId = new JLabel("Username");
		lblUsrId.setBounds(59, 43, 56, 13);
		add(lblUsrId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(59, 66, 44, 13);
		add(lblPassword);
		
		txtUsr = new JTextField();
		txtUsr.setBounds(142, 40, 96, 19);
		txtUsr.setColumns(10);
		add(txtUsr);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(142, 63, 96, 19);
		add(pwdField);
		
		btnRegister = new JButton("Registrati");
		btnRegister.setBounds(142, 92, 75, 21);
		add(btnRegister);
		
		btnBack = new JButton("Indietro");
		btnBack.setBounds(234, 92, 85, 21);
		add(btnBack);

	}

	public JTextField getTxtUsr() {
		return txtUsr;
	}

	public void setTxtUsr(JTextField txtUsr) {
		this.txtUsr = txtUsr;
	}

	public JPasswordField getPwdField() {
		return pwdField;
	}

	public void setPwdField(JPasswordField passwordField) {
		this.pwdField = passwordField;
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}
}
