package id.dezkyanto.javaspring.createcv.dao.jdbc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.jdbc.PersonalDataDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.SkillDao;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;
import id.dezkyanto.javaspring.createcv.model.SkillModel;

@Transactional
@Repository
public class SkillDaoImpl implements SkillDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(List<SkillModel> skill, String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(List<SkillModel> skill, String idSkill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SkillModel> getById(String idSkill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeById(List<SkillModel> idSkill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeByIdSkill(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
