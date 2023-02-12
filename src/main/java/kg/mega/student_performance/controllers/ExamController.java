package kg.mega.student_performance.controllers;

import kg.mega.student_performance.model.dto.ExamDto;
import kg.mega.student_performance.services.ExamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }
    @PostMapping("/create")
    public ExamDto create(@RequestBody ExamDto examDto){
        return examService.create(examDto);
    }
}
