class Circle {
	double x;
	double y;
	double radius;

	Circle() {
	}

	Circle(double ax, double ay, double aradius){
		x = ax;
		y = ay;
		radius = aradius;
	}
}

class CircleExample {
	public static void main(String args[]){
		Circle c = new Circle( 17.5,16.4,11.3 );

		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.radius);
	}
}