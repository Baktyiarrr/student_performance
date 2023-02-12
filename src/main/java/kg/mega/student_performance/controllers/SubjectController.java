package kg.mega.student_performance.controllers;

import kg.mega.student_performance.model.dto.SubjectDto;
import kg.mega.student_performance.services.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }
    @PostMapping("/create")
    public SubjectDto create(@RequestBody SubjectDto subjectDto){
        return subjectService.create(subjectDto);
    }
}
