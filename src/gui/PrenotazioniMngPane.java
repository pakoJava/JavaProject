package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PrenotazioniMngPane extends JPanel {
	private JTextField txtNPren;

	/**
	 * Create the panel.
	 */
	public PrenotazioniMngPane() {
		setLayout(null);
		
		txtNPren = new JTextField();
		txtNPren.setBounds(177, 36, 162, 20);
		add(txtNPren);
		txtNPren.setColumns(10);
		
		JLabel lblNPren = new JLabel("Inserisci il numero di prenotazione");
		lblNPren.setBounds(10, 39, 174, 14);
		add(lblNPren);
		
		JButton btnModify = new JButton("Modifica");
		btnModify.setBounds(360, 35, 89, 23);
		add(btnModify);
		
		JButton btnDelete = new JButton("Elimina");
		btnDelete.setBounds(459, 35, 89, 23);
		add(btnDelete);

	}
}
