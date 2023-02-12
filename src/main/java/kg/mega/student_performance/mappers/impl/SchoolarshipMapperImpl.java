package kg.mega.student_performance.mappers.impl;

import kg.mega.student_performance.mappers.SchoolarshipMapper;
import kg.mega.student_performance.model.dto.SchoolarshipDto;
import kg.mega.student_performance.model.entities.Schoolarship;
import org.springframework.stereotype.Service;

@Service
public class SchoolarshipMapperImpl implements SchoolarshipMapper {
    @Override
    public Schoolarship schoolarshipDtoToSchoolarship(SchoolarshipDto schoolarshipDto) {
        Schoolarship schoolarship = new Schoolarship();
        schoolarship.setId(schoolarshipDto.getId());
        schoolarship.setName(schoolarshipDto.getName());
        schoolarship.setRate(schoolarshipDto.getRate());
        schoolarship.setStudent(schoolarshipDto.getStudent());
        schoolarship.setStartDate(schoolarshipDto.getStartDate());
        schoolarship.setEndDate(schoolarshipDto.getEndDate());
        return schoolarship;
    }
}
