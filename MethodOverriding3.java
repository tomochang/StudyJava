class A3{
	void hello(){
		System.out.println("Hello from A3");
	}
	void hello1(int i){
		System.out.println("Hello from A3" + i);
	}
}

class B3 extends A3 {
	void hello(){
		System.out.println("Hello from B1");
	}
}

class C3 extends B3 {
	void hello(String s){
		System.out.println("Hello from C3" + s);
	}
}

class MethodOverriding3 {
	public static void main(String args[]){
		A3 obj_c = new C3();
		A3 obj_a = new A3();

		obj_a.hello1(3);
		obj_c.hello();
	}
}