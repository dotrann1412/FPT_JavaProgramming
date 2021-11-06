public class Tester 
{
	public static void main(String[] args) {
		Car c = new Car();
		c.pressStartButton();
		c.pressAcceleratorButton();
		c.output();

		System.out.println();

		Car c2 = new Car("red", 10, true, true);
		c2.pressStartButton();
		c2.pressAcceleratorButton();
		c2.output();
	}
}