package chap15.textbook.s150401;

class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sno;
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
		if (sno != other.sno)
			return false;
		return true;
	}
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			return (sno==student.sno) && (name.equals(student.name));
//		} else {
//			return false;
//		}
//	}
//	
//	public int hashCode() {
//		return sno + name.hashCode();
//	}
}
