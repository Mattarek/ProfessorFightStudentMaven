package overriding;

public interface InterfaceTwo {
	default void commonMethod() {
		System.out.println("Domyślna metoda z InterfaceB.");
	}
}