package com.webapplication_2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Employee")
public class EmployeeController {
@Autowired
EmployeeService es;
@PostMapping(value="/PostEmployee")
public String post(@RequestBody Employee e)
{
	return es.post(e);
}
@PostMapping(value="/PostEmployeeDetails")
public String postDetails(@RequestBody List<Employee> e)
{
return es.postDetails(e);	
}
@GetMapping(value="/GetAll")
public List<Employee> getAll()
{
	return es.getAll();
}
@GetMapping(value="/Get/{id}")
public Employee get(@PathVariable int id)
{
	return es.get(id);
}
@PutMapping(value="/UpdateEmployee/{id}")
public String update(@PathVariable int id,@RequestBody Employee e)
{
	return es.update(id,e);
}
@DeleteMapping(value="/DeleteEmployee/{id}")
	public String delete(@PathVariable int id)
	{
		return es.delete(id);
	}
@GetMapping(value="/GetAllEmployee")
public List<Employee> getAllEmps()
{
	return es.getAllEmps();
}
@GetMapping(value="/GetAgeEmployee")
public List<Employee> getAge()
{
	return es.getAge();
}
@GetMapping(value="/GetSalEmployee")
public List<Object> getSal()
{
	return es.getSal();
}
@GetMapping(value="/GetNameCount")
public int getname()
{
	return es.getname();
}
@GetMapping(value="/GetMaxAge")
public int getMaxAge()
{
	return es.getMaxAge();
}
@GetMapping(value="/GetMaxEmployee")
public Employee getMaxEmp()
{
	return es.getMaxEmp();
}
@GetMapping(value="/GetStartName/{s}")
public List<String> getstart(@PathVariable String s)
{
	return es.getstart(s);
}
@GetMapping(value="/GetEndName/{s}")
public List<String> getend(@PathVariable String s)
{
	return es.getend(s);
}
@GetMapping(value="/GetMiddleName/{s}")
public List<String> getmiddle(@PathVariable String s)
{
	return es.getmiddle(s);
}
@GetMapping(value="/GetEmpName/{s},{e}")
public List<String> getempname(@PathVariable int s,@PathVariable int e)
{
	return es.getempname(s,e);
}
@GetMapping(value="/GetEmpDetails/{s}/{e}")
public List<Employee> getempdetails(@PathVariable String s,@PathVariable int e)
{
	return es.getempdetails(s,e);
}
@GetMapping(value="/GetEmpOrder")
public List<Employee> getorder()
{
	return es.getorder();
}
@GetMapping(value="/GetEmpCount")
public List<Object> getcount()
{
	return es.getcount();
}
@GetMapping(value="/GetNonDupCount")
public List<Integer> getnondup()
{
	return es.getnondup();
}
@GetMapping(value="/GetSumExp")
public int getsum()
{
	return es.getsum();
}
@GetMapping(value="/GetEmpAvg")
public float getavg()
{
	return es.getavg();
}
@GetMapping(value="/GetEmpOR/{s}/{e}")
public List<String> getempOR(@PathVariable String s,@PathVariable String e)
{
	return es.getempOR(s,e);
}
@GetMapping(value="/GetAllEmps/{age}")
public List<Employee> getAllEmps(@PathVariable int age)
{
	return es.getAllEmps(age);
}

@GetMapping(value="/GetExpBetween/{e1}/{e2}")
public List<Employee> getExpBetween(@PathVariable int e1,@PathVariable int e2)
{
	return es.getExpBetween(e1,e2);
}

@GetMapping(value="/GetNameAND/{a}/{b}")
public List<String> getnameAND(@PathVariable int a,@PathVariable String b)
{
	return es.getnameAND(a,b);
}

@GetMapping(value="/Getexprience/{a}/{b}/{c}")
public List<String> getexprience(@PathVariable int a,@PathVariable int b,@PathVariable int c)
{
	return es.getexprience(a,b,c);
}


}

