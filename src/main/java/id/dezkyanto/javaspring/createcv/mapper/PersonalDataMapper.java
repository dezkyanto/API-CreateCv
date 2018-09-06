package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;

public class PersonalDataMapper implements RowMapper<PersonalDataModel>{

	@Override
	public PersonalDataModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		PersonalDataModel personalData = new PersonalDataModel();
		return personalData;
	}

}
