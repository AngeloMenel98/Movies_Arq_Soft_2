package ar.edu.ucc.videoClub.rentMovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.videoClub.rentMovie.dao.MovieDao;
import ar.edu.ucc.videoClub.rentMovie.dto.MovieResponseDto;
import ar.edu.ucc.videoClub.rentMovie.model.Movie;

@Service
@Transactional
public class MovieService {
	
	
	@Autowired
	private MovieDao movieDao;
	
	public MovieResponseDto getMovieById (Long id) {
		
		Movie movie = movieDao.load(id);
		
		MovieResponseDto dto = new MovieResponseDto();
		dto.setName(movie.getTitle());
		
		return dto;
		
	}
	
}
