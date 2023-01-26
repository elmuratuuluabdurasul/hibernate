package peaksoft.servise;

import peaksoft.dao.StudentDao;
import peaksoft.dao.StudentDaoImpl;
import peaksoft.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentDao studentDao = new StudentDaoImpl();
    @Override
    public String saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {

        return studentDao.getAllStudent();
    }

    @Override
    public Student updateStudent(Long id, Student student) {

        return studentDao.updateStudent(id, student);
    }

    @Override
    public String deleteById(Long id) {
        return studentDao.deleteById(id);
    }

    @Override
    public void deleteAllStudent() {
        studentDao.deleteAllStudent();

    }
}
