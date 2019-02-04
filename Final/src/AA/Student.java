package AA;

public class Student {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	

	public Student(String firstname,String lastname, String email)
	{
		
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		
		
	}
	
	public Student(int id,String firstname,String lastname, String email)
	{
		this.id=id;
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		
		
	}
	
	
	
	public int getid()
	{
		return id;
		
		
	}
	public void setid(int id)
	{
		this.id=id;
		
		
	}
	
	public String getfirstname()
	{
		return firstname;
	}
	
	
	public void setfirstname(String firstname)
	{
		
		this.firstname=firstname;
	}
	
	public String getlastname()
	{
		return lastname;
		
	}
	
	public void setlastname(String lastname)
	{
		
		this.lastname=lastname;
		
	}
	public String getemail()
	{
		return email;
		
	}
	public void setemail(String email)
	{
		this.email=email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
}
