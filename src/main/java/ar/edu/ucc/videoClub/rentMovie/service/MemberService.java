package ar.edu.ucc.videoClub.rentMovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.videoClub.rentMovie.dao.MemberDao;
import ar.edu.ucc.videoClub.rentMovie.dto.MemberRequestDto;
import ar.edu.ucc.videoClub.rentMovie.dto.MemberResponseDto;
import ar.edu.ucc.videoClub.rentMovie.model.Member;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public MemberResponseDto registerMember (MemberRequestDto dto) {
		Member member = new Member();
		
		member.setName(dto.getName());
		member.setLastname(dto.getLastname());
		member.setDni(dto.getDni());
		member.setEmail(dto.getEmail());
		
		memberDao.insert(member);
		
		MemberResponseDto memberdto = new MemberResponseDto();
		
		memberdto.setName(member.getName());
		memberdto.setLastname(member.getLastname());
		memberdto.setDni(member.getDni());
		memberdto.setEmail(member.getEmail());
		
		return memberdto;
	}
	
}
