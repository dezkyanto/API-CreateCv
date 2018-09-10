package id.dezkyanto.javaspring.createcv.dao.jdbc;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

public interface PersonalDataDao {

	public int insert(List<PersonalDataModel> personalData, String[] idPersonalData);
	
	public int update(PersonalDataModel personalData, String idPersonalData);
	
	public PersonalDataDao getall();
	
	public PersonalDataDao getById(String idPersonalData);
	
	public int removeById(String idPersonalData);
	
	public int removeAll();
	
}
