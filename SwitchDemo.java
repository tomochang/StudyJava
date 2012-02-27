class SwitchDemo {
	public static void main(String args[]){
		int i = Integer.parseInt(args[0]);
		switch (i) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("Unrecoginized Number");
			break;
		}
	}
}