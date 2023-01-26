package peaksoft;

import peaksoft.servise.StudentService;
import peaksoft.servise.StudentServiceImpl;
public class App 
{
    public static void main( String[] args )
    {
        StudentService studentService = new StudentServiceImpl();
        //studentService.saveStudent(new Student("Suimonkul","Chokmorov",21,"S@gmail.com",Gender.MALE));
        //System.out.println(studentService.getStudentById(2L));
        //studentService.getAllStudent().forEach(System.out::println);
        //studentService.updateStudent(1L, new Student("Syimyk","Ulanuulu",20,"S@gmail.com",Gender.MALE));
        //studentService.deleteById(3L);
        studentService.deleteAllStudent();
    }
}
