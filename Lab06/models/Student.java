package models;

public class Student extends Person
{
    private String neptun;
    private String studentId;

    public Student()
    {
        super();
    }

    public Student(String name, String familyName, String neptun, String studentId){		
		super(name, familyName);
        this.neptun = neptun;
        this.studentId = studentId;
	}

    public String getNeptun(){
		return neptun;
	}
	
	public void setNeptun(String neptun){
		this.neptun = neptun;			
	}

    public String getId(){
		return studentId;
	}
	
	public void setId(String id){
		this.studentId = id;			
	}

    @Override
	public String toString(){
		return super.toString() + "\nNeptun: " + neptun + "\nStudentID: " + studentId + "\n";
	}
}