package in.javahome.ims.vo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StudentVO {

	private int studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Integer yearOfPass;
	private String mobile;
	private Integer[] courses;
	private List<CourseVO> courseNames;
	private Set<FeeVO> feeDetails;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Integer[] getCourses() {
		return courses;
	}

	public void setCourses(Integer[] courses) {
		this.courses = courses;
	}

	public List<CourseVO> getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(List<CourseVO> courseNames) {
		this.courseNames = courseNames;
	}

	public Set<FeeVO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(Set<FeeVO> feeDetails) {
		this.feeDetails = feeDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseNames == null) ? 0 : courseNames.hashCode());
		result = prime * result + Arrays.hashCode(courses);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((feeDetails == null) ? 0 : feeDetails.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + studentId;
		result = prime * result + ((yearOfPass == null) ? 0 : yearOfPass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		if (courseNames == null) {
			if (other.courseNames != null)
				return false;
		} else if (!courseNames.equals(other.courseNames))
			return false;
		if (!Arrays.equals(courses, other.courses))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (feeDetails == null) {
			if (other.feeDetails != null)
				return false;
		} else if (!feeDetails.equals(other.feeDetails))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (studentId != other.studentId)
			return false;
		if (yearOfPass == null) {
			if (other.yearOfPass != null)
				return false;
		} else if (!yearOfPass.equals(other.yearOfPass))
			return false;
		return true;
	}
	

}
