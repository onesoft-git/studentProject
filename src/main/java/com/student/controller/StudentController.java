package com.student.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.customException.AgeException;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping(value="/Student")
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value="/PostStudent")
	public String post(@RequestBody Student s) throws AgeException
	{
		return ss.post(s);
	}
	@PostMapping(value="/PostStudentDetails")
	public String postdetails(@RequestBody List<Student> s)
	{
		return ss.postdetails(s);
	}
	@GetMapping(value="/GetAll")
	public List<Student> getall()
	{
		return ss.getall();
	}
	@GetMapping(value="/GetStudent/{id}")
	public Student get(@PathVariable int id)
	{
		return ss.get(id);
	}
	@PutMapping(value="/UpdateStudent/{id}")
	public String update(@PathVariable int id,@RequestBody Student s)
	{
		return ss.update(id,s);
	}
	@DeleteMapping(value="/DeleteStudent/{id}")
	public String delete(@PathVariable int id)
	{
		return ss.delete(id);
	}
	@GetMapping(value="/GetDeptStudent")
	public List<Student> getEEE()
	{
		return ss.getEEE();
	}
	@GetMapping(value="/GetSortStudent")
		public List<Student> getsort()
		{
			return ss.getsort();
		}
	@GetMapping(value="/GetGroupStudent")
	public Map<String,Long> getgroup()
	{
		return ss.getgroup();
	}
	@PostMapping(value="/PostValidStudent")
	public String postStudent(@RequestBody Student s)
	{
		return ss.postStudent(s);
	}
	@PostMapping(value="/PostValidStudents")
	public String postValid(@RequestBody List<Student> s)
	{
		return ss.postValid(s);
	}
	@GetMapping(value="/GetSecondMax")
	public Student getMax()
	{
		return ss.getMax();
	}
	@PostMapping(value="/PostStudentName")
	public String postname(Student s)
	{
		return ss.postname(s);
	}
	@PostMapping(value="/PostStudentNames")
	public String postnames(@RequestBody List<Student> s)
	{
		return ss.postnames(s);
	}
	}


