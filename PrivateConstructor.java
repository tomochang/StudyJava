class Person {
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(){

	}
}

class PrivateConstructor{
	public static void main(String args[]){
		// publicコンストラクタはよびだせる
		Person p1 = new  Person("John",30);
		System.out.println(p1.name);
		System.out.println(p1.age);

		Person p2 = new Person();
		System.out.println(p2.name);	//初期化してないからnullになる
		System.out.println(p2.age);		//初期化してないから0になる
	}
}