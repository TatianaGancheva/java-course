package tatiana;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Aplication {

	private JFrame frmFirmInformation;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplication window = new Aplication();
					window.frmFirmInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFirmInformation = new JFrame();
		frmFirmInformation.setTitle("Firm Information");
		frmFirmInformation.setBounds(100, 100, 631, 361);
		frmFirmInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFirmInformation.getContentPane().setLayout(null);
		
		JButton AddButton = new JButton("Add New Firm");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		AddButton.setBounds(33, 272, 153, 40);
		frmFirmInformation.getContentPane().add(AddButton);
		
		Object[][] rowData=new Object[0][5];
		Object[] columnNames= {"Name","Barcode","Price","Count","Total Price"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 595, 250);
		frmFirmInformation.getContentPane().add(scrollPane);
		
		table = new JTable();
		table=new JTable(new DefaultTableModel(rowData,columnNames));
		table.setFont(new Font("Tahoma",Font.PLAIN,14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		scrollPane.setColumnHeaderView(table);
	}
}
