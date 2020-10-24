package ar.edu.ucc.videoClub.rentMovie.dto;

import java.util.Date;

public class RentResponseDto {
	
	private Date date;
	
	private String lastname;
	
	private String title;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
