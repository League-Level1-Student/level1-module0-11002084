import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JButton button = new JButton();

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed.equals(button)) {
			System.out.println("Button clicked");
			int rand = new Random().nextInt(5);
			if (rand == 0) {
				System.out.println("YOU LIKE ROBLOX DESPACITO SPIDER");
			} else if (rand == 1) {
				System.out.println("YOU WILL DIE");
			} else if (rand == 2) {
				System.out.println("You could've achieved great wealth, but you missed your chance.");
			} else if (rand == 3) {
				System.out.println("You could've been with your deepest love, but fear held you back.");
			} else if (rand == 4) {
				System.out.println("You will become a meme format.");
			}
			JOptionPane.showMessageDialog(null, "Woohoo");
		}
	}

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}
}
