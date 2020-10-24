package ar.edu.ucc.videoClub.rentMovie.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.videoClub.common.model.GenericObject;

@Entity
@Table(name = "MOVIE")
public class Movie extends GenericObject{
	
	@NotNull
	@Size(min = 1, max = 400)
	@Column(name = "TITLE")
	private String title;
	
	@NotNull
	@Size(min = 1, max = 2000)
	@Column(name = "SYNOPSIS")
	private String synopsis;
	
	@NotNull
	@Size(min = 1, max = 4)
	@Column(name = "YEAR")
	private String year;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name ="GENDER")
	private Gender gender;
	

	@OneToMany(mappedBy="movie", fetch = FetchType.LAZY)
	private Set<Rent> rent;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Set<Rent> getRent() {
		return rent;
	}

	public void setRent(Set<Rent> rent) {
		this.rent = rent;
	}

}
