package net.javaguides.fms.service.impl;

import net.javaguides.fms.entity.Flix;
import net.javaguides.fms.repository.FlixRepository;
import net.javaguides.fms.service.FlixService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlixServiceImpl implements FlixService {

    private FlixRepository flixRepository;

    public FlixServiceImpl(FlixRepository flixRepository) {
        super();
        this.flixRepository = flixRepository;
    }

    @Override
    public List<Flix> getAllFlix() {

        return flixRepository.findAll();
    }

    @Override
    public Flix saveFlix(Flix flix) {

        return flixRepository.save(flix);
    }

    @Override
    public Flix getFlixById(Long id) {

        return flixRepository.findById(id).get();
    }

    @Override
    public Flix updateFlix(Flix flix) {

        return flixRepository.save(flix);
    }

    @Override
    public void deleteFlixById(Long id) {
        flixRepository.deleteById(id);

    }


}
