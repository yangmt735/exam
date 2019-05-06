package edu.nenu.onlineExam.studentuser.entity;

import edu.nenu.onlineExam.teacheruser.entity.BJ;
import edu.nenu.onlineExam.teacheruser.entity.HashSet;
import edu.nenu.onlineExam.teacheruser.entity.Integer;
import edu.nenu.onlineExam.teacheruser.entity.Set;
import edu.nenu.onlineExam.teacheruser.entity.String;

public class Student {
	private Integer tid;
	private String password;
	private String tname;
	private String phone;
	private String email;
	private Set<BJ> bjs = new HashSet<BJ>();
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
