import java.io.*;
import java.awt.*;
import java.awt.event.*; // For the sake of action listeners
import java.awt.Color.*;
import java.awt.Window.*;
import javax.swing.*;
import java.util.Random;
import javax.sound.sampled.*;
import java.util.concurrent.TimeUnit;

class Panel3 extends JPanel {
    public Image bg = new ImageIcon("./Resources/theGrass.png").getImage();
    
    Panel3() {
	super( new GridLayout(55, 55));
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}

class Panel1 extends JPanel {
    public Image bg = new ImageIcon("./Resources/theCommentator.png").getImage();
    
    Panel1() {
	super( new FlowLayout());
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}


class Panel5 extends JPanel {
    public Image bg = new ImageIcon("./Resources/theJudges.png").getImage();
    
    Panel5() {
	super( new FlowLayout());
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}
