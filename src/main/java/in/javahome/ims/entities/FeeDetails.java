package in.javahome.ims.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fee_details")
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
public class FeeDetails {
	@Id
	@Column(name = "FEE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feeId;
	
	@Column(name = "COURSE_NAME")
	private String name;
	
	@Column(name = "COURSE_DURATION")
	private String duration;
	
	@Column(name = "COST")
	private Double cost;
	
	@ManyToMany(mappedBy="feeDetails")
	private Set<Student> student;

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public Integer getFeeId() {
		return feeId;
	}

	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

}
