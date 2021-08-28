package com.app.shallo;

/**
 * Clone is an exact copy of original that means create an object with similar state as the original
 * object.Shallow clone is “default implementation” in Java. In overridden clone method, if you are 
 * not cloning all the object types (not primitives), then you are making a shallow copy.
*/
public class ShallowCopy implements Cloneable{
	
	int stuRollNo;
	String stuName;
	
	public ShallowCopy(int studentRollNo,String studentName) {
		this.stuRollNo = studentRollNo;
		this.stuName = studentName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getStuRollNo() {
		return stuRollNo;
	}

	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return "ShallowCopy [stuRollNo=" + stuRollNo + ", stuName=" + stuName + "]";
	}

}
