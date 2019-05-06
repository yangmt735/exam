package edu.nenu.onlineExam.teacher.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import edu.nenu.onlineExam.teacheruser.entity.Teacher;
import edu.nenu.onlineExam.teacheruser.service.TeacherUserService;
 

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> ,SessionAware{
	private Teacher teacher = new Teacher();
	private TeacherService teacherService;
	
	public void seTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public Teacher getModel() {
		return teacher;
	}
	
	private String npw;
	public void setNpw(String npw) {
		this.npw = npw;
	}

	
	public String alogin(){
		return "alogin";
	}
	
	
	public String login(){
		
		Teacher existTeacher = teacherService.login(teacher);
		
		if(existAdmin == null){
			this.addActionError("");
			return "loginFailadmin";
		}else{
			
			ServletActionContext.getRequest().getSession().setAttribute("existTeacher", existTeacher);
			return "loginSuccessadmin";	
		}		
	}
	
	public String ckxx(){
		return "ckxxteacher";
	}
	//�޸�����
	public String upw(){
		return "upwteacher";
	}
	public String updatePW(){
		teacherService.updatePW(teacher.getUid(),npw);
		return "updateteacherPW";
	}
	
	public String addTeacher()  {
		
		teacherService.addTeacher(teacher);
	}
	
	public string deleteTeacher(Integer tid)
	{
		teacherService.deleteTeacher(tid);
	}
	
	//��ȫ�˳����session
	public String sessionDestory(){
		ServletActionContext.getRequest().getSession().invalidate();
		return "sessionDestoryteacher";
	}

	public void setSession(Map<String, Object> arg0) {
	}
}
