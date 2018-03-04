//class for M6Test
public class Instructor extends Person{
	private String subject;
	private final static String DEFAULT_SUBJECT = "N/A";
	public Instructor()
	{
		subject=DEFAULT_SUBJECT;
	}
	public Instructor(String name,String defaultSub) {
		super(name);
		this.subject=defaultSub;
	}
	//setter
	public void setSubject(String sub)
	{
		this.subject=sub;
	}
	//getter
	public String getSubject()
	{
		return subject;
	}
	@Override
	public String toString()
	{
		String x;
		x="Name: "+getName()+"\n";
		x+="Subject: "+subject;
		return x;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Instructor)
		{
			Instructor teach=(Instructor) obj;
			boolean sameName,sameSub;
			//compare 
			if(getName().equalsIgnoreCase(teach.getName())){
				sameName=true;
			}
			else
			{
				sameName=false;
			}
			if(subject.equalsIgnoreCase(getSubject()))
			{
				sameSub=true;
			}
			else
			{
				sameSub=false;
			}
			return sameName&&sameSub;
		}
		else
		{
			return false;
		}
	}
}
