package kg.mega.student_performance.mappers.impl;

import kg.mega.student_performance.mappers.RatesMapper;
import kg.mega.student_performance.model.dto.RatesDto;
import kg.mega.student_performance.model.entities.Rates;
import org.springframework.stereotype.Service;

@Service
public class RatesMapperImpl implements RatesMapper {
    @Override
    public Rates ratesDtoToRates(RatesDto ratesDto) {
        Rates rates = new Rates();
        rates.setId(ratesDto.getId());
        rates.setExam(ratesDto.getExam());
        rates.setScore(ratesDto.getScore());
        rates.setStudent(ratesDto.getStudent());
        return rates;
    }
}
