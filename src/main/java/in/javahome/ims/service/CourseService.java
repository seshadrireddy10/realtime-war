package in.javahome.ims.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.javahome.ims.dao.ICourseDAO;
import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Student;
import in.javahome.ims.vo.CourseVO;

// Test comment
@Service
public class CourseService implements ICourseService {
	@Autowired
	private ICourseDAO courseDAO;

	public List<CourseVO> findAll() {
		// Verify
		List<Course> courses = courseDAO.findAll();
		List<CourseVO> coursesVo = new ArrayList<CourseVO>();
		for (Course course : courses) {
			CourseVO vo = new CourseVO();
			BeanUtils.copyProperties(course, vo);
			coursesVo.add(vo);
		}
		return coursesVo;
	}

	public List<CourseVO> findAllStudentCourses(Integer studentId) {
		List<CourseVO> coursesVo = new ArrayList<CourseVO>();
		List<Student> students = courseDAO.findAllStudentCourses(studentId);
		for (Student student : students) {
			CourseVO vo = new CourseVO();
			Set<Course> courses = student.getCourses();
			for (Course course : courses) {
				vo.setId(course.getId());
				vo.setName(course.getName());
			}
			coursesVo.add(vo);
		}
		return coursesVo;
	}
}
