package kg.mega.student_performance.services.impl;

import kg.mega.student_performance.mappers.RatesMapper;
import kg.mega.student_performance.model.dto.RatesDto;
import kg.mega.student_performance.model.entities.Rates;
import kg.mega.student_performance.repositories.RatesRepo;
import kg.mega.student_performance.services.RatesService;
import org.springframework.stereotype.Service;

@Service
public class RatesServiceImpl implements RatesService {
    private final RatesMapper ratesMapper;
    private final RatesRepo ratesRepo;

    public RatesServiceImpl(RatesMapper ratesMapper, RatesRepo repo) {
        this.ratesMapper = ratesMapper;
        this.ratesRepo = repo;
    }

    @Override
    public RatesDto create(RatesDto ratesDto) {
        Rates rates = ratesMapper.ratesDtoToRates(ratesDto);
        rates = ratesRepo.save(rates);
        ratesDto.setId(rates.getId());
        return ratesDto;
    }
}
