package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private String id;
	
	private Integer empId;
	private String empName;
	private Double empCode;
	public Employee() {
		super();
	}
	public Employee(Integer empId, String empName, Double empCode) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCode = empCode;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpCode() {
		return empCode;
	}
	public void setEmpCode(Double empCode) {
		this.empCode = empCode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", empCode=" + empCode + "]";
	}
		
}
