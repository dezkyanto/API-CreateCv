package id.dezkyanto.javaspring.createcv.dao.jdbc;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.SkillModel;

public interface SkillDao {

	public int insert(List<SkillModel> skill, String idPersonalData);

	public int update(List<SkillModel> skill, String idPersonalData);

	public List<SkillModel> getById(String idPersonalData);

	public int removeById(List<SkillModel> idPersonalData);
	
	public int removeByIdSkill(String id);

	public int removeAll();

}
