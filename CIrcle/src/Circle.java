
public class Circle {
	String m_color = null;
	double m_radius;

	public static void main(String[] args) {
		Circle bigCircle = new Circle(10);
		Circle smallCircle = new Circle(5, "Blue");
		double area = smallCircle.CalculateArea();
		System.out.println(smallCircle.m_color
				+ " is the color of the small circle and "
				+ smallCircle.m_radius + " is the radius of the small circle");
		System.out.println("we have the small circle area of "
				+ smallCircle.CalculateArea() + " and a color of "
				+ smallCircle.m_color);
		smallCircle.PrintColor();
		System.out.println(
				bigCircle.m_radius + " is the radius of the big circle");
		System.out.println(
				"The area of the big Circle is " + bigCircle.CalculateArea());
		System.out.println(
				"Just so we are sure the area of the small area is " + area);
	}
	Circle(int radius) {
		m_radius = radius;
		m_color = "grey";
	}
	Circle(int radius, String color) {
		m_radius = radius;
		m_color = color;
	}
	double CalculateArea() {
		double area = 3.14 * m_radius * m_radius;
		return area;
	}
	void PrintColor() {
		System.out.println("My color is " + " " + m_color);
	}

}
