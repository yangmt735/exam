package edu.nenu.onlineExam.studentuser.dao;

import edu.nenu.onlineExam.teacheruser.entity.Teacher;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import edu.nenu.onlineExam.teacheruser.entity.Teacher;

public class StudentDao extends HibernateDaoSupport{
	public Student login(Student student) {
		String hql = "from Student where tid = ? and password = ?";
		List<Student> list = (List<Student>) this.getHibernateTemplate().find(hql, student.getTid(),student.getPassword());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	public void updatePW(Integer tid, String npw) {
		String hql = "from Student where tid =? ";
		Student student = null;
		List<Student> list = (List<Student>) this.getHibernateTemplate().find(hql, tid);
		if(list != null && list.size()>0){
			student = (Student)list.get(0);
		}
		student.setPassword(npw);
		this.getHibernateTemplate().save(student);
	}
	
}
