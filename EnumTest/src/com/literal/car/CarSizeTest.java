package com.literal.car;

class Car {
	enum CarSize { LXI, VXI, ZXI };
	CarSize size;
	enum CarMake { HATCHBACK, SEDAN };
	CarMake make;
}


public class CarSizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.size = Car.CarSize.VXI;
		System.out.println("The size of your car is:" + car.size);
		
		car.make = Car.CarMake.HATCHBACK;
		System.out.println("The make of your car is:" + car.make);
			
	}

}
