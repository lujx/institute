package grammer.myInterface;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee> {
//instance fields
private String name;
private double salary;
private Date hireDay;

//constructor
public Employee(String name,double salary, int year, int month, int day){
	this.name=name;
	this.salary=salary;
	GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
	this.hireDay=calendar.getTime();
}

@Override
public int compareTo(Employee other) {
	return Double.compare(salary, other.salary);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public Date getHireDay() {
	return hireDay;
}

public void setHireDay(Date hireDay) {
	this.hireDay = hireDay;
}
}
