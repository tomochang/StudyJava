class Circle {
	double x;
	double y;
	double radius;
}

class CircleExample {
	public static void main(String args[]){
		Circle c = new Circle();
		c.x=12.1;
		c.y=24.5;
		c.radius=4;
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.radius);
	}
}