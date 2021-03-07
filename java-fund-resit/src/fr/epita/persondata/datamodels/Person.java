package fr.epita.persondata.datamodels;
/**
 * This class contains personal information on a Person
 */
public class Person  implements Comparable<Person> {
	
	// ATTRIBUTES
	private String name;
	private String sex;
	private int age;
	private int height;
	private int weight;
	
	// METHODS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "Person [name= " + name + ", weight= " + weight + "]";
	}
	
	public int compareTo(Person other) {
		return this.height == other.height ? 0 : this.height > other.height ? 1 : -1;
    }
	
	// CONSTRUCTORS
	public Person(String name, String sex, int age, int height, int weight) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	

	public Person() {

	}
	
	
}
