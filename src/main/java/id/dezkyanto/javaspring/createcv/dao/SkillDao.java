package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.Skill;

public interface SkillDao {

	public int insert(List<Skill> skill);

	public int update(List<Skill> skill, String idSkill);

	public List<Skill> getall();

	public List<Skill> getById(String idSkill);

	public int removeById(List<Skill> idSkill);

	public int removeAll();

}
