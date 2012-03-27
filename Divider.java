class Divider{
	public static void main(String args[]){
		try{
			System.out.println("Before Division");
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i / j);
			System.out.println("After Division");
		}
		// 0で除算時の例外
		catch ( ArithmeticException e ){
			System.out.println("ArithmeticException");
		}
		// 引数不足時の例外
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		// 非整数時の例外
		catch (NumberFormatException e){
			System.out.println("NumberFormatException");
		}
		finally{
			System.out.println("Finally Block");
		}
	}
}