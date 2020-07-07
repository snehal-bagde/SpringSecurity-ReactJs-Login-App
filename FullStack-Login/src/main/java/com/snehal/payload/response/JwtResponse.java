package com.snehal.payload.response;

import java.util.List;
import java.util.Set;

public class JwtResponse {

	private Long id;

	private String token;

	private String tokenType = "Bearer";

	private String username;

	private String email;

	private List<String> role;

	public JwtResponse(Long id, String token, String username, String email, List<String> role) {
		super();
		this.id = id;
		this.token = token;
		this.username = username;
		this.email = email;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

}
