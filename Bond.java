class Bond {

	void display(){
		System.out.println("Bond");
	}
}

class ConvertibleBond extends Bond {

	void display(){
		System.out.println("Convertible Bond");
	}
}

class displayBond {

	public static void main(String args[]){
		Bond [] bondArgs = new Bond [6];

		for(int i = 0; i<6; i++) {
			if (i < 3 ) {
				bondArgs[i] = new Bond();

			} else {
				bondArgs[i] = new ConvertibleBond();
			}
			bondArgs[i].display();
		}
	}
}