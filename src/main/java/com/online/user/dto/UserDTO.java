package com.online.user.dto;

public class UserDTO {

	private long userId;
    private String userName;
    private String emailId;
    private String phoneNo;
    private String address;
    
    
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserDTO(long userId, String userName, String emailId, String phoneNo, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.address = address;
	}


	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
    
	
	
}
