package id.dezkyanto.javaspring.createcv.dao.jdbc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.dezkyanto.javaspring.createcv.dao.jdbc.OrganizationDao;
import id.dezkyanto.javaspring.createcv.dao.jdbc.PersonalDataDao;
import id.dezkyanto.javaspring.createcv.model.OrganizationModel;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

@Transactional
@Repository
public class OrganizationDaoImpl implements OrganizationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(List<OrganizationModel> organization, String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(List<OrganizationModel> organization, String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrganizationModel> getById(String idPersonalData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeById(String idPersonalData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeByIdOrganization(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
