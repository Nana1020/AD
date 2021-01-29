package ad.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Upload_file {
	private String filed;
	@ManyToOne
	@JoinColumn(name = "User_id")
    private User user;
	private String fileName;
	private String filePath;
	public Upload_file(String filed, User user, String fileName, String filePath) {
		super();
		this.filed = filed;
		this.user = user;
		this.fileName = fileName;
		this.filePath = filePath;
	}
	public String getFiled() {
		return filed;
	}
	public void setFiled(String filed) {
		this.filed = filed;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public String toString() {
		return "Upload_file [filed=" + filed + ", user=" + user + ", fileName=" + fileName + ", filePath=" + filePath
				+ "]";
	}

}
