package ar.edu.ucc.videoClub.rentMovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.videoClub.rentMovie.dto.MemberRequestDto;
import ar.edu.ucc.videoClub.rentMovie.dto.MemberResponseDto;
import ar.edu.ucc.videoClub.rentMovie.service.MemberService;



@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MemberResponseDto registrar(@RequestBody MemberRequestDto request) {
		return memberService.registerMember(request);
	}
}
