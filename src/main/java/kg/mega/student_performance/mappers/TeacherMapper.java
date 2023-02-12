package kg.mega.student_performance.mappers;

import kg.mega.student_performance.model.dto.TeacherDto;
import kg.mega.student_performance.model.entities.Teacher;

public interface TeacherMapper {
    Teacher teacherDtoToTeacher(TeacherDto teacherDto);
}
