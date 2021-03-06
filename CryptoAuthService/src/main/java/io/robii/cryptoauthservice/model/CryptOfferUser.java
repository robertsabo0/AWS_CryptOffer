package io.robii.cryptoauthservice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class CryptOfferUser {

	@Column(unique=true)
	@Id
	private String username;
	
	private String mail;
	private String name;
	
	@JsonIgnore
	private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "username", referencedColumnName = "username"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_name", referencedColumnName = "name")) 
	private List<CORole> roles;
	
	
	
	public CryptOfferUser() {
		super();
	}
	public CryptOfferUser(String username, String mail, String name, String password, List<CORole> roles) {
		super();
		this.username = username;
		this.mail = mail;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<CORole> getRoles() {
		return roles;
	}
	public void setRoles(List<CORole> roles) {
		this.roles = roles;
	}
	
}
