package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.EducationModel;

public class EducationMapper implements RowMapper<EducationModel> {

	@Override
	public EducationModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		EducationModel education = new EducationModel();

		return education;
	}

}
