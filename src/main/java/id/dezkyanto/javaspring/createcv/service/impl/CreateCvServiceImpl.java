package id.dezkyanto.javaspring.createcv.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import id.dezkyanto.javaspring.createcv.model.PersonalData;
import id.dezkyanto.javaspring.createcv.service.CreateCvService;

@Service
public class CreateCvServiceImpl implements CreateCvService {

	@Override
	public int insert(List<PersonalData> personalData) {

		return 0;
	}

	@Override
	public int update(PersonalData personalData, String idPersonalData) {

		return 0;
	}

	@Override
	public PersonalData getall() {

		return null;
	}

	@Override
	public PersonalData getById(String idPersonalData) {

		return null;
	}

	@Override
	public int removeById(String idPersonalData) {

		return 0;
	}

	@Override
	public int removeAll() {

		return 0;
	}

}
