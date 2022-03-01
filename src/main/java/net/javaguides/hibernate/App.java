package net.javaguides.hibernate;

import java.util.List;

import net.javaguides.hibernate.dao.IStudentDao;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {
	public static void main(String[] args) {
		IStudentDao studentDao = new StudentDao();
		
		//test saveStudent
		Student student = new Student("Caio","Paiva","caio.paiva@gmail.com");
		studentDao.saveStudent(student);
		
		// test updateStudent
		student.setFirstName("Pedro");
		studentDao.updateStudent(student);
		
		//test getStudentById
		Student student2 = studentDao.getStudentById(student.getId()); 
		student2.toString();
		
		
		// test getAllStudents
		List<Student> students = studentDao.getAllStudent();
		students.forEach(student1 -> System.out.println(student1.getId()));
		
		// test deleteStudent
		studentDao.deleteStudent(student.getId());
		
	}
}
