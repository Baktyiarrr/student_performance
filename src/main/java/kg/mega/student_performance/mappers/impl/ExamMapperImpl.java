package kg.mega.student_performance.mappers.impl;

import kg.mega.student_performance.mappers.ExamMapper;
import kg.mega.student_performance.model.dto.ExamDto;
import kg.mega.student_performance.model.entities.Exam;
import org.springframework.stereotype.Service;

@Service
public class ExamMapperImpl implements ExamMapper {
    @Override
    public Exam examDtoToExam(ExamDto examDto) {
        Exam exam = new Exam();
        exam.setId(examDto.getId());
        exam.setName(examDto.getName());
        exam.setDate(examDto.getDate());
        exam.setSubject(examDto.getSubject());
        exam.setDuration(examDto.getDuration());
        return exam;
    }
}
