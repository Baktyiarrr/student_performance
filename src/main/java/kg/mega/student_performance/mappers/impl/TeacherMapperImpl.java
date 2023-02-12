package kg.mega.student_performance.mappers.impl;

import kg.mega.student_performance.mappers.TeacherMapper;
import kg.mega.student_performance.model.dto.TeacherDto;
import kg.mega.student_performance.model.entities.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public Teacher teacherDtoToTeacher(TeacherDto teacherDto) {
        Teacher teacher = new Teacher();
        teacher.setId(teacherDto.getId());
        teacher.setName(teacherDto.getName());
        teacher.setLastName(teacherDto.getLastName());
        teacher.setPatronymic(teacherDto.getPatronymic());
        teacher.setActive(teacherDto.isActive());
        return teacher;
    }
}
