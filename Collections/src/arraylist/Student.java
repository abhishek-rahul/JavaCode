package arraylist;

public class Student {
	public int roll ;
	public int age ;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + "]";
	}

	public Student(int roll,int age){
		this.roll = roll ;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.age*this.roll;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		if(obj instanceof Student)
		{
			Student ptr = (Student) obj ;
			if(this.age == ptr.age && this.roll == ptr.roll)
				ret = true;
		}
		return ret;
	}
	

}
