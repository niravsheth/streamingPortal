package net.javaguides.streamingPortal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public long id;
	
	@Column(name="first_name",nullable=false)
	public String firstName;
	
	@Column(name="last_name",nullable=false)
	public String lastName;
	
	@Column(name="email",nullable=false)
	public String emailString;
}
