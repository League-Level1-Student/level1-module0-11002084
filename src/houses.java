import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot bob = new Robot();

	public static void main(String[] args) {
		bob.hide();
		bob.setPenWidth(5);
		bob.moveTo(50, 500);
		bob.setSpeed(1000);
		bob.penDown();
		for (int i = 0; i < 10; i++) {
			building();
		}
	}

	static void building() {
		bob.setRandomPenColor();
		bob.move(100);
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
		bob.move(100);
		bob.turn(270);
		bob.setPenColor(0, 255, 0);
		bob.move(20);
		bob.turn(270);
	}
}
