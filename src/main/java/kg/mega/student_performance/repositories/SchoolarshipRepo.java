package kg.mega.student_performance.repositories;

import kg.mega.student_performance.model.entities.Schoolarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolarshipRepo extends JpaRepository<Schoolarship, Long> {
}
