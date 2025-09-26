package in.javahome.ims.service;

import java.util.List;
import java.util.Set;

import in.javahome.ims.vo.StudentVO;

public interface IStudentService {

	public void addStudentDetails(StudentVO studentVO);

	public Set<StudentVO> findAll();

	public List<StudentVO> findStudentFeeDetails(Integer studentId);
}
