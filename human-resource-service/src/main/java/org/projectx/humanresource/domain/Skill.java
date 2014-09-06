package org.projectx.humanresource.domain;

public class Skill {

	private String skillType;
	private String skillName;
	private String skillDescription;
	private String skillRating;

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getSkillRating() {
		return skillRating;
	}

	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}

	public Skill(String skillType, String skillName, String skillDescription, String skillRating) {
		super();
		this.skillType = skillType;
		this.skillName = skillName;
		this.skillDescription = skillDescription;
		this.skillRating = skillRating;
	}

}
