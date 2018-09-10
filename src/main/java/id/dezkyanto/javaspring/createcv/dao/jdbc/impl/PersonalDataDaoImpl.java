package id.dezkyanto.javaspring.createcv.dao.jdbc.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.jdbc.PersonalDataDao;
import id.dezkyanto.javaspring.createcv.model.EducationModel;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;
import id.dezkyanto.javaspring.createcv.util.GenerateUUID;
import id.dezkyanto.javaspring.createcv.util.HelperDao;

@Transactional
@Repository
public class PersonalDataDaoImpl implements PersonalDataDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(List<PersonalDataModel> personalData, String[] idPersonalData) {
		
		String query = " INSERT INTO public.datadiri( "
				+ " id, nama_lengkap, tempat_lahir, alamat, no_tfn_wa, email, linkedin, "
				+ " git, motto, hobbi, tanggal_lahir) " + " VALUES (?, ?, ?, ?, ?, ?, ?, " + " ?, ?, ?, ?); ";

		int[] res = jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				PersonalDataModel educationModel = personalData.get(i);
				String id = GenerateUUID.getUUID();

				HelperDao.setStringOrNull(ps, 1, idPersonalData[i]);
				HelperDao.setStringOrNull(ps, 2, educationModel.getFullName());
				HelperDao.setStringOrNull(ps, 3, educationModel.getPlaceOfBirth());
				HelperDao.setStringOrNull(ps, 4, educationModel.getAddress());
				HelperDao.setStringOrNull(ps, 5, educationModel.getPhoneNumber());
				HelperDao.setStringOrNull(ps, 6, educationModel.getEmail());
				HelperDao.setStringOrNull(ps, 7, educationModel.getLinkedin());
				HelperDao.setStringOrNull(ps, 8, educationModel.getGit());
				HelperDao.setStringOrNull(ps, 9, educationModel.getMotto());
				HelperDao.setStringOrNull(ps, 10, educationModel.getHobbi());
				HelperDao.setDateOrNull(ps, 11, educationModel.getDateOfBirth());

			}

			@Override
			public int getBatchSize() {
				return personalData.size();
			}
		});

		return res.length;
	}

	@Override
	public int update(PersonalDataModel personalData, String idPersonalData) {
		String query = "";
		return 0;
	}

	@Override
	public PersonalDataDao getall() {
		String query = "";
		return null;
	}

	@Override
	public PersonalDataDao getById(String idPersonalData) {
		String query = "";
		return null;
	}

	@Override
	public int removeById(String idPersonalData) {
		String query = "";
		return 0;
	}

	@Override
	public int removeAll() {
		String query = "";
		return 0;
	}

}
