package ar.edu.ucc.videoClub.rentMovie.dao;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.videoClub.common.dao.GenericDaoImp;
import ar.edu.ucc.videoClub.rentMovie.model.Rent;

@Repository
public class RentDaoImp extends GenericDaoImp<Rent, Long> implements RentDao{

}
