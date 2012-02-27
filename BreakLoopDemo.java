class BreakLoopDemo{
	public static void main (String args[]){
		int i;
		for(i = 0 ; i<100; i++) {
			System.out.println(i);
			if (i == 10) break;
		}
	}
}
