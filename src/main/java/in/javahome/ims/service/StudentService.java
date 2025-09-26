package in.javahome.ims.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.ims.dao.ICourseDAO;
import in.javahome.ims.dao.IStudentDao;
import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.FeeDetails;
import in.javahome.ims.entities.Student;
import in.javahome.ims.vo.CourseVO;
import in.javahome.ims.vo.FeeVO;
import in.javahome.ims.vo.StudentVO;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudentDao studentDAO;
	
	@Autowired
	private ICourseDAO courseDAO;

	@Transactional
	public void addStudentDetails(StudentVO studentVO) {
		Student student = new Student();
		BeanUtils.copyProperties(studentVO, student);
		Set<Course> courses = student.getCourses();
		courses.addAll(new HashSet<Course>(courseDAO.findCoursesIn(studentVO.getCourses())));
		studentDAO.addStudent(student);
	}

	public Set<StudentVO> findAll() {
		Set<StudentVO> studentVOs = new HashSet<StudentVO>();
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			StudentVO studentVO = new StudentVO();
			BeanUtils.copyProperties(student, studentVO);
			Set<Course> courses = student.getCourses();
			List<CourseVO> courseVOs = new ArrayList<CourseVO>();
			for (Course course : courses) {
				CourseVO courseVO = new CourseVO();
				BeanUtils.copyProperties(course, courseVO);
				courseVOs.add(courseVO);
			}
			studentVO.setCourseNames(courseVOs);
			Set<FeeDetails> feeDetails = student.getFeeDetails();
			Set<FeeVO> feeVOs = new HashSet<FeeVO>();
			for (FeeDetails feeDet : feeDetails) {
				FeeVO feeVO = new FeeVO();
				BeanUtils.copyProperties(feeDet, feeVO);
				feeVOs.add(feeVO);
			}
			studentVO.setFeeDetails(feeVOs);
			studentVOs.add(studentVO);
		}
		return studentVOs;
	}

	public List<StudentVO> findStudentFeeDetails(Integer studentId) {
		List<StudentVO> studentVOs = new ArrayList<StudentVO>();
		List<Student> students = studentDAO.findStudentFeeDetails(studentId);
		for (Student student : students) {
			StudentVO studentVO = new StudentVO();
			BeanUtils.copyProperties(student, studentVO);
			Set<Course> courses = student.getCourses();
			List<CourseVO> courseVOs = new ArrayList<CourseVO>();
			for (Course course : courses) {
				CourseVO courseVO = new CourseVO();
				BeanUtils.copyProperties(course, courseVO);
				courseVOs.add(courseVO);
			}
			studentVO.setCourseNames(courseVOs);
			studentVOs.add(studentVO);
		}
		return studentVOs;
	}
}
