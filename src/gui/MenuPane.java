package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPane extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JButton btnVoli;
	private JButton btnPrenota;
	private JButton btnPrenotazioniMng;
	private JButton btnAerei;
	
	public MenuPane() {
		setLayout(null);
		
		btnVoli = new JButton("Arrivi / Partenze");
		btnVoli.setBounds(62, 120, 142, 23);
		add(btnVoli);
		
		btnPrenota = new JButton("Prenota Volo");
		btnPrenota.setBounds(214, 120, 142, 23);
		add(btnPrenota);
		
		btnPrenotazioniMng = new JButton("Gestisci prenotazione");
		btnPrenotazioniMng.setBounds(214, 154, 142, 23);
		add(btnPrenotazioniMng);
		
		btnAerei = new JButton("Flotta Aerei");
		btnAerei.setBounds(62, 154, 142, 23);
		add(btnAerei);

	}

	public JButton getBtnVoli() {
		return btnVoli;
	}

	public void setBtnVoli(JButton btnVoli) {
		this.btnVoli = btnVoli;
	}

	public JButton getBtnPrenota() {
		return btnPrenota;
	}

	public void setBtnPrenota(JButton btnPrenota) {
		this.btnPrenota = btnPrenota;
	}

	public JButton getBtnPrenotazioniMng() {
		return btnPrenotazioniMng;
	}

	public void setBtnPrenotazioniMng(JButton btnPrenotazioniMng) {
		this.btnPrenotazioniMng = btnPrenotazioniMng;
	}

	public JButton getBtnAerei() {
		return btnAerei;
	}

	public void setBtnAerei(JButton btnAerei) {
		this.btnAerei = btnAerei;
	}
	
}
