package net.javaguides.hibernate.dao;

import java.util.List;

import net.javaguides.hibernate.model.Student;

public interface IStudentDao {

	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	List<Student> getAllStudent();

	void deleteStudent(long id);

}