package kg.mega.student_performance.mappers.impl;

import kg.mega.student_performance.mappers.SubjectMapper;
import kg.mega.student_performance.model.dto.SubjectDto;
import kg.mega.student_performance.model.entities.Subject;
import org.springframework.stereotype.Service;

@Service
public class SubjectMapperImpl implements SubjectMapper {
    @Override
    public Subject subjectDtoToSubject(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setId(subjectDto.getId());
        subject.setName(subjectDto.getName());
        subject.setActive(subject.isActive());
        subject.setTeacher(subjectDto.getTeacher());
        return subject;
    }
}
