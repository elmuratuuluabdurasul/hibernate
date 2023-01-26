package peaksoft.servise;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentService {
    String saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudent();
    Student updateStudent(Long id, Student student);

    String deleteById(Long id);
    void deleteAllStudent();
}
