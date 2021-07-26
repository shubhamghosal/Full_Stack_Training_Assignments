package no_itc;

public class Emp {
	private int id;
	private String name,deptId;
	private double sal;
	public Emp(int id, String name, String deptId, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDeptId() {
		return deptId;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", sal=" + sal + "]";
	}
	
	

}
