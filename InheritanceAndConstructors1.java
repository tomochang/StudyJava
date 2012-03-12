class S1{
	int s1;
	S1() {
		System.out.println("S1 Constructor");
		s1 = 1;
	}
}

class T1 extends S1{
	int t1;
	T1() {
		System.out.println("T1 Constructor");
		t1 =2;
	}
}

abstract class U1 extends T1{
	int u1;
	U1() {
		System.out.println("U1 Constructor");
		u1 = 3;
	}

	public final void display() {
		predisplay();
		System.out.println("test");
		sufdisplay();
	}

	abstract protected void sufdisplay();

	protected void predisplay() {
	}
}

class InheritanceAndConstructors1 {
	public static void main(String args[]){

		U1 u1;
		int i = 2;
	if (i == 1){
		u1 =  new U1(){

			@Override
			protected void sufdisplay() {
				// TODO 自動生成されたメソッド・スタブ

			}

		};
	} else {
		u1 =  new U1(){
			@Override
			protected void predisplay() {
				System.out.println("pre2");
			}

			@Override
			protected void sufdisplay() {
				// TODO 自動生成されたメソッド・スタブ

			}


		};
	}
//		System.out.println(u1.s1);
//		System.out.println(u1.t1);
//		System.out.println(u1.u1);

		u1.display();
	}
}