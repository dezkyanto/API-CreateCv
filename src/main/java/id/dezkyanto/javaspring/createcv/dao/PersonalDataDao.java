package id.dezkyanto.javaspring.createcv.dao;

import id.dezkyanto.javaspring.createcv.model.PersonalData;

public interface PersonalDataDao {

	public int insert(PersonalData personalData);
	
	public int update(PersonalData personalData, String idPersonalData);
	
	public PersonalDataDao getall();
	
	public PersonalDataDao getById(String idPersonalData);
	
	public int removeById(String idPersonalData);
	
	public int removeAll();
	
}
