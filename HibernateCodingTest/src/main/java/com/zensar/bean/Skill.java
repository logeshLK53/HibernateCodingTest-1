package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int skillId;
	@Column
	String skillName;
	@Column
	int skillLevel;

	public Skill(String skillName, int skillLevel) {
		super();
		this.skillName = skillName;
		this.skillLevel = skillLevel;
	}

	public Skill() {
		super();
	}

	public Skill(int skillId, String skillName, int skillLevel) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.skillLevel = skillLevel;
	}

	public Skill(int skillId) {
		super();
		this.skillId = skillId;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", skillLevel=" + skillLevel + "]";
	}

}
