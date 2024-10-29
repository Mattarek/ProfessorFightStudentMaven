package enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final Car cars = Car.OPEL;
		// Alternatywnie
		// Volkswagen volkswagen = Volkswagen.valueOf("OPEL");

		final Car opel = Car.valueOf("OPEL"); // Litery muszą być tak samo
		final Car passat = Car.valueOf("PASSAT");
		final Car efeso = Car.valueOf("EFESO");

		//		System.out.println(opel);
		//		System.out.println(opel.ordinal());
		//
		//		System.out.println(passat);
		//		System.out.println(passat.ordinal());
		//
		//		System.out.println(efeso);
		//		System.out.println(efeso.ordinal());

		// Wywołanie z typem list
		System.out.println(Arrays.asList(Car.values()));

		// Wywołanie z typem string
		final Car carr = Car.values()[1];
		System.out.println(cars.ordinal());
		System.out.println(Car.valueOf("OPEL"));
		System.out.println(cars.name());
		System.out.println(cars.getIfMissing());
		System.out.println(cars.getIfaMissing());
	}
}
