package com.redlake.themcset.model;

public class BlogPosting {
	
	public String Title;
	public String Body;
	public String Blog_Date;
	public String Member_Name;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	public String getBlog_Date() {
		return Blog_Date;
	}
	public void setBlog_Date(String blog_Date) {
		Blog_Date = blog_Date;
	}
	public String getMember_Name() {
		return Member_Name;
	}
	public void setMember_Name(String member_Name) {
		Member_Name = member_Name;
	}
	
	
	public BlogPosting (String title, String body, String blog_date, String member_name) {
				
		this.Title = title;
		this.Body = body;
		this.Blog_Date = blog_date;
		this.Member_Name = member_name;
	}

}
