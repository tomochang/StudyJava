interface AntiLockBrakes {
	void antiLockBrakes();
}

interface CruiseControl {
	void cruiseControl();
}

interface PowerSteering {
	void powerSteering();
}

abstract class Auto {

}

class Model1 extends Auto implements PowerSteering {
	public void powerSteering() {
		System.out.println("Model1");
	}
}

class Model2 extends Auto {

}

class Model3 extends Auto {

}

class Interfece7_1_6 {

	public static void main(String args[]) {
		Model1 model1 = new Model1();
		model1.powerSteering();
	}
}