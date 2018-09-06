package id.dezkyanto.javaspring.createcv.dao;

import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

public interface PersonalDataDao {

	public int insert(PersonalDataModel personalData);
	
	public int update(PersonalDataModel personalData, String idPersonalData);
	
	public PersonalDataDao getall();
	
	public PersonalDataDao getById(String idPersonalData);
	
	public int removeById(String idPersonalData);
	
	public int removeAll();
	
}
