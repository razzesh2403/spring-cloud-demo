package com.example.demo.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="employee")  
public class Employee {  
private int id;  
private String name;  
private float salary;  

public Employee() {
	id = 0;
	name="";
	salary=0.0f;
}
public Employee(int id, String name, float salary){
	this.id = id;
	this.name = name;
	this.salary = salary;
}
  
@XmlAttribute(name="id")  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
@XmlElement(name="name")  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
@XmlElement(name="salary")  
public float getSalary() {  
    return salary;  
}  
public void setSalary(float salary) {  
    this.salary = salary;  
}  
}  
