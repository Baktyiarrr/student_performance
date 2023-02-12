package kg.mega.student_performance.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import kg.mega.student_performance.model.entities.Subject;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDto {
    @Id
    Long id;
    String name;
    @JsonProperty("last_name")
    String lastName;
    String patronymic;
    @JsonProperty("is_active")
    boolean isActive;
   /* Subject subject;*/
}
