package com.demo.MusicWebsite.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="User")
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer id;
	
	String login;
	
	String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, login, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(id, other.id) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", login=" + login + ", password=" + password + "]";
	}

	

	
	
	
}
