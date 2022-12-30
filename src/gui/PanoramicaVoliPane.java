package gui;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class PanoramicaVoliPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanoramicaVoliPane() {
		setLayout(null);
		
		JComboBox cbxAirport = new JComboBox();
		cbxAirport.setBounds(137, 26, 123, 22);
		add(cbxAirport);
		
		JLabel lblAirport = new JLabel("Seleziona l'aereoporto");
		lblAirport.setBounds(21, 30, 106, 14);
		add(lblAirport);
		
		JRadioButton rdbtnArrives = new JRadioButton("Arrivi");
		rdbtnArrives.setBounds(273, 26, 51, 23);
		add(rdbtnArrives);
		
		JRadioButton rdbtnDepartures = new JRadioButton("Partenze");
		rdbtnDepartures.setBounds(326, 26, 69, 23);
		add(rdbtnDepartures);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(rdbtnDepartures);
		group.add(rdbtnArrives);
		
		JButton btnSearch = new JButton("Cerca");
		btnSearch.setBounds(412, 26, 89, 23);
		add(btnSearch);

	}
}
