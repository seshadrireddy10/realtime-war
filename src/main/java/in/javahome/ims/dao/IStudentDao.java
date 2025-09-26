package in.javahome.ims.dao;

import java.util.List;

import in.javahome.ims.entities.Student;

public interface IStudentDao {
	public void addStudent(Student student);

	public List<Student> findAll();

	public List<Student> findStudentFeeDetails(Integer studentId);
}
