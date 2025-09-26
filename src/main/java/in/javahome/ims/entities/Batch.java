package in.javahome.ims.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="BATCH")
public class Batch {
	@Id
	@Column(name = "BATCH_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer batchID;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "CURRENT_BATCH")
	private boolean currentBatch;
	
	@ManyToMany(mappedBy="batches")
	private Set<Student> students = new HashSet<Student>();
	
	public Integer getBatchID() {
		return batchID;
	}
	public void setBatchID(Integer batchID) {
		this.batchID = batchID;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public boolean isCurrentBatch() {
		return currentBatch;
	}
	public void setCurrentBatch(boolean currentBatch) {
		this.currentBatch = currentBatch;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
