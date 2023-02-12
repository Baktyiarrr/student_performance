package kg.mega.student_performance.services.impl;

import kg.mega.student_performance.mappers.SubjectMapper;
import kg.mega.student_performance.model.dto.SubjectDto;
import kg.mega.student_performance.model.entities.Subject;
import kg.mega.student_performance.repositories.SubjectRepo;
import kg.mega.student_performance.services.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectMapper subjectMapper;
    private final SubjectRepo subjectRepo;

    public SubjectServiceImpl(SubjectMapper subjectMapper, SubjectRepo subjectRepo) {
        this.subjectMapper = subjectMapper;
        this.subjectRepo = subjectRepo;
    }

    @Override
    public SubjectDto create(SubjectDto subjectDto) {
        Subject subject = subjectMapper.subjectDtoToSubject(subjectDto);
        subject = subjectRepo.save(subject);
        subjectDto.setId(subject.getId());
        return subjectDto;
    }
}
