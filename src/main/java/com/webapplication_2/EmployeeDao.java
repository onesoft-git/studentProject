package com.webapplication_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String post(Employee e) 
	{
		er.save(e);
		return "Saved Successfully";
	}
	public String postDetails(List<Employee> e)
	{
		er.saveAll(e);
		return "Saved Successfully";
	}
	public List<Employee> getAll()
	{
		return er.findAll();
	}
	public Employee get(int id)
	{
		return er.findById(id).get();
	}
	public String update(int id,Employee e)
	{
		Employee emp=er.findById(id).get();
		emp.setName(e.getName());
		emp.setAge(e.getAge());
		emp.setGender(e.getGender());
		emp.setSalary(e.getSalary());
		emp.setExprience(e.getExprience());
		er.save(emp);
		return "Updated Successfully";
	}
	public String delete(int id)
	{
		er.deleteById(id);
		return "Deleted Successfully";
	}
	public List<Employee> getAllEmps()
	{
		return er.getAllEmps();
	}
	public List<Employee> getAge()
	{
		return er.getAge();
	}
	public List<Object> getSal()
	{
		return er.getSal();
	}
	public int getname()
	{
		return er.getname();
	}
	public int getMaxAge()
	{
		return er.getMaxAge();
	}
	public Employee getMaxEmp()
	{
		return er.getMaxEmp();
	}
	public List<String> getstart(String s)
	{
		return er.getstart(s);
	}
	public List<String> getend(String s)
	{
		return er.getend(s);
	}
	public List<String> getmiddle(String s)
	{
		return er.getmiddle(s);
	}
	public List<String> getempname(int s,int e)
	{
		return er.getempname(s,e);
	}
	public List<Employee> getempdetails(String s,int e)
	{
		return er.getempdetails(s,e);
	}

	public List<Employee> getorder()
	{
		return er.getorder();
	}
	public List<Object> getcount()
	{
		return er.getcount();
	}
	public List<Integer> getnondup()
	{
		return er.getnondup();
	}
	public int getsum()
	{
		return er.getsum();
	}
	public float getavg()
	{
		return er.getavg();
	}
	public List<Employee> getbetween()
	{
		return er.getbetween();
	}
	public List<String> getempOR(String s,String e)
	{
		return er.getempOR(s,e);
	}
	public List<Employee> getAllEmps(int age)
	{
		return er.getAllEmps(age);
	}
	public List<Employee> getExpBetween(int e1,int e2)
	{
		return er.getExpBetween(e1,e2);
	}
	public List<String> getnameAND(int a,String b)
	{
		return er.getnameAND(a,b);
	}
	public List<String> getexprience(int a,int b,int c)
	{
		return er.getexprience(a,b,c);
	}
	
}
