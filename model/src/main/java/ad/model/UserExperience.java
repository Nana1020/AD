package ad.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UserExperience {
	@Id 
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate registrationDate;
	@ManyToOne
	@JoinColumn(name = "User_id")
    private User user;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate endDate;
	private String companyName;
	private String jobTitle;
	private String jobDesc;
	private String locationCity;
	private String locationCountry;
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getLocationCity() {
		return locationCity;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getLocationCountry() {
		return locationCountry;
	}
	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}
	public UserExperience(LocalDate registrationDate, User user, LocalDate endDate, String companyName, String jobTitle,
			String jobDesc, String locationCity, String locationCountry) {
		super();
		this.registrationDate = registrationDate;
		this.user = user;
		this.endDate = endDate;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.locationCity = locationCity;
		this.locationCountry = locationCountry;
	}
	@Override
	public String toString() {
		return "userExperience [registrationDate=" + registrationDate + ", user=" + user + ", endDate=" + endDate
				+ ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", jobDesc=" + jobDesc + ", locationCity="
				+ locationCity + ", locationCountry=" + locationCountry + "]";
	}

}
