package come.kh.test.model.vo;

public class Student {
	private String name;
	private int score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=\" + name + \",  score=\""
				+ "				+ score + \"]";
	}
	
	

}
