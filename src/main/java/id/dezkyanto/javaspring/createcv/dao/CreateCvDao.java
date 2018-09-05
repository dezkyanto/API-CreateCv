package id.dezkyanto.javaspring.createcv.dao;

import id.dezkyanto.javaspring.createcv.model.PersonalData;

public interface CreateCvDao {

	public int insert();
	
	public int update();
	
	public PersonalData getall();
	
	public PersonalData getById();
	
	public int removeById();
	
}
