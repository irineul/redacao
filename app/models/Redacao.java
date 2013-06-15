package models;

import java.util.Date;


public class Redacao {

	private User user;
	
	private String title;
	
	private Date uploadDate;
	
	private int score;
	
	private boolean isCorrectedByTeacher;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean getIsCorrectedByTeacher() {
		return isCorrectedByTeacher;
	}

	public void setIsCorrectedByTeacher(boolean checked) {
		this.isCorrectedByTeacher = checked;
	}
	
	
}
