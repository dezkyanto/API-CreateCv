package id.dezkyanto.javaspring.createcv.model;

public class SkillModel {

	private String skill;
	private String percentage;
	private String description;

	public SkillModel(String skill, String percentage, String description) {
		super();
		this.skill = skill;
		this.percentage = percentage;
		this.description = description;
	}

	public SkillModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Skill [skill=" + skill + ", percentage=" + percentage + ", description=" + description + "]";
	}

}
