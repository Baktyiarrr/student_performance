package kg.mega.student_performance.model.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import kg.mega.student_performance.model.entities.Subject;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExamDto {
    @Id
    Long id;
    String name;
    Date date;
    Date duration;
    Subject subject;
}
