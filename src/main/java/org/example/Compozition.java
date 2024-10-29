package org.example;

class Compozition {
	private String model = "SUV";
	private Horn horn;

	public Compozition() {
		this.horn = new Horn(); // Inicjalizacja obiektu Horn w konstruktorze
	}

	public void honk() {
		horn.honk();
	}

	public void displayModel() {
		System.out.println("Model: " + model);
	}
}
