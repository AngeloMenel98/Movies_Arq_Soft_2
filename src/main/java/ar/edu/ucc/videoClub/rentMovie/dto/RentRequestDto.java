package ar.edu.ucc.videoClub.rentMovie.dto;

public class RentRequestDto {
	
	private Long memberId;
	
	private Long movieId;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	
}
