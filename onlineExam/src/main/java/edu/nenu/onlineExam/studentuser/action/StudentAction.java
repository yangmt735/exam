package edu.nenu.onlineExam.studentuser.action;


import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import edu.nenu.onlineExam.teacheruser.action.Integer;
import edu.nenu.onlineExam.teacheruser.action.string;
import edu.nenu.onlineExam.teacheruser.entity.Teacher;
import edu.nenu.onlineExam.teacheruser.service.TeacherUserService;
 

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student> ,SessionAware{
	private Student Student = new Student();
	private StudentService StudentService;
	
	public void seStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public Student getModel() {
		return student;
	}
	
	private String npw;
	public void setNpw(String npw) {
		this.npw = npw;
	}

	
	public String alogin(){
		return "alogin";
	}
	
	
	public String login(){
		
		Student existStudent = studentService.login(student);
		
		if(existAdmin == null){
			this.addActionError("");
			return "loginFailadmin";
		}else{
			
			ServletActionContext.getRequest().getSession().setAttribute("existStudent", existStudent);
			return "loginSuccessadmin";	
		}		
	}
	
	public String ckxx(){
		return "ckxxstudent";
	}
	
	public String upw(){
		return "upwstudent";
	}
	
	public String updatePW(){
		studentService.updatePW(student.getUid(),npw);
		return "updatestudentPW";
	}
	
    public String addStudent()  {
		
		studentService.addStudent(student);
	}
	
	public string deleteStudent(Integer tid)
	{
		studentService.deleteStudent(tid);
	}
	
	public String sessionDestory(){
		ServletActionContext.getRequest().getSession().invalidate();
		return "sessionDestorystudent";
	}
	
	public void setSession(Map<String, Object> arg0) {
	}
}
