package id.dezkyanto.javaspring.createcv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import id.dezkyanto.javaspring.createcv.model.SkillModel;

public class SkillMapper implements RowMapper<SkillModel>{

	@Override
	public SkillModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		SkillModel skill = new SkillModel();
		return skill;
	}

}
