package SortOfClasses;

public class OuterClass {
	private static final String staticOuterField = "Static Outer Field";
	private final String nonStaticOuterField = "NonStatic Outer Field";

	public static void main(final String[] args) {
		final OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		final OuterClass.StaticNestedClassTest nonNestedObject = new OuterClass.StaticNestedClassTest();
		nestedObject.display();
	}

	// Static nested class
	static class StaticNestedClass {
		void display() {
			// Accessing static member of the outer class
			System.out.println("Accessing: " + staticOuterField);
		}
	}

	static class StaticNestedClassTest {
		void display() {
			// Accessing static member of the outer class
			System.out.println("Accessing: " + staticOuterField);
		}
	}
}
