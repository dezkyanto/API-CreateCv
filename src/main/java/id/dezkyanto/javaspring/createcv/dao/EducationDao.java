package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.EducationModel;

public interface EducationDao {

    public int insert(List<EducationModel> education);
	
	public int update(List<EducationModel> education, String idEducation);
	
	public List<EducationModel> getall();
	
	public List<EducationModel> getById(String idEducation);
	
	public int removeById(List<EducationModel> idEducation);
	
	public int removeAll();
	
}
