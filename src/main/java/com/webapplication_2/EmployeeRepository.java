package com.webapplication_2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Query(value="select * from employee_table",nativeQuery=true)
	public List<Employee> getAllEmps();
	
	@Query(value="select * from employee_table where age>25",nativeQuery=true)
	public List<Employee> getAge();
	
	@Query(value="select name,gender from employee_table where salary>=45000",nativeQuery=true)
	public List<Object> getSal();
	
	@Query(value="select count(name) from employee_table where exprience>=3;",nativeQuery=true)
	public int getname();
	
	@Query(value="select max(age) from employee_table;",nativeQuery=true)
	public int getMaxAge();
	
	@Query(value="select * from employee_table where age=(select max(age) from employee_table);",nativeQuery=true)
	public Employee getMaxEmp();
	
	@Query(value="select name from employee_table where name like ?%",nativeQuery=true)
	public List<String> getstart(String s);
	
	@Query(value="select name from employee_table where name like %?",nativeQuery=true)
	public List<String> getend(String s);
	
	@Query(value="select name from employee_table where name like %?%",nativeQuery=true)
	public List<String> getmiddle(String s);
	
	@Query(value="select name from employee_table where salary>? AND exprience>?",nativeQuery=true)
	public List<String> getempname(int s,int e);
	
	@Query(value="select * from employee_table where name like %? OR exprience<?",nativeQuery=true)
	public List<Employee> getempdetails(String s,int e);
	
	@Query(value="select * from employee_table order by age desc",nativeQuery=true)
	public List<Employee> getorder();
	
	@Query(value="select exprience,count(exprience) from employee_table group by(exprience)",nativeQuery=true)
	public List<Object> getcount();
	
	@Query(value="select distinct(exprience) from employee_table",nativeQuery=true)
	public List<Integer> getnondup();
	
	@Query(value="select sum(exprience) from employee_table",nativeQuery=true)
	public int getsum();
	
	@Query(value="select avg(age) from employee_table",nativeQuery=true)
	public float getavg();
	
	@Query(value="select * from employee_table where exprience not between 3 and 5",nativeQuery=true)
	public List<Employee> getbetween();
	
	@Query(value="select name from employee_table where name like ?% OR ?%",nativeQuery=true)
	public List<String> getempOR(String s,String e);

	@Query(value="select a from Employee a where a.age>=:x")
	public List<Employee> getAllEmps(@Param("x") int age);
	
	@Query(value="select a from Employee a where a.exprience not between :x and :y")
	public List<Employee> getExpBetween(@Param("x") int e1,@Param("y") int e2);
	
	@Query(value="select e.name from Employee e where e.age>:x AND e.gender=:y")
	public List<String> getnameAND(@Param("x") int a,@Param("y") String b);
	
	@Query(value="select e.name from Employee e where e.exprience not between :x and :y AND e.age not in(:z)")
	public List<String> getexprience(@Param("x") int a,@Param("y") int b,@Param("z") int c);
	
	
}
