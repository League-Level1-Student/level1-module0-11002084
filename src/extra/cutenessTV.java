package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void showButton() {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton button1=new JButton();
		JButton button2=new JButton();
		JButton button3=new JButton();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
	}
	public static void main(String[] args) {
		cutenessTV TV=new cutenessTV();
		TV.showButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed=(JButton) e.getSource();
		if(buttonpressed.equals(button1)) {
			showDucks();
		}
		
	}
}
