package kg.mega.student_performance.services.impl;

import kg.mega.student_performance.mappers.TeacherMapper;
import kg.mega.student_performance.model.dto.TeacherDto;
import kg.mega.student_performance.model.entities.Teacher;
import kg.mega.student_performance.repositories.TeacherRepo;
import kg.mega.student_performance.services.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherMapper teacherMapper;
    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherMapper teacherMapper, TeacherRepo teacherRepo) {
        this.teacherMapper = teacherMapper;
        this.teacherRepo = teacherRepo;
    }

    @Override
    public TeacherDto create(TeacherDto teacherDto) {
        Teacher teacher = teacherMapper.teacherDtoToTeacher(teacherDto);
        teacher = teacherRepo.save(teacher);
        teacherDto.setId(teacher.getId());
        return teacherDto;
    }
}
