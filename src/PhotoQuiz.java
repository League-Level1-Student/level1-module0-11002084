/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image = "http://www.btrtoday.com/wp-content/uploads/391.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image2;
		// 3. use the "createImage()" method below to initialize your Component
		image2 = createImage(image);
		// 4. add the image to the quiz window
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.add(image2);
		frame.add(panel);

		// 5. call the pack() method on the quiz window
		frame.pack();
		// 6. ask a question that relates to the image
		int answer=JOptionPane.showConfirmDialog(null, "GIVE MOTH LAMP?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer==0) {
			JOptionPane.showMessageDialog(null, "MOTH HAPPY");
		}
		// 8. print "INCORRECT" if the answer is wrong
		if(answer==1) {
			JOptionPane.showMessageDialog(null, "MOTH AnGRy");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		panel.remove(image2);
		// 10. find another image and create it (might take more than one line of code)
		String image3="http://pm1.narvii.com/6413/c27d88e4b65993a25ae33500768541ac57027bc1_00.jpg";
		Component image4;
		image4= createImage(image3);
		panel.add(image4);
		frame.add(panel);
		// 11. add the second image to the quiz window
		// 12. pack the quiz window
		frame.pack();
		// 13. ask another question
		String answer2=JOptionPane.showInputDialog("Who is this character?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answer2.equals("Mae Borowski")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		String answer3=JOptionPane.showInputDialog("Will she beat you up with a baseball bat?");
		if(answer3.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Yeah you're screwed");
		}
		else if(answer3.equals("probably")) {
			JOptionPane.showMessageDialog(null, "yeah you're probably screwed");
		}
		else if(answer3.equals("no")) {
			JOptionPane.showMessageDialog(null, "THEN RUN");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not an answer. *Decks you with baseball bat*");
		}
		frame.remove(panel);
	}

	private static void pack() {
		// TODO Auto-generated method stub

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
