package kg.mega.student_performance.services.impl;

import kg.mega.student_performance.mappers.ExamMapper;
import kg.mega.student_performance.model.dto.ExamDto;
import kg.mega.student_performance.model.entities.Exam;
import kg.mega.student_performance.repositories.ExamRepo;
import kg.mega.student_performance.services.ExamService;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamMapper examMapper;
    private final ExamRepo examRepo;

    public ExamServiceImpl(ExamMapper examMapper, ExamRepo examRepo) {
        this.examMapper = examMapper;
        this.examRepo = examRepo;
    }

    @Override
    public ExamDto create(ExamDto examDto) {
        Exam exam = examMapper.examDtoToExam(examDto);
        exam = examRepo.save(exam);
        examDto.setId(exam.getId());
        return examDto;
    }
}
