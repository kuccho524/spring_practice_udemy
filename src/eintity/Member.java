package eintity;

public class Member {
	
	// �t�B�[���h��錾����
	private int id;
	private String name;
	private String email;
	
	// �R���X�g���N�^���`
	public Member() {}

	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	// getter, setter���`
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	

}
