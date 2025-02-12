package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String post(Student s)
	{
		 sr.save(s);
		return "Saved Successfully";
	}
	public String postdetails(List<Student> s)
	{
		sr.saveAll(s);
		return "Saved Successfully";
	}
	public List<Student> getall()
	{
		return sr.findAll();
	}
	public Student get(int id)
	{
		return sr.findById(id).get();
		
	}
	public String update(int id,Student s)
	{
		Student stu=sr.findById(id).get();
		stu.setName(s.getName());
		stu.setAge(s.getAge());
		stu.setGender(s.getGender());
		stu.setDepartment(s.getDepartment());
		stu.setYear(s.getYear());
		sr.save(stu);
		return "Updated Successfully";
	}
	public String delete(int id)
	{
		sr.deleteById(id);
		return "Deleted Successfully";
	}
	public List<Student> getEEE()
	{
		return sr.findAll();
	}
	public List<Student> getsort()
	{
		return sr.findAll();
	}
	public List<Student> getgroup()
	{
		return sr.findAll();
	}
	public String postStudent(Student s)
	{
		sr.save(s);
		return "done";
	}
	public String postValid(List<Student> s)
	{
		sr.saveAll(s);
		return "Done";
	}
	public List<Student> getMax()
	{
		return sr.findAll();
	
	}
	public String postname(Student s)
	{
		sr.save(s);
		return "done";
	}
	public String postnames(List<Student>s ) 
	{
		sr.saveAll(s);
		return "Done";
	}

}
