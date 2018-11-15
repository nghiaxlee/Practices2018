package models;

public class Teacher extends Person
{
    private String neptun;
    private String taxId;

    public Teacher()
    {
        super();
    }

    public Teacher(String name, String familyName, String neptun, String taxId){		
		super(name, familyName);
        this.neptun = neptun;
        this.taxId = taxId;
	}

    public String getNeptun(){
		return neptun;
	}
	
	public void setNeptun(String neptun){
		this.neptun = neptun;			
	}

    public String getId(){
		return taxId;
	}
	
	public void setId(String id){
		this.taxId = id;			
	}

    @Override
	public String toString(){
		return super.toString() + "\nNeptun: " + neptun + "\ntaxID: " + TaxId + "\n";
	}
}