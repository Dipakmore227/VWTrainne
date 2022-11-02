package com.classesobject;

public class Employee {

   private int empid;
   private String empname;
   private double salary;
   private int deptid;
   
   
   
public Employee(int empid, String empname, double salary, int deptid) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
	this.deptid = deptid;
}

public Employee(Employee x) {
	super();
	this.empid = x.empid;
	this.empname = x.empname;
	this.salary = x.salary;
	this.deptid = x.deptid;
}


public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public int getEmpid() {
	return empid;
}


public double calcAnnSal()
{
    return this.salary * 12;
}

//function overloading  - static/compile time polymorphism

public double calcAnnSal(double bonus)
{
    return (this.salary * 12)+bonus;
}


public void display()
{
    //this
    System.out.println("details:"+this.empid+","+this.empname+","+this.salary+","+this.deptid);
    //System.out.println(empid+","+this.empname+","+this.salary+","+this.deptno);
    
    
}


@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", deptid=" + deptid + "]";
}
   


   
   
}
