class Planet {
	static String PlanetName[] = {"earth","moon","jupiter","mars","sun"};
	static int m = PlanetName.length;

}

class SolarSystem {

	SolarSystem(){
	}

	void display(){
		int i;

		for(i = 0; i < Planet.m ; i++){
			System.out.println(Planet.PlanetName[i]);
		}
	}
}

class callSolarSystem{

	public static void main(String args[]){
		SolarSystem test1 = new SolarSystem();
		test1.display();
	}


}