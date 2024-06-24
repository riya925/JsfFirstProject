public class Student
{
	int sid;
	String sna;
	int sag;
	
	public String nextPage()
	{
		return "output";
	}
	
	public Student()
	{ }

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSna() {
		return sna;
	}

	public void setSna(String sna) {
		this.sna = sna;
	}

	public int getSag() {
		return sag;
	}

	public void setSag(int sag) {
		this.sag = sag;
	}
}