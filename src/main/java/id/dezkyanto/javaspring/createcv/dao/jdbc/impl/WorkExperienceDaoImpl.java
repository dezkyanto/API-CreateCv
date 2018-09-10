package id.dezkyanto.javaspring.createcv.dao.jdbc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.jdbc.PersonalDataDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.WorkExperienceDao;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;
import id.dezkyanto.javaspring.createcv.model.WorkExperienceModel;

@Transactional
@Repository
public class WorkExperienceDaoImpl implements WorkExperienceDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(List<WorkExperienceModel> workExperience, String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(List<WorkExperienceModel> workExperience, String idWorkExperience) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WorkExperienceModel> getById(String idWorkExperience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeById(List<WorkExperienceModel> idWorkExperience) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeByIdWorkExperience(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
