
import java.applet.AudioClip;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class soundEffectsMachine implements ActionListener {
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	
	 void showButton() {
		Frame frame=new Frame();
		frame.setVisible(true);
		Panel panel=new Panel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.pack();
	}
	
	public static void main(String[] args) {
	soundEffectsMachine mae=new soundEffectsMachine();
	mae.showButton();
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonPressed=(JButton) e.getSource();
		if(buttonPressed.equals(button1)) {
			playSound("winsound.wav");
		}
		if(buttonPressed.equals(button2)) {
			playSound("oof.wav");
		}
		if(buttonPressed.equals(button3)) {
			playSound("drum.wav");
		}
		if(buttonPressed.equals(button4)) {
			playSound("bell.wav");
		}
	}
}
