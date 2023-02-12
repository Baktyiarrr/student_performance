package kg.mega.student_performance.model.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import kg.mega.student_performance.model.entities.Exam;
import kg.mega.student_performance.model.entities.Student;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatesDto {
    @Id
    Long id;
    int score;
    Student student;
    Exam exam;
}
