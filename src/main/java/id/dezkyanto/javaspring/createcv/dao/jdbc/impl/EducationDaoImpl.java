package id.dezkyanto.javaspring.createcv.dao.jdbc.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.jdbc.EducationDao;
import id.dezkyanto.javaspring.createcv.mapper.EducationMapper;
import id.dezkyanto.javaspring.createcv.model.EducationModel;
import id.dezkyanto.javaspring.createcv.util.GenerateUUID;
import id.dezkyanto.javaspring.createcv.util.HelperDao;

@Transactional
@Repository
public class EducationDaoImpl implements EducationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(List<EducationModel> education, String idPersonalData) {
		String query = " INSERT INTO public.pendidikan( "
				+ " id, id_datadiri, jenis_pendidikan, nama_institusi, alamat_institusi, " + " start, endd) "
				+ " VALUES (?, ?, ?, ?, ?, " + " ?, ?); ";

		int[] res = jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				EducationModel educationModel = education.get(i);
				String id = GenerateUUID.getUUID();

				HelperDao.setStringOrNull(ps, 1, id);
				HelperDao.setStringOrNull(ps, 2, idPersonalData);
				HelperDao.setStringOrNull(ps, 3, educationModel.getTypeOfEducation());
				HelperDao.setStringOrNull(ps, 4, educationModel.getNameOfInstitution());
				HelperDao.setStringOrNull(ps, 5, educationModel.getInstitutionAddress());
				HelperDao.setDateOrNull(ps, 6, educationModel.getStart());
				HelperDao.setDateOrNull(ps, 7, educationModel.getEnd());

			}

			@Override
			public int getBatchSize() {
				return education.size();
			}
		});

		return res.length;
	}

	@Override
	public int update(List<EducationModel> education, String idPersonalData) {
		String query = " UPDATE public.pendidikan "
				+ " SET  jenis_pendidikan=?, nama_institusi=?, alamat_institusi=?, "
				+ " start=?, endd=? " + " WHERE id_datadiri=?; ";
		return jdbcTemplate.update(query);
	}

	@Override
	public List<EducationModel> getById(String idPersonalData) {
		String query = "SELECT * FROM public.pendidikan WHERE id_datadiri=?;";
//		List<EducationModel> educationList = jdbcTemplate.query(query, new Object[] { idEducation },
//				new EducationMapper());
		return jdbcTemplate.query(query, new Object[] { idPersonalData }, new EducationMapper());
	}

	@Override
	public int removeById(String idPersonalData) {
		String query = "DELETE FROM public.pendidikan WHERE id_datadiri=?;";
		return jdbcTemplate.update(query, idPersonalData);
	}

	@Override
	public int removeAll() {
		String query = "DELETE FROM public.pendidikan;";
		return jdbcTemplate.update(query);
	}

	@Override
	public int removeByIdEducation(String id) {
		String query = "DELETE FROM public.pendidikan WHERE id=?;";
		return jdbcTemplate.update(query, id);
	}

}
