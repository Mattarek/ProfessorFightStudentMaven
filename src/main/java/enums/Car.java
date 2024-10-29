package enums;

public enum Car {
	PASSAT("white", 2020) {
		@Override
		public Car getIfMissing() {
			return GOLF;
		}

		@Override
		public Car getIfaMissing() {
			return OPEL;
		}
	},
	GOLF("red", 1020) {
		@Override
		public Car getIfMissing() {
			return OPEL;
		}

		@Override
		public Car getIfaMissing() {
			return OPEL;
		}
	},
	OPEL("green", 2009) {
		@Override
		public Car getIfMissing() {
			return VOLVO;
		}

		@Override
		public Car getIfaMissing() {
			return OPEL;
		}
	},
	VOLVO("yellow", 2010) {
		@Override
		public Car getIfMissing() {
			return EFESO;
		}

		@Override
		public Car getIfaMissing() {
			return OPEL;
		}
	},
	EFESO("brown", 1989) {
		@Override
		public Car getIfMissing() {
			return PASSAT;
		}

		@Override
		public Car getIfaMissing() {
			return OPEL;
		}
	};
	private final String color;
	private final int productionYear;

	Car(final String color, final int productionYear) {
		this.color = color;
		this.productionYear = productionYear;
	}

	public abstract Car getIfMissing();

	public abstract Car getIfaMissing();
}


