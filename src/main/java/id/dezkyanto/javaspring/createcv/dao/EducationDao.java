package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.Education;

public interface EducationDao {

    public int insert(List<Education> education);
	
	public int update(List<Education> education, String idEducation);
	
	public List<Education> getall();
	
	public List<Education> getById(String idEducation);
	
	public int removeById(List<Education> idEducation);
	
	public int removeAll();
	
}
