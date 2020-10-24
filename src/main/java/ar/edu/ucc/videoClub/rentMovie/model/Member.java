package ar.edu.ucc.videoClub.rentMovie.model;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.videoClub.common.model.GenericObject;

@Entity
@Table(name = "MEMBER")
public class Member extends GenericObject {
	
	@NotNull
	@Size(min = 1, max = 400)
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "LASTNAME")
	private String lastname;
	
	@NotNull
	@Size(min = 1, max = 12)
	@Column(name = "DNI")
	private String dni;
	
	@NotNull
	@Size(min = 1, max = 400)
	@Column(name = "EMAIL")
	private String email;
	
	@OneToMany(mappedBy="member", fetch = FetchType.LAZY)
	private Set<Rent> rent;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Rent> getRent() {
		return rent;
	}

	public void setRent(Set<Rent> rent) {
		this.rent = rent;
	}

	
}
