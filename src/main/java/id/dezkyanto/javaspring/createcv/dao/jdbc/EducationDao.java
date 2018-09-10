package id.dezkyanto.javaspring.createcv.dao.jdbc;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.EducationModel;

public interface EducationDao {

	public int insert(List<EducationModel> education, String idPersonalData);

	public int update(List<EducationModel> education, String idPersonalData);

	public List<EducationModel> getById(String idPersonalData);

	public int removeById(String idPersonalData);
	
	public int removeByIdEducation(String id);

	public int removeAll();

}
