package kg.mega.student_performance.repositories;

import kg.mega.student_performance.model.entities.Rates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatesRepo extends JpaRepository<Rates, Long> {
}
