class EmptyCase {
	public static void main(String args[]){
		char ch = args[0].charAt(0);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'u':
		case 'o':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
			break;
		}
	}
}