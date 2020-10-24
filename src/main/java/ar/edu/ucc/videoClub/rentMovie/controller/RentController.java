package ar.edu.ucc.videoClub.rentMovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.videoClub.rentMovie.dto.RentRequestDto;
import ar.edu.ucc.videoClub.rentMovie.dto.RentResponseDto;
import ar.edu.ucc.videoClub.rentMovie.service.RentService;


@Controller
@RequestMapping("/rent")
public class RentController {

	@Autowired
	private RentService rentService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RentResponseDto registrar(@RequestBody RentRequestDto request) {
		return rentService.registerRent(request);
	}
}
