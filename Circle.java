class Circle {
	double x;
	double y;
	double radius;

	Circle(double x) {
		this(x,0,1);
	}

	Circle(double x,double y) {
		this(x,y,1);
	}

	Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
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