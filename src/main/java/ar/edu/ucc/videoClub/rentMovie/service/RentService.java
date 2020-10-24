package ar.edu.ucc.videoClub.rentMovie.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.videoClub.rentMovie.dao.MemberDao;
import ar.edu.ucc.videoClub.rentMovie.dao.MovieDao;
import ar.edu.ucc.videoClub.rentMovie.dao.RentDao;
import ar.edu.ucc.videoClub.rentMovie.dto.RentRequestDto;
import ar.edu.ucc.videoClub.rentMovie.dto.RentResponseDto;
import ar.edu.ucc.videoClub.rentMovie.model.Rent;

@Service
@Transactional
public class RentService {
	@Autowired
	private RentDao rentDao;
	
	@Autowired
	private MovieDao movieDao;
	
	@Autowired
	private MemberDao memberDao;
	
	
	public RentResponseDto registerRent (RentRequestDto dto) {
		
		Rent rent = new Rent();
		
		rent.setRentdate(Calendar.getInstance().getTime());
		rent.setMovie(movieDao.load(dto.getMovieId()));
		rent.setMember(memberDao.load(dto.getMemberId()));
		
		rentDao.insert(rent);
		
		RentResponseDto response = new RentResponseDto();
		
		response.setLastname(rent.getMember().getLastname());
		response.setTitle(rent.getMovie().getTitle());
		response.setDate(rent.getRentdate());
		
		return response;
		
	}
}
