package com.waiyanhtet.design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees  implements Cloneable {

	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<>();
	}
	
	public Employees(List<String> list) {
		empList = list;
	}
	
	public void loadData() {
		empList.add("Aung");
		empList.add("Thaung");
		empList.add("Maung");
	}
	
	public List<String> getEmpList() {
		return empList;
	} 
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		var list = new ArrayList<String>();
		for(String emp : this.getEmpList()) {
			list.add(emp);
		}
		
		return new Employees(list);
	}
}
