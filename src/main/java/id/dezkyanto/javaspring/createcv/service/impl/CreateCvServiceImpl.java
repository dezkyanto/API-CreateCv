package id.dezkyanto.javaspring.createcv.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import id.dezkyanto.javaspring.createcv.dao.jdbc.CreateTableDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.EducationDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.OrganizationDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.PersonalDataDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.SkillDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.WorkExperienceDao;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;
import id.dezkyanto.javaspring.createcv.service.CreateCvService;
import id.dezkyanto.javaspring.createcv.util.GenerateUUID;

@Service
public class CreateCvServiceImpl implements CreateCvService {

	@Autowired
	private CreateTableDao createTableDao;

	@Autowired
	private EducationDao educationDao;

	@Autowired
	private OrganizationDao organizationDao;

	@Autowired
	private PersonalDataDao personalDataDao;

	@Autowired
	private SkillDao skillDao;

	@Autowired
	private WorkExperienceDao workExperienceDao;

	@Override
	public int insert(List<PersonalDataModel> personalData) {
		int count = 0;
		String[] idGenerate = new String[personalData.size()];
		for (int i = 0; i < personalData.size(); i++) {
			idGenerate[i] = GenerateUUID.getUUID();
		}

		count += personalDataDao.insert(personalData, idGenerate);

		return count;
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
	public String createTable() {

		StringBuffer stringBuffer = new StringBuffer();
		try {
			stringBuffer.append(createTableDao.createTablePersonalData() + "<br>");
			stringBuffer.append(createTableDao.createTableEducation() + "<br>");
			stringBuffer.append(createTableDao.createTableOrganization() + "<br>");
			stringBuffer.append(createTableDao.createTableSkill() + "<br>");
			stringBuffer.append(createTableDao.createTableWorkExperience() + "<br>");
			return stringBuffer.toString();

		} catch (Exception e) {
			return "<div style=\"border: 2px solid #000; padding: 10px; \"><h1>Errors : </h1>" + e.toString()
					+ "</div>";
		}

	}

}
