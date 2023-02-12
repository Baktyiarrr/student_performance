package kg.mega.student_performance.mappers;

import kg.mega.student_performance.model.dto.ExamDto;
import kg.mega.student_performance.model.entities.Exam;

public interface ExamMapper {
    Exam examDtoToExam(ExamDto examDto);
}
