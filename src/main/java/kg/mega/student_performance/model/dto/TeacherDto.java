package kg.mega.student_performance.model.dto;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherDto {
    @Id
    Long id;
    String name;
    String lastName;
    String patronymic;
    boolean isActive;
}
