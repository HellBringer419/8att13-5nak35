/**
 * Enjoy the war of space as you and your rival bet their snakes to eat the most 
 * among 10  bits of food and emerge as a Battle Champion : Battle of Snakes 
 **/

import java.io.*;
import java.awt.*;
import java.awt.event.*; // For the sake of action listeners
import java.awt.Color.*;
import java.awt.Window.*;
import javax.swing.*;
import java.util.Random;
import javax.sound.sampled.*;
import java.util.concurrent.TimeUnit;

class BattleSnakes {
    public static void main(String args[]) {
	try {
	    //	    UIManager.setLookAndFeel(new NapkinLookAndFeel());
	    SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
			Lawn Game1 = new Lawn();
			Game1.getTitled();
			
		    }
		});
	    System.out.println(" Successfully Working \n");
	} catch( Exception er) {
	    new BattleSnakes(er, 01);
	}
    }

    BattleSnakes( Exception errors, Integer error_code) {
	System.out.println(errors);

	// Clear Entire screen here
	System.gc();
	java.awt.Window win[] = java.awt.Window.getWindows();
	for( int k=0; k < win.length; k++) {
	    win[k].dispose();
	    win[k] = null;
	}

	// Creating exception frame
	JFrame exceptionframed = new JFrame("Exception");
	exceptionframed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color blk = new Color(17, 17, 17);

	JTextArea comment = new JTextArea();
	comment.setBackground(blk);
	comment.setForeground(Color.WHITE);
	comment.setFont(new Font("Serif", Font.BOLD, 37));
	//   Fonts : SANS_SERIF, SERIF, MONOSPACED: HANDLE WITH SANS SERIF
	comment.setText("\n \n \n \n \n Seems Like the Snakes have Rebelled again, \n Just hope we ain't out of frogs \t *_* ");
	//comment.addText(e);

	JLabel help = new JLabel();
	help.setBackground(blk);
	help.setForeground(Color.YELLOW);
	help.setFont(new Font("Sans_serif", Font.ITALIC, 16));

	// Understanding the exception
	switch(error_code) {
	case 01 :
	    help.setText(" Possibly JTattoo is missing  in the Resources folder ");
	    break;

	case 02 :
	    help.setText(" Applicaation couldn't delay properly ... try running again ");
	    break;

	case 03 :
	    help.setText(" Music File Paper Planes seems to have changed file format ");
	    break;

	case 04 :
	    help.setText(" Music File Paper Planes not found ");
	    break;

	case 05 :
	    help.setText(" An unknown error occured with Music File Paper Plane ");
	    break;

	case 06 :
	    help.setText(" Music File Happy Place seems to have changed file format ");
	    break;

	case 07 :
	    help.setText(" Music File Happy Place not found ");
	    break;

	case 016 :
	    help.setText(" An unknown error occured with Music File Happy Place ");
	    break;

	case 017 :
	    help.setText(" Music File Like seems to have changed file format ");
	    break;

	case 010 :
	    help.setText(" Music File Like not found ");
	    break;

	case 011 :
	    help.setText(" An unknown error occured with Music File Like ");
	    break;

	case 012 :
	    help.setText(" One of the two Credits images are facing problems ... maybe they are not in the Resources folder ");
	    break;

	case 013 :
	    help.setText(" The Help image is not in the Resources folder ");
	    break;

	case 014 :
	    help.setText(" It really is that snake ... did you somehow cross boundaries");
	    break;

	case 015 :
	    help.setText(" The final throphy image is looted!! ");

	case 021 :
	    help.setText(" The title image (Players) is not found ");
	    break;
	    
	default :
	    help.setText(" Please report this error with a short description ... Thanks *_' ");
	    break;
	}

	exceptionframed.getContentPane().setBackground(blk);
	exceptionframed.setLayout(new FlowLayout());
	comment.setFocusable(false);
	exceptionframed.add(comment);
	exceptionframed.add(help);
	exceptionframed.setVisible(true);
	
	exceptionframed.pack();
	// exceptionframed.setSize(1980,1080);
	exceptionframed.setExtendedState( JFrame.MAXIMIZED_BOTH);
    }
}

