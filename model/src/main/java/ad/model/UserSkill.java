package ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserSkill {
	@Id 
	private String skillName;
	@ManyToOne
	@JoinColumn(name = "User_id")
    private User user;
	private String skillType;
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public UserSkill(String skillName, User user, String skillType) {
		super();
		this.skillName = skillName;
		this.user = user;
		this.skillType = skillType;
	}
	@Override
	public String toString() {
		return "UserSkill [skillName=" + skillName + ", user=" + user + ", skillType=" + skillType + "]";
	}
	
}
