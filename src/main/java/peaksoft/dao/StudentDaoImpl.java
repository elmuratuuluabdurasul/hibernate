package peaksoft.dao;

import org.hibernate.Session;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public String saveStudent(Student student) {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstName() + " added to database...";
    }

    @Override
    public Student getStudentById(Long id) {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        Student student1 = session.get(Student.class, id);
        session.getTransaction().commit();
        session.close();
        return student1;
    }

    @Override
    public List<Student> getAllStudent() {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        List<Student> studentList = session.createQuery("from Student ").getResultList();
        session.getTransaction().commit();
        session.close();
        return studentList;
    }

    @Override
    public Student updateStudent(Long id, Student newStudent) {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        Student oldStudent = session.get(Student.class,id);
        oldStudent.setFirstName(newStudent.getFirstName());
        oldStudent.setLastName(newStudent.getLastName());
        oldStudent.setAge(newStudent.getAge());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setAge(newStudent.getAge());
        oldStudent.setGender(newStudent.getGender());
        session.getTransaction().commit();
        session.close();
        return newStudent;
    }

    @Override
    public String deleteById(Long id) {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstName() + "deleted ...";
    }

    @Override
    public void deleteAllStudent() {
        Session session = HibernateConfig.createSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("from Student ").executeUpdate();
        session.getTransaction().commit();
        session.close();

    }
}
