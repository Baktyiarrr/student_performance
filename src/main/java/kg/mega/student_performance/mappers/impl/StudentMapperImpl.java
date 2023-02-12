package kg.mega.student_performance.mappers.impl;

import kg.mega.student_performance.mappers.StudentMapper;
import kg.mega.student_performance.model.dto.StudentDto;
import kg.mega.student_performance.model.entities.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student studentDtoToStudent(StudentDto studentDto) {
        kg.mega.student_performance.model.entities.Student student = new kg.mega.student_performance.model.entities.Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setLastName(studentDto.getLastName());
        student.setPatronymic(studentDto.getPatronymic());
        student.setActive(studentDto.isActive());
        /*student.setSubject(studentDto.getSubject());*/
        return student;
    }
}
