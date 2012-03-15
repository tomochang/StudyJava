interface Shape2D{
	double getArea();
}

interface Shape3D{
	double getVolume();
}


class Point3D2{
	double x,y,z;

	public Point3D2(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

abstract class Shape2 {
	abstract void display();
}

class Circle extends Shape2 implements Shape2D {

	Point3D2 center , p; //pは円周上の任意の一点

	double x;
	double y;
	double radius;

	Circle(Point3D2 center, Point3D2 p) {
		this.center = center;
		this.p = p;
	}

	Circle(double x,double y) {
		this(x,y,1);
	}

	Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void display() {
		System.out.println("Circle");
	}


	public double getArea() {
		double dx = center.x - p.x;
		double dy = center.y - p.y;
		double d = dx * dx + dy * dy;
		double radius = Math.sqrt(d);
		return Math.PI * radius * radius;
	}

}

class Sphere extends Shape2 implements Shape3D{
	Point3D2 center;
	double radius;

	Sphere(Point3D2 center, double radius){
		this.center = center;
		this.radius = radius;
	}

	public void display() {
		System.out.println("Sphere");
	}

	public double getVolume() {
		return 4 * Math.PI * radius * radius * radius /3;
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

class Shapes{
	public static void main(String args[]) {
		Circle c = new Circle(new Point3D2(0, 0, 0), new Point3D2(1, 0, 0));

		c.display();
		System.out.println(c.getArea());

		Sphere s = new Sphere(new Point3D2(0, 0, 0), 1);

		s.display();
		System.out.println(s.getVolume());

	}
}

