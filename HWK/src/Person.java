//class for M6Test
public class Person {
	private String name;
	private final static String DEFAULT_NAME = "N/A";
	public Person() {
		this(DEFAULT_NAME);
	}
	public Person(String name) {
		this.name = name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}
	//overrides
	public String toString() {
		return "Name: " + name;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person otherPerson = (Person) obj;
			return name.equalsIgnoreCase(otherPerson.getName());
			} else {
				return false;
			}
	}
}
