package kg.mega.student_performance.mappers;

import kg.mega.student_performance.model.dto.SchoolarshipDto;
import kg.mega.student_performance.model.entities.Schoolarship;

public interface SchoolarshipMapper {
    Schoolarship schoolarshipDtoToSchoolarship(SchoolarshipDto schoolarshipDto);
}
