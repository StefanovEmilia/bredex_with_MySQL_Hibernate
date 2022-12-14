package bredex.backendTest.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Client {
	
	@Id
	@Column(name="apiKey")
	private String apiKey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client [apiKey=" + apiKey + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
