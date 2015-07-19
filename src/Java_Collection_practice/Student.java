package Java_Collection_practice;

public class Student extends Person implements Comparable {

	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, int score, String school){
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student stu = (Student) o;
			return -(this.score - stu.score);       //按分数排序  
//			return -this.name.compareTo(stu.name);   //按名字排序
		}else {
			throw new ClassCastException("不是一个student对象");
		}
	}
}
