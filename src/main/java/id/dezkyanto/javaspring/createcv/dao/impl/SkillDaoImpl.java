package id.dezkyanto.javaspring.createcv.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.PersonalDataDao;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

@Transactional
@Repository
public class SkillDaoImpl implements PersonalDataDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(PersonalDataModel personalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(PersonalDataModel personalData, String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersonalDataDao getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonalDataDao getById(String idPersonalData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeById(String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
