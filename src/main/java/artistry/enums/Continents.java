package artistry.enums;

public enum Continents {

	AF("Africa", "AF"), AS("Asia", "AS"), EU("Europe", "EU"), NA("North America", "NA"), OC("Oceania",
			"OC"), SA("South America", "SA"), AN("Antarctica", "AN");

	private final String key;
	private final String value;

	Continents(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
