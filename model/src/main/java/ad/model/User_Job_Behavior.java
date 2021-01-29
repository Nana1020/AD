package ad.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

public class User_Job_Behavior {
	
	@ManyToOne
	@JoinColumn(name = "User_id")
    private User user;
	private String keyWord;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate searchDate;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int jobId;
	public User_Job_Behavior(User user, String keyWord, LocalDate searchDate, int jobId) {
		super();
		this.user = user;
		this.keyWord = keyWord;
		this.searchDate = searchDate;
		this.jobId = jobId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public LocalDate getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(LocalDate searchDate) {
		this.searchDate = searchDate;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	@Override
	public String toString() {
		return "User_Job_Behavior [user=" + user + ", keyWord=" + keyWord + ", searchDate=" + searchDate + ", jobId="
				+ jobId + "]";
	}
	

}
