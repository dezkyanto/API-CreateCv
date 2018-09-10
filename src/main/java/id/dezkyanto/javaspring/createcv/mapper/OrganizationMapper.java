package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.OrganizationModel;

public class OrganizationMapper implements RowMapper<OrganizationModel> {

	@Override
	public OrganizationModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		OrganizationModel organization = new OrganizationModel();
		organization.setOrganizationName(rs.getString("nama_organisasi"));
		organization.setStart(rs.getDate("start"));
		organization.setEnd(rs.getDate("endd"));
		organization.setDescription(rs.getString("deskripsi"));

		return organization;
	}

}

