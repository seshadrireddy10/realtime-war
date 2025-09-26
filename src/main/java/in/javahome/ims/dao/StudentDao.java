package in.javahome.ims.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Student;

@Repository
public class StudentDao implements IStudentDao {

	@Autowired
	private HibernateTemplate template;

	public void addStudent(Student student) {
		template.save(student);
	}

	@SuppressWarnings("unchecked")
	public Set<Course> getAllCourses() {
		return (Set<Course>) template.find("from Course");
	}

	@SuppressWarnings("unchecked")
	public List<Student> findAll() {
		return (List<Student>) template.findByCriteria(DetachedCriteria.forClass(Student.class));
	}

	@SuppressWarnings("unchecked")
	public List<Student> findStudentFeeDetails(Integer studentId) {
		DetachedCriteria  criteria = DetachedCriteria.forClass(Student.class);
		criteria.add(Restrictions.eq("studentId", studentId));
		return (List<Student>) template.findByCriteria(criteria);
	}

}
