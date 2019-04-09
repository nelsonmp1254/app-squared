import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;



// outline generated by Java Swing GUI builder
public class Interface {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static Catalog catalog = new Catalog(); 
	private final static String FILE_NAME = "data.txt";
	/**
	 * Launch the application.
	 */


	public static void main(String[] args) {

		fileReader(); 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 29, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblType = new JLabel("Search Type");
		lblType.setBounds(10, 11, 86, 14);
		frame.getContentPane().add(lblType);

		textField_1 = new JTextField();
		textField_1.setBounds(131, 29, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblQuery = new JLabel("Query");
		lblQuery.setBounds(131, 11, 65, 14);
		frame.getContentPane().add(lblQuery);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(166, 227, 89, 23);
		frame.getContentPane().add(btnSearch);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(280, 29, 780, 600);
		frame.getContentPane().add(textPane);

		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.repaint();
				textPane.repaint();
				textField.repaint(); 
				textField_1.repaint(); 
				String s = "";
				
				System.out.println(textField_1.getText());
				s = catalog.stringDisplay(textField.getText(), textField_1.getText());
//				if(textField.getText().equalsIgnoreCase("name")) {
//					s = catalog.stringDisplay(textField_1.getText());
//				}
//				else {
//					s = catalog.stringDisplay(textField_1.getText());
//				}
				textPane.setText(s);
			}
		});
	}


	public static void fileReader() {

		RandomAccessFile raf = null;
		Application a = null;

		try
		{
			raf = new RandomAccessFile(FILE_NAME, "r");
			raf.readLine();

			while(raf.getFilePointer() < raf.length())
			{
				a = new Application(raf);

				catalog.addApp(a);
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				raf.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}
