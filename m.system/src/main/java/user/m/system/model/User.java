package user.m.system.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity (name="user")
public class User {

	@NotNull(message = "First Name cannot be null")
	@NotBlank(message = "First Name cannot be blank")
	@Size(min = 2, message = "First Name must be at least 2 characters")
	private String firstName;

	@NotNull(message = "Last Name cannot be null")
	@NotBlank(message = "Last Name cannot be blank")
	private String lastName;

	@NotNull(message = "Email cannot be null")
	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Email should be valid")
	private String emailAddress;

	@NotNull(message = "Date of Birth cannot be null")
	@JsonFormat( shape = JsonFormat.Shape.STRING , pattern = "yyyy-MM-dd" )
	private Date dateOfBirth;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	public User(String firstName, String lastName, String emailAddress, Date dateOfBirth, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
	}


	public User() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


}
