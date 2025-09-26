package in.javahome.ims.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Student;

@Repository
@SuppressWarnings("unchecked")
public class CourseDAO implements ICourseDAO {
	
	@Autowired
	private HibernateTemplate template;

	public List<Course> findAll(){
		return (List<Course>) template.findByCriteria(DetachedCriteria.forClass(Course.class));
	}
	
	public List<Course> findCoursesIn(Integer[] ids) {
		DetachedCriteria  criteria = DetachedCriteria.forClass(Course.class);
		criteria.add(Restrictions.in("id", ids));
		return (List<Course>) template.findByCriteria(criteria);
	}

	public List<Student> findAllStudentCourses(Integer studentId) {
		DetachedCriteria  criteria = DetachedCriteria.forClass(Student.class);
		criteria.add(Restrictions.eq("studentId", studentId));
		return (List<Student>) template.findByCriteria(criteria);
	}
}
