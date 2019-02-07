package artistry.enums;

public enum JiraBoardTypes {

	SCRUM("Scrum", "scrum"), KANBAN("Kanban", "kanban");

	private final String key;
	private final String value;

	JiraBoardTypes(String key, String value) {
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