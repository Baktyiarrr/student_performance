package kg.mega.student_performance.mappers;

import kg.mega.student_performance.model.dto.StudentDto;
import kg.mega.student_performance.model.entities.Student;
import org.springframework.stereotype.Service;


public interface StudentMapper {
    Student studentDtoToStudent(StudentDto studentDto);
}
