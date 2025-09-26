package in.javahome.ims.service;

import java.util.List;

import in.javahome.ims.vo.CourseVO;

public interface ICourseService {
	public List<CourseVO> findAll();

	public List<CourseVO> findAllStudentCourses(Integer studentId);
}
