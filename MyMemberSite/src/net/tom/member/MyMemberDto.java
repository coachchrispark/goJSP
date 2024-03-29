package net.tom.member;

import java.util.Date;

public class MyMemberDto {
	
	private	int no = 0;              
	private	String name = ""; 
	private	String email = ""; 
	private	String password = ""; 
	private	Date createDate = null;
	private	Date modifiedDate = null;
	
	public MyMemberDto() {
		super();
	}
	
	public MyMemberDto(int no, String name, String email, Date createDate) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.createDate = createDate;
	}

	public MyMemberDto(int no, String name, String email, String password, Date createDate, Date modifiedDate) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.password = password;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "MyMemberDto [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
}
