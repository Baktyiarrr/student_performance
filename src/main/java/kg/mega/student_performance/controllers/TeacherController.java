package kg.mega.student_performance.controllers;

import kg.mega.student_performance.model.dto.TeacherDto;
import kg.mega.student_performance.services.TeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @PostMapping("/create")
    public TeacherDto create(@RequestBody TeacherDto teacherDto){
        return teacherService.create(teacherDto);
    }
}
