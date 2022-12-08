package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Service.UserService;

import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LoginPane extends JPanel {
	
	private static final long serialVersionUID = 1756835228738418827L;
	
	private JTextField txtUserId;
	private JPasswordField pwdField;
	private UserService us = new UserService();
	JButton btnLogin;
	JButton btnRegister;

	/**
	 * Create the panel.
	 */
	public LoginPane() {
		
		setLayout(null);
		
		
		JLabel lblUsrId = new JLabel("ID User");
		lblUsrId.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsrId.setBounds(79, 92, 69, 13);
		add(lblUsrId);
		
		txtUserId = new JTextField();
		txtUserId.setColumns(10);
		txtUserId.setBounds(176, 89, 96, 19);
		add(txtUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(79, 115, 87, 13);
		add(lblPassword);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(176, 112, 96, 19);
		add(pwdField);
		
		btnLogin = new JButton("Login");
		
		btnLogin.setBounds(79, 163, 85, 21);
		add(btnLogin);
		
		
		
		btnRegister = new JButton("Registrati");
		btnRegister.setBounds(187, 163, 85, 21);
		add(btnRegister);
		
	}
	
	public JTextField getTxtUserId() {
		return txtUserId;
	}

	public void setTxtUserId(JTextField txtUserId) {
		this.txtUserId = txtUserId;
	}

	public JPasswordField getPwdField() {
		return pwdField;
	}

	public void setPwdField(JPasswordField pwdField) {
		this.pwdField = pwdField;
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

}
