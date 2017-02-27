package com.full.contact.model;

public class Name {
	private  String fName="";
	private String mName="";
	private String lName="";
	private String nickName="";
	public void setFname(String f)
	{
		this.fName=f;
	}
	public void setMname(String m)
	{
		this.mName=m;
	}
	public void setLname(String l)
	{
		this.lName=l;
	}
	public void setNickName(String n)
	{
		this.nickName=n;
	}

	
	public  String getFname()
	{
		return fName;
	}
	public String getMname()
	{
		return mName;
	}
	public  String getLname()
	{
		return lName;
	}
	public String getNickName()
	{
		return nickName;
	}
	public String toString()
	{
		return fName +" "+mName+""+lName;
	}
	

}

