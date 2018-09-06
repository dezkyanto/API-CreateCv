package id.dezkyanto.javaspring.createcv.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;
import id.dezkyanto.javaspring.createcv.service.CreateCvService;

@Service
public class CreateCvServiceImpl implements CreateCvService {


	@Override
	public int insert(List<PersonalDataModel> personalData) {

		return 0;
	}

	@Override
	public int update(PersonalDataModel personalData, String idPersonalData) {

		return 0;
	}

	@Override
	public PersonalDataModel getall() {

		return null;
	}

	@Override
	public PersonalDataModel getById(String idPersonalData) {

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

	@Override
	public String test() {
		return "";
	}

}
