package com.app;

/* Clone is an exact copy of original that means create an object with similar state as the original
 * object.
 * 
 * In DeepCopy we create a clone which independent of original object and making changes an the
 * clone object should not effected original object. 
 */

public class DeepCopy implements Cloneable{
	int stuId;
	String stuName;
	String stuCourse;
	
	public DeepCopy(int studentId,String studentName,String studentCourse) {
		this.stuId = studentId;
		this.stuName = studentName;
		this.stuCourse = studentCourse;
	}
	
	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public String getStuCourse() {
		return stuCourse;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuCourse(String stuCourse) {
		this.stuCourse = stuCourse;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepCopy student = (DeepCopy) super.clone();
		String course = student.getStuCourse();
		student.setStuCourse(this.stuCourse);
		return student;
	}
}
