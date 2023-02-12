package kg.mega.student_performance.controllers;

import kg.mega.student_performance.model.dto.StudentDto;
import kg.mega.student_performance.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/create")
    public StudentDto create(@RequestBody StudentDto studentDto){
        return studentService.create(studentDto);
    }
}
