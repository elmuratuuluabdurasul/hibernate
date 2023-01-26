package peaksoft.dao;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentDao {
    // CREATE save
    String saveStudent(Student student);

    // READ getById, getAll
    Student getStudentById(Long id);
    List<Student> getAllStudent();

    //UPDATE
    Student updateStudent(Long id, Student student);

    //DELETE
    String deleteById(Long id);
    void deleteAllStudent();
}
