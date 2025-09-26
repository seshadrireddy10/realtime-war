package in.javahome.ims.dao;

import java.util.List;

import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Student;

public interface ICourseDAO {
	public List<Course> findAll();
	public List<Course> findCoursesIn(Integer[] ids);
	public List<Student> findAllStudentCourses(Integer studentId);

}
