package kg.mega.student_performance.model.dto;

import jakarta.persistence.Id;
import kg.mega.student_performance.model.entities.Teacher;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubjectDto {
    @Id
    Long id;
    String name;
    boolean isActive;
    Teacher teacher;
}
