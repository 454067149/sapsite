package com.sap.sapsite.pojo;

public class Message {
	private Integer id;
	private String name;
	private String phone;
	private String content;
	private String audit;
	public Message() {
		super();
	}
	public Message(Integer id, String name, String phone, String content, String audit) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.content = content;
		this.audit = audit;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAudit() {
		return audit;
	}
	public void setAudit(String audit) {
		this.audit = audit;
	}
	
}
