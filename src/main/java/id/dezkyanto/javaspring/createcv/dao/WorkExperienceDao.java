package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.WorkExperience;

public interface WorkExperienceDao {

	public int insert(List<WorkExperience> workExperience);

	public int update(List<WorkExperience> workExperience, String idWorkExperience);

	public List<WorkExperience> getall();

	public List<WorkExperience> getById(String idWorkExperience);

	public int removeById(List<WorkExperience> idWorkExperience);

	public int removeAll();
	
}
