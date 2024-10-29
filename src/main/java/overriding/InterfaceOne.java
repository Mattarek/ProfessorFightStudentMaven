package overriding;

public interface InterfaceOne {
	default void commonMethod() {
		System.out.println("Domyślna metoda z InterfaceA.");
	}
}
