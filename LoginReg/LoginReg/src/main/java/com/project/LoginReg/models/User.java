package com.project.LoginReg.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User{
	@Id
	@GeneratedValue
	private long id;

	// Member variables and annotations go here.
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
	private Date updatedAt;

	@PrePersist
	public void onCreate(){this.createdAt = new Date();}
	@PreUpdate
	public void onUpdate(){this.updatedAt = new Date();}

	@Email(message="Invalid email format: --@blank.com")
	private String email;

	private boolean admin;

	
	@Size(min=1, max=255, message="Name must be between 1-255 characters")
	private String firstName;

	@Size(min=1, max=255, message="Name must be between 1-255 characters")
	private String lastName;

	
	@Size(min=8, max=255, message="Password must be between 8-255 characters")
	private String password;	
	
	@Transient
	private String confirm;


	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// Setters and Getters go here
	
	public User(){
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public void setEmail() {
		this.email=email;
	}

	public void setFirstName() {
		this.firstName=firstName;
	}

	public void setLastName() {
		this.lastName=lastName;
	}

	public void password() {
		this.password=password;
	}
	public void confirm() {
		this.confirm=confirm;
	}

	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirm() {
		return confirm;
	}

	private void setAdmin() {
		this.admin=admin;
	}

	public boolean getAdmin() {
		return admin;
	} 

}
