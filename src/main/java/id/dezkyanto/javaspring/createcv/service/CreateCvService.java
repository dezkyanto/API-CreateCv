package id.dezkyanto.javaspring.createcv.service;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.PersonalData;

public interface CreateCvService {

	public int insert(List<PersonalData> personalData);

	public int update(PersonalData personalData, String idPersonalData);

	public PersonalData getall();

	public PersonalData getById(String idPersonalData);

	public int removeById(String idPersonalData);

	public int removeAll();

}
