package day0809;

public class Member0809 {
	private String name, hp, gender;
	
	public Member0809() {
		
	}
	
	public Member0809(String name, String hp, String gender) {
		super();
		this.name = name;
		this.hp = hp;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
