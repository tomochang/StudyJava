abstract class Vehicle{
	abstract void numWheels();
}

class Car extends Vehicle{
	@Override
	void numWheels() {
		System.out.println("Car");
	}
}

class Truck extends Vehicle{
	public Truck() {
		System.out.println("Yeah!!");
	}

	void numWheels() {
		System.out.println("Truck");
	}
}

class VehicleDemo{
	public static void main(String args[]){
		Car car = new Car();
		Truck truck = new Truck();

		car.numWheels();
		truck.numWheels();
	}
}