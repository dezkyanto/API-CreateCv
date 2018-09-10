package id.dezkyanto.javaspring.createcv.dao.jdbc;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.WorkExperienceModel;

public interface WorkExperienceDao {

	public int insert(List<WorkExperienceModel> workExperience, String idPersonalData);

	public int update(List<WorkExperienceModel> workExperience, String idPersonalData);

	public List<WorkExperienceModel> getById(String idPersonalData);

	public int removeById(List<WorkExperienceModel> idPersonalData);

	public int removeByIdWorkExperience(String id);
	
	public int removeAll();

}
