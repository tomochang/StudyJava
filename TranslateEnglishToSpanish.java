class TranslaterToSpanish{
	static String input(String a){

		String spanish;


	    if (a.equalsIgnoreCase("One"))
	        spanish = "Uno";
	    else if (a.equalsIgnoreCase("Two"))
			spanish ="Dos";
	    else if (a.equalsIgnoreCase("Three"))
			spanish ="Tres";
		else
			spanish ="plz write a One or Two or Three.";

	    return spanish;
	}

}

class TranslateEnglishToSpanish{
	public static void main(String args[]){
		System.out.println(TranslaterToSpanish.input(args[0]));
	}
}