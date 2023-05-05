package com.masai.MGNAREGA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CurrentUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer currentUserId;
	private Integer userId;
	private String uuId;
	
	public CurrentUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentUser(Integer userId, String uuId) {
		super();
		this.userId = userId;
		this.uuId = uuId;
	}
	public Integer getCurrentUserId() {
		return currentUserId;
	}
	public void setCurrentUserId(Integer currentUserId) {
		this.currentUserId = currentUserId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUuId() {
		return uuId;
	}
	public void setUuId(String uuId) {
		this.uuId = uuId;
	}
	
	

}
