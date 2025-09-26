package in.javahome.ims.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String email;
	
	private String password;
	
	private Integer yearOfPass;
	
	@Column(name="MOBILE")
	private String mobile;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "COURSE_ID") })
	private Set<Course> courses = new HashSet<Course>();
	
	@ManyToMany
	@JoinTable(name = "STUDENT_BATCH", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "BATCH_ID") })
	private Set<Batch> batches = new HashSet<Batch>();
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "STUDENT_FEE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "FEE_ID") })
	private Set<FeeDetails> feeDetails = new HashSet<FeeDetails>();
	

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}

	public String getEmail() {
		return email;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(Integer yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	public Set<FeeDetails> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(Set<FeeDetails> feeDetails) {
		this.feeDetails = feeDetails;
	}
	
	

}
