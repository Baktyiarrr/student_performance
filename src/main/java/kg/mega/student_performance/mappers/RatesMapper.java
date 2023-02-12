package kg.mega.student_performance.mappers;

import kg.mega.student_performance.model.dto.RatesDto;
import kg.mega.student_performance.model.entities.Rates;

public interface RatesMapper {
    Rates ratesDtoToRates(RatesDto ratesDto);
}
