import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackInTheBox implements ActionListener {
	public static void main(String[] args) {
		jackInTheBox box=new jackInTheBox();
		box.helpme();
		
	}
	public void helpme() {
		button.addActionListener(this);
		button.setText("Surprise");
		frame2.add(button);
		frame2.setVisible(true);
		frame2.pack();
	}

	JButton button = new JButton();
	JFrame frame2= new JFrame();

	public void actionPerformed(ActionEvent event) {
		JButton button2 = (JButton) event.getSource();
		if (button2.equals(button)) {
			new jackInTheBox().playSound("homer-woohoo.wav");
			new jackInTheBox().showPicture("jackInTheBox.png");
		}
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
