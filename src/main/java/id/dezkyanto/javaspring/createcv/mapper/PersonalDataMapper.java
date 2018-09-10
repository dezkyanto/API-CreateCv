package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

public class PersonalDataMapper implements RowMapper<PersonalDataModel>{

	@Override
	public PersonalDataModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PersonalDataModel personalData = new PersonalDataModel();
		personalData.setFullName(rs.getString("nama_lengkap"));
		personalData.setPlaceOfBirth(rs.getString("tempat_lahir"));
		personalData.setDateOfBirth(rs.getDate("tanggal_lahir"));
		personalData.setAddress(rs.getString("alamat"));
		personalData.setPhoneNumber(rs.getString("no_tfn_wa"));
		personalData.setEmail(rs.getString("email"));
		personalData.setLinkedin(rs.getString("linkedin"));
		personalData.setGit(rs.getString("git"));
		personalData.setMotto(rs.getString("motto"));
		personalData.setHobbi(rs.getString("hobbi"));
		
		return personalData;
	}

}


