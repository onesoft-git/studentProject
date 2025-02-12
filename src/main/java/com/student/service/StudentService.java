package com.student.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.customException.AgeException;
import com.student.dao.StudentDao;
import com.student.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public String post(Student s) throws AgeException
	{	
		if(s.getAge()>18) 
		{
		return sd.post(s);
		}
		else 
		{
			throw new AgeException("not valid");
		}
		
	}
	public String postdetails(List<Student> s)
	{
		return sd.postdetails(s);
	}
	public List<Student> getall()
	{
		return sd.getall();
	}
	public Student get(int id)
	{
		return sd.get(id);
	}
	public String update(int id,Student s)
	{
		return sd.update(id,s);
	}
	public String delete(int id)
	{
		return sd.delete(id);
	}
	public List<Student> getEEE()
	{
		return sd.getEEE().stream().filter(x->x.getDepartment().equals("EEE")).collect(Collectors.toList());
	}
	public List<Student> getsort()
	{
		return sd.getsort().stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getDepartment)).collect(Collectors.toList());
	}
	public Map<String,Long> getgroup()
	{
		return sd.getgroup().stream().collect(Collectors.groupingBy(x->x.getDepartment(),Collectors.counting()));
	}
	public String postStudent(Student s)
	{
		if(s.getAge()<22)
		{
			return  sd.postStudent(s);
		}
		else
		{
			return "Age is not Eligible object not posted";
		}
	}
	public String postValid(List<Student> s)
	{
	List<Student>res=s.stream().filter(x->x.getAge()<22).collect(Collectors.toList());
	return sd.postdetails(res);
	}
	public Student getMax()
	{
		Student secondMax= sd.getall().stream().sorted(Comparator.comparing(Student::getAge).reversed()).findFirst().get();
		Student secondMax1 = sd.getall().stream().filter(x->x.getAge()!=secondMax.getAge()).sorted(Comparator.comparing(Student::getAge).reversed()).findFirst().get();
			
        return secondMax1;
	}
	public String postname(Student s)
	{
		if(s.getName()!=null && !s.getName().isBlank())
		{
			return sd.postname(s);
		}
		else
		{
			return "name is not vaild";
		}
	}
	public String postnames(List<Student> s)
	{
		List<Student> res=s.stream().filter(x->x.getName()!=null && !x.getName().isEmpty()).collect(Collectors.toList());
		return sd.postnames(res);
	}
		
}
