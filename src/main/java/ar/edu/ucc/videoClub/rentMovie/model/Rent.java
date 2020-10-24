package ar.edu.ucc.videoClub.rentMovie.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "RENT")
public class Rent {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MOVIE_ID")
	private Movie movie;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MEMBER_ID")
	private Member member;
	
	@NotNull
	@Column(name = "RENT_DATE")
	private Date rentdate;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getRentdate() {
		return rentdate;
	}

	public void setRentdate(Date rentdate) {
		this.rentdate = rentdate;
	}
	
	
}
