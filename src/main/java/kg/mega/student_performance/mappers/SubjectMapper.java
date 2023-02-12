package kg.mega.student_performance.mappers;

import kg.mega.student_performance.model.dto.SubjectDto;
import kg.mega.student_performance.model.entities.Subject;

public interface SubjectMapper {
    Subject subjectDtoToSubject(SubjectDto subjectDto);
}
