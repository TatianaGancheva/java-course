import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LotaryGame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LotaryGame window = new LotaryGame();
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
	public LotaryGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add ");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(23, 513, 157, 38);
		frame.getContentPane().add(btnAdd);
		
		JButton btnShowLuckyNumbers = new JButton("Show Lucky Numbers");
		btnShowLuckyNumbers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnShowLuckyNumbers.setBounds(214, 513, 187, 38);
		frame.getContentPane().add(btnShowLuckyNumbers);
		
		JButton btnShowWinners = new JButton("Show Winners");
		btnShowWinners.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnShowWinners.setBounds(425, 513, 157, 38);
		frame.getContentPane().add(btnShowWinners);
		
		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
					try{
					
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage People ", "pp"));
					fileChooser.showDialog(null, "Choose...");
					File file = fileChooser.getSelectedFile();
					if (file == null){
						return;
					}
					String path = file.getPath();
					if (path == null){
						return;
					}
					path = path.endsWith(".sss") ? path : path + ".sss";
					
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);

					ArrayList<String> list = new ArrayList<String>();

					int rowCount = table.getRowCount();
			        		        
			        for (int i = 0; i < rowCount; i++) {
			        		String line = String.format("%s : %s", table.getValueAt(i, 0),table.getValueAt(i, 1));
					        list.add(line);
			        }
					
					for (String line : list) {
						writer.append(line);
						writer.newLine();
					}
					
					writer.close();
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Error while saving file!");
					}
					JOptionPane.showMessageDialog(null, "Successfully saved in file!");
			}
	});
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBounds(606, 513, 150, 38);
		frame.getContentPane().add(btnExport);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 764, 491);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		Object [][] rowData= new Object[0][2];
		Object[]columns={"ID","Numbers"};
		table=new JTable(new DefaultTableModel(rowData,columns));
		table.setFont(new Font("Tahoma",Font.PLAIN,14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		

		
	}
}
