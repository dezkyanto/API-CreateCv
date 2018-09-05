package id.dezkyanto.javaspring.createcv.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.CreateCvDao;
import id.dezkyanto.javaspring.createcv.model.PersonalData;


@Transactional
@Repository
public class CreateCvDaoImpl implements CreateCvDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersonalData getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonalData getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeById() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
