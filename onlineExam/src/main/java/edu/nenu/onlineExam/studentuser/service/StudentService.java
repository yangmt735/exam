package edu.nenu.onlineExam.studentuser.service;

import org.springframework.transaction.annotation.Transactional;

import edu.nenu.onlineExam.teacheruser.dao.TeacherDao;
import edu.nenu.onlineExam.Teacheruser.entity.Teacher;

@Transactional
public class StudentService {
	
	private StudentDao studentUserDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
֤	public Student login(Student student) {
		return studentDao.login(student);
	}

	public void updatePW(Integer tid, String npw) {
		studentDao.updatePW(tid,npw);
	}

	public void deleteTeacher(Integer tid)
	{
		studentDao.deleteTeacher(tid);
	}
	
	public void addTeacher(Teacher teacher)
	{
		studentDao.addTeacher(teacher);
	}
}
