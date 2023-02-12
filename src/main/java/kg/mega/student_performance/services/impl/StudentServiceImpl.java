package kg.mega.student_performance.services.impl;

import kg.mega.student_performance.mappers.StudentMapper;
import kg.mega.student_performance.model.dto.StudentDto;
import kg.mega.student_performance.model.entities.Student;
import kg.mega.student_performance.repositories.StudentRepo;
import kg.mega.student_performance.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentDto create(StudentDto studentDto) {
        Student student = studentMapper.studentDtoToStudent(studentDto);
        student = studentRepo.save(student);
        studentDto.setId(student.getId());
        return studentDto;
    }
}
