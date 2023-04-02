package com.hashmap;

import java.util.HashMap;

public class CarHashmap {

	public static void main(String[] args) {

		HashMap<Integer, Car> cmap = new HashMap<>();

		cmap.put(1, new Car(1001, "S-Cross", 1200000f));

		Car c1 = new Car(2002, "Swift", 800000f);
		cmap.put(2, c1);
		System.out.println(cmap);

		// Here Swift replace by BMW
		cmap.put(2, new Car(2002, "BMW", 6000000f));
		System.out.println(cmap);

		cmap.put(1, new Car(1001, "Audi", 1000000f));
		System.out.println(cmap);

	}

}
