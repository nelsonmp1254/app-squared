import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthSpinnerUI;





public class Tester extends JPanel {

	Application a1 = new Application(); 
	Application a2 = new Application();
	Application a3 = new Application(); 
	Catalog c = new Catalog(); 
	String search = "";
	String searchType = "";

	public Tester() {		// Need to add in new windows/buttons/text field 
		//click on search bar > start a scanner > display input from scanner > show results containing that input

		Scanner fin = new Scanner(System.in);

		System.out.println("Search Type:");
		searchType = fin.nextLine(); 			// -- Update this to be a clickable menu
		if(!searchType.equals("")) {
			System.out.println("Enter a search");	//Need to make this persistent/auto updating (Add in a key event
			search = fin.nextLine();	// and have it update on keystroke. Need char AL instead [?] )
		}

		a1.setAppID(2);
		a1.setName("aaaaa");
		a1.addVersion("0.8.7.1");
		a1.addRating(3);
		a1.addSpecification("testSpec3");
		a1.addGenre("rpg");
		a3.setName("zzz");
		a3.setAppID(3);

		c.addApp(a3); 
		c.addApp(a1);
		c.addApp(a2); 								// Sorted. Not as efficient as I'd like, but it works. 


		JFrame window = new JFrame("AppSquared V 0.1"); 
		window.setBounds(100, 100, 1000, 500);					
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.getContentPane().add(this);
		window.setVisible(true);



	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		int i = 100; 


		for(Application a : c.applications) {
			a.draw(g, searchType, search, 50, i);
			i+= 15;
		}


	}

	public static void main(String[] args) {
		new Tester(); 
	}

}