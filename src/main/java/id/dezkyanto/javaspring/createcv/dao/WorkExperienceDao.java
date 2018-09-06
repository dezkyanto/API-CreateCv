package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.WorkExperienceModel;

public interface WorkExperienceDao {

	public int insert(List<WorkExperienceModel> workExperience);

	public int update(List<WorkExperienceModel> workExperience, String idWorkExperience);

	public List<WorkExperienceModel> getall();

	public List<WorkExperienceModel> getById(String idWorkExperience);

	public int removeById(List<WorkExperienceModel> idWorkExperience);

	public int removeAll();
	
}
