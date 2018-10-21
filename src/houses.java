import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot bob = new Robot();
	static int b = 0;
	static int c=0;
	static int d=0;
	static int e=0;

	public static void main(String[] args) {
		bob.hide();
		bob.setPenWidth(5);
		bob.moveTo(50, 500);
		bob.setSpeed(1000);
		bob.penDown();
		for (int i = 0; i < 10; i++) {
			String color= JOptionPane.showInputDialog("What color do you want your building to be?");
			if(color.equals("red")) {
				c=255;
				d=0;
				e=0;
			}
			if(color.equals("green")) {
				c=0;
				d=255;
				e=0;
			}
			if(color.equals("blue")) {
				c=0;
				d=0;
				e=255;
			}
			String answer = JOptionPane.showInputDialog("What size do you want your building to be?");
			if (answer.equals("small")) {
				b = 60;
				drawPointyRoof(b, c, d, e);
			} else if (answer.equals("medium")) {
				b = 120;
				drawPointyRoof(b, c, d, e);
			} else if (answer.equals("large")) {
				b = 250;
				drawFlatRoof(b, c, d, e);
			}
		}
	}

	static void drawFlatRoof(int a, int b, int c, int d) {
		bob.setPenColor(b,c,d);
		bob.move(a);
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
		bob.move(a);
		bob.turn(270);
		bob.setPenColor(0, 255,0);
		bob.move(20);
		bob.turn(270);
	}
	static void drawPointyRoof(int a, int b, int c, int d) {
		bob.setPenColor(b,c,d);
		bob.move(a);
		bob.turn(45);
		bob.move(30);
		bob.turn(90);
		bob.move(30);
		bob.turn(45);
		bob.move(a);
		bob.turn(270);
		bob.setPenColor(0, 255,0);
		bob.move(20);
		bob.turn(270);
	}
}
