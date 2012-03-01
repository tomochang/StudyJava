class X {
	static int array[];

	static {
		array = new int[6];
		for(int i = 0; i < 6; i++)
			array[i] = i;
	}
}


class StaticInitializationBlock {
	public static void main( String args[]){
		for(int i = 0; i < 6; i++)
			System.out.println(X.array[i]);
	}
}