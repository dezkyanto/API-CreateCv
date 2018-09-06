package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.OrganizationModel;

public class OrganizationMapper implements RowMapper<OrganizationModel> {

	@Override
	public OrganizationModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrganizationModel organization = new OrganizationModel();
		return organization;
	}

}
