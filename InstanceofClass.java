abstract class Fish {
	abstract void display();
}

abstract class FreshWaterFish extends Fish {
	
}

abstract class SaltWaterFish extends Fish {
	
}

class Trout extends FreshWaterFish {
	void display(){
		System.out.println("Tout");
	}
}

class Flounder extends SaltWaterFish {
	void display(){
		System.out.println("Flounder");
	}
}

class Tuna extends SaltWaterFish {
	void display(){
		System.out.println("Tuna");
	}
}

class InstanceofClass {
	public final static int NUMFISH = 4;
	public static void main(String args[]){
		Fish fishes[] = new Fish[NUMFISH];
		
		fishes[0] = new Trout();
		fishes[1] = new Flounder();
		fishes[2] = new Tuna();
		fishes[3] = new Trout();
		
		for(int i =0; i < NUMFISH; i++){
			Fish fish = fishes[i];
			if(fish instanceof SaltWaterFish){
				fish.display();
			}
		}
		
		
	}
}