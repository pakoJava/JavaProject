package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class PrenotaVoloPane extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PrenotaVoloPane() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(133, 30, 196, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchVolo = new JLabel("Inserisci la destinazione");
		lblSearchVolo.setBounds(10, 33, 113, 14);
		add(lblSearchVolo);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(481, 30, 165, 20);
		add(dateChooser);
		
		JLabel lblDate = new JLabel("Scegli la data");
		lblDate.setBounds(374, 33, 70, 14);
		add(lblDate);
		
		JButton btnSearch = new JButton("Cerca");
		btnSearch.setBounds(670, 29, 89, 23);
		add(btnSearch);

	}
}
