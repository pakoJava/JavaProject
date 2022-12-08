package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class Application {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.
		frame = new JFrame();
		frame.setBounds(0, 0, 1080, 720);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		LoginPane loginPane = new LoginPane();
		frame.getContentPane().add(loginPane, "name_104467660411600");
		loginPane.setVisible(true);
		
		RegisterPane registerPane = new RegisterPane();
		frame.getContentPane().add(registerPane, "name_104469909199700");
		registerPane.setVisible(false);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_118879649427400");
		panel.setVisible(false);
		loginPane.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(!loginPane.getTxtUserId().getText().isEmpty() && !loginPane.getPwdField().getText().isEmpty()) {
					
					if( loginPane.getUs().login(Integer.parseInt(loginPane.getTxtUserId().getText()), loginPane.getPwdField().getText()) ) {
						
						JOptionPane.showMessageDialog(null, "login effettuato");
						loginPane.setVisible(false);
						panel.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, " credenziali errate o utente non registrato");
					}
				}else {
					
					JOptionPane.showMessageDialog(null, " credenziali registrato");

				}
			}
					
		});
		
		loginPane.btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginPane.setVisible(false);
				registerPane.setVisible(true);
			}
		});
		
		
		
		registerPane.btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(!registerPane.getTxtUsr().getText().isEmpty() && !registerPane.getPwdField().getText().isEmpty()) {
					
					if(registerPane.getUs().registra(registerPane.getTxtUsr().getText(), registerPane.getPwdField().getText())) {
						
						JOptionPane.showMessageDialog(null, "Registrazione effettuata\nIl tuo ID per i prossimi accessi e': " + 
									registerPane.getUs().getId(registerPane.getTxtUsr().getText(), registerPane.getPwdField().getText()));
						registerPane.setVisible(false);
						loginPane.setVisible(true);
					}else {
						
						JOptionPane.showMessageDialog(null, "Errore registrazione");
					}
				}
			}
		});
		
		registerPane.btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				registerPane.setVisible(false);
				loginPane.setVisible(true);
			}
		});
		
	}
	
	
	
}
