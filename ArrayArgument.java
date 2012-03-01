class ArrayArgument {
	public static void main(String args[]){
		int x[]= {11,12,13,14,15};

		display(x);

		change(x);

		display(x);
	}

	public static void change(int x[]) {
		//int x[] ={21,22,23,24,25};

		x[0]=21;

		//x = y;
	}

	public static void display(int x[]) {
		for(int i= 0; i < x.length; i++)
			System.out.print(x[i] + "");
		System.out.println(" ");
	}

}

