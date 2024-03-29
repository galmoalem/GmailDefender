package data;

import javax.persistence.Column ;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
@Entity
@Data
public class UserEntity {

@Id()
@Column(name = "ID_")
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;	

@Column(name = "USERNAME_", nullable = false, unique = true)
private String userName;

@Column(name = "PASSWORD_", nullable = false)
private String password;

@Column(name = "EMAIL_", nullable = false)
@Email
//TODO add unique index
private String email;




public UserEntity() {
	
}



public String getPassword() {
	return password;
}

public String getUsername() {
	return userName;
}

public boolean isAccountNonExpired() {
	return false;
}

public boolean isAccountNonLocked() {
	return false;
}

public boolean isCredentialsNonExpired() {
	return false;
}

public boolean isEnabled() {
	return false;
}

public void setId(Long id) {
	this.id = id;
}

public Long getId() {
	return id;
}

public void setUsername(String username) {
	this.userName = username;
}

public void setPassword(String password) {
	this.password = password;
}

public void setEmail(String email) {
	this.email = email;
}

public String getEmail() {
	return email;
}


}
