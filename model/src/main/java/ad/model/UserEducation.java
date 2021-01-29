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
public class UserEducation {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Id
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate gradYear;
	@ManyToOne
	@JoinColumn(name = "User_id")
    private User user;
	private String faclAttended;
	public UserEducation(int id, User user, String faclAttended) {
		super();
		this.id = id;
		this.user = user;
		this.faclAttended = faclAttended;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getFaclAttended() {
		return faclAttended;
	}
	public void setFaclAttended(String faclAttended) {
		this.faclAttended = faclAttended;
	}
	@Override
	public String toString() {
		return "userEducation [id=" + id + ", user=" + user + ", faclAttended=" + faclAttended + "]";
	}
	
}
