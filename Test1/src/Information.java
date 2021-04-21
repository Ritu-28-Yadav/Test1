
public class Information {
	private String name;
	private int rollno;
	private double weight;
	private int age;
	public Information(String s,int r,double f,int a) {
		this.name=s;
		this.rollno=r;
		this.weight=f;
		this.age=a;
	}
	public void setName(String n) {
		
		this.name=n;
	}
	public void setRollno(int r) {
		this.rollno=r;
	}
	public void setWeight(int w) {
		this.weight=w;
	}
	
	public void setAge(int a) {
		this.age=a;
	
	}
	public String getName() {
		return name;
		
	}
	public int getRollno() {
		return rollno;
	}
    public double getWeight() {
    	return weight;
    }
    public int getAge() {
    	return age;
    }
    

	public static void main(String[] args) {
		Information i1= new Information("ritu",84,49.8,22);
		Information i2= new Information("rajeev",83,55,22);
		Information i3= new Information("ravi",82,60,22);
		Information i4= new Information("ram",81,50,22);
		System.out.println("Student information");
		System.out.println("Name:"+i1.getName());
		System.out.println("roll no:"+i1.getRollno());
		System.out.println("weight:"+i1.getWeight());
		System.out.println("Age:"+i1.getAge());
		System.out.println("Name:"+i2.getName());
		System.out.println("roll no:"+i2.getRollno());
		System.out.println("weight:"+i2.getWeight());
		System.out.println("Age:"+i2.getAge());
		System.out.println("Name:"+i3.getName());
		System.out.println("roll no:"+i3.getRollno());
		System.out.println("weight:"+i3.getWeight());
		System.out.println("Age:"+i3.getAge());
	}

}
