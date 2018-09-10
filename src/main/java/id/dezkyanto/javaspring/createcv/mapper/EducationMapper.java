package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.EducationModel;

public class EducationMapper implements RowMapper<EducationModel> {

	@Override
	public EducationModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		EducationModel education = new EducationModel();
		education.setTypeOfEducation(rs.getString("jenis_pendidikan"));
		education.setNameOfInstitution(rs.getString("nama_institusi"));
		education.setInstitutionAddress(rs.getString("alamat_institusi"));
		education.setStart(rs.getDate("start"));
		education.setEnd(rs.getDate("endd"));
	
		return education;
	}

}

