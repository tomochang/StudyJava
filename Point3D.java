class Point3D{
	double x;
	double y;
	double z;

	Point3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void move(double x,double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

}

class Point3DConstructor {
	public static void main(String args[]){

		Point3D p = new Point3D(1.1,3.4,-4.7 );

		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);

		p.move(5, 5, 5);
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
	}
}