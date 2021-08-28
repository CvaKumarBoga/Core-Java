package com.app.app;

public class Employee {
	
	private String name;
	private String dpt;
	private Double sal;
	
	public Employee(String name, String dpt, Double sal) {
		super();
		this.name = name;
		this.dpt = dpt;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dpt=" + dpt + ", sal=" + sal + "]";
	}
	
}
