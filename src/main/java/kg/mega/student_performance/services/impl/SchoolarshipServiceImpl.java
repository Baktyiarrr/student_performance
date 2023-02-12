package kg.mega.student_performance.services.impl;

import kg.mega.student_performance.mappers.SchoolarshipMapper;
import kg.mega.student_performance.model.dto.SchoolarshipDto;
import kg.mega.student_performance.model.entities.Schoolarship;
import kg.mega.student_performance.repositories.SchoolarshipRepo;
import kg.mega.student_performance.services.SchoolarshipService;
import org.springframework.stereotype.Service;

@Service
public class SchoolarshipServiceImpl implements SchoolarshipService {
    private  final SchoolarshipMapper schoolarshipMapper;
    private final SchoolarshipRepo schoolarshipRepo;

    public SchoolarshipServiceImpl(SchoolarshipMapper schoolarshipMapper, SchoolarshipRepo schoolarshipRepo) {
        this.schoolarshipMapper = schoolarshipMapper;

        this.schoolarshipRepo = schoolarshipRepo;
    }

    @Override
    public SchoolarshipDto create(SchoolarshipDto schoolarshipDto) {
        Schoolarship schoolarship = schoolarshipMapper.schoolarshipDtoToSchoolarship(schoolarshipDto);
        schoolarship = schoolarshipRepo.save(schoolarship);
        schoolarshipDto.setId(schoolarship.getId());
        return schoolarshipDto;
    }
}
