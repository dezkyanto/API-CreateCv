package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.WorkExperienceModel;

public class WorkExperienceMapper implements RowMapper<WorkExperienceModel> {

	@Override
	public WorkExperienceModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		WorkExperienceModel experience = new WorkExperienceModel();
		experience.setOrganizationName(rs.getString("nama_institusi"));
		experience.setStart(rs.getDate("start"));
		experience.setEnd(rs.getDate("endd"));
		experience.setDescription(rs.getString("deskripsi"));

		return experience;
	}

}

