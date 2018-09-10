package id.dezkyanto.javaspring.createcv.service;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

public interface CreateCvService {

	public int insert(List<PersonalDataModel> personalData);

	public int update(PersonalDataModel personalData, String idPersonalData);

	public PersonalDataModel getall();

	public PersonalDataModel getById(String idPersonalData);

	public int removeById(String idPersonalData);

	public int removeAll();
	
	public String createTable();
	

}
