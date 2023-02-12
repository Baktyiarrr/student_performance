package kg.mega.student_performance.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import kg.mega.student_performance.model.entities.Student;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SchoolarshipDto {
    @Id
    Long id;
    String name;
    int rate;
    @JsonProperty("start_date")
    Date startDate;
    @JsonProperty("end_date")
    Date endDate;
    Student student;

}
