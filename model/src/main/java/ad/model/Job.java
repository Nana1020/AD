package ad.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Job {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int jobId;	
	private String companyName;
	private String jobTitle;
	private String jobDesc;
	private String industryType;
	private String contractType;
	private String experience;
	private String jobSkills;	
	private String jobAppUrl;
	private double salary;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate  postedDate;
	private String locationCity;
	private String locationCountry;
	public Job(int jobId, String companyName, String jobTitle, String jobDesc, String industryType, String contractType,
			String experience, String jobSkills, String jobAppUrl, double salary, LocalDate postedDate,
			String locationCity, String locationCountry) {
		super();
		this.jobId = jobId;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.jobDesc = jobDesc;
		this.industryType = industryType;
		this.contractType = contractType;
		this.experience = experience;
		this.jobSkills = jobSkills;
		this.jobAppUrl = jobAppUrl;
		this.salary = salary;
		this.postedDate = postedDate;
		this.locationCity = locationCity;
		this.locationCountry = locationCountry;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
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
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getJobSkills() {
		return jobSkills;
	}
	public void setJobSkills(String jobSkills) {
		this.jobSkills = jobSkills;
	}
	public String getJobAppUrl() {
		return jobAppUrl;
	}
	public void setJobAppUrl(String jobAppUrl) {
		this.jobAppUrl = jobAppUrl;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
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
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", jobDesc="
				+ jobDesc + ", industryType=" + industryType + ", contractType=" + contractType + ", experience="
				+ experience + ", jobSkills=" + jobSkills + ", jobAppUrl=" + jobAppUrl + ", salary=" + salary
				+ ", postedDate=" + postedDate + ", locationCity=" + locationCity + ", locationCountry="
				+ locationCountry + "]";
	}
	
	
	
}
