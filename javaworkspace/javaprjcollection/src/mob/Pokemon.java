package mob;

public class Pokemon {
	
	public Pokemon(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	public String name;
	public String skill;

	public void skillInfo() {
		System.out.println(name+skill);
	}
	
	
}
