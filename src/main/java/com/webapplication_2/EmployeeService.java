package com.webapplication_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
public String post(Employee e)
{
	return ed.post(e);
}
public String postDetails(List<Employee> e)
{
	return ed.postDetails(e);
}
public List<Employee> getAll()
{
	return ed.getAll();
	}
public Employee get(int id)
{
	return ed.get(id);
}
public String update(int id,Employee e)
{
	return ed.update( id,e);
}
public String delete(int id)
{
	return ed.delete(id);
}
public List<Employee> getAllEmps()
{
	return ed.getAllEmps();
}
public List<Employee> getAge()
{
	return ed.getAge();
}
public List<Object> getSal()
{
	return ed.getSal();
}
public int getname()
{
	return ed.getname();
}
public int getMaxAge()
{
	return ed.getMaxAge();
}
public Employee getMaxEmp()
{
	return ed.getMaxEmp();
}
public List<String> getstart(String s)
{
	return ed.getstart(s);
}
public List<String> getend(String s)
{
	return ed.getend(s);
}
public List<String> getmiddle(String s)
{
	return ed.getmiddle(s);
}
public List<String> getempname(int s,int e)
{
	return ed.getempname(s,e);
}
public List<Employee> getempdetails(String s,int e)
{
	return ed.getempdetails(s,e);
}

public List<Employee> getorder()
{
	return ed.getorder();
}
public List<Object> getcount()
{
	return ed.getcount();
}
public List<Integer> getnondup()
{
	return ed.getnondup();
}
public int getsum()
{
	return ed.getsum();
}
public float getavg()
{
	return ed.getavg();
}
public List<Employee> getbetween()
{
	return ed.getbetween();
}
public List<String> getempOR(String s,String e)
{
	return ed.getempOR(s,e);
}
public List<Employee> getAllEmps(int age)
{
	return ed.getAllEmps(age);
}
public List<Employee> getExpBetween(int e1,int e2)
{
	return ed.getExpBetween(e1,e2);
}
public List<String> getnameAND(int a,String b)
{
	return ed.getnameAND(a,b);
}

public List<String> getexprience(int a,int b,int c)
{
	return ed.getexprience(a,b,c);
}

}
