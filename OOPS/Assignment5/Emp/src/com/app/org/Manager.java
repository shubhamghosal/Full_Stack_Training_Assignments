  
package com.app.org;

public class Manager extends Emp {
    private double performanceBonus;
    
	public Manager(int id, String name, String deptId, double basic, double performanceBonus) {
		super(id, name, deptId, basic);
		this.performanceBonus = performanceBonus;
	}

	@Override
    public String toString(){
        return "Manager [id=" + id + ", name=" + name + ", deptId=" + deptId + ", basic=" + basic + ", performanceBonus=" + performanceBonus + ", NetSalary=" + this.computeNetSalary() + "]";
    }
	
	@Override
    public double computeNetSalary(){
        return basic + this.performanceBonus;
    }

    public double getPerformanceBonus(){
        return this.performanceBonus;
    }

	public void setPerformanceBonus(double performanceBonus) {
		this.performanceBonus = performanceBonus;
	}
    
}