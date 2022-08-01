package com.waiyanhtet.test;

import com.waiyanhtet.design.pattern.creational.prototype.Employees;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees e1 = new Employees();
		e1.loadData(); //if we not clone, we will load database for every time

		var cloneEmp1 = (Employees) e1.clone();
		var cloneEmp2 = (Employees) e1.clone();
		
		var cloneEmp1_List = cloneEmp1.getEmpList();
		cloneEmp1_List.add("Saung");
		
		var cloneEmp2_List = cloneEmp2.getEmpList();
		cloneEmp2_List.remove(2);
		
		System.out.println(cloneEmp1 == cloneEmp2);
		System.out.println("Original Emp List " + e1.getEmpList());
		System.out.println("Clone Emp 1 List " + cloneEmp1.getEmpList());
		System.out.println("Clone Emp 2 List " + cloneEmp2.getEmpList());
	}
}
