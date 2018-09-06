package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.SkillModel;

public interface SkillDao {

	public int insert(List<SkillModel> skill);

	public int update(List<SkillModel> skill, String idSkill);

	public List<SkillModel> getall();

	public List<SkillModel> getById(String idSkill);

	public int removeById(List<SkillModel> idSkill);

	public int removeAll();

}
