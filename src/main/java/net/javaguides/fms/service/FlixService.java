package net.javaguides.fms.service;

import net.javaguides.fms.entity.Flix;

import java.util.List;

public interface FlixService {
    List<Flix> getAllFlix();

    Flix saveFlix(Flix flix);

    Flix getFlixById(Long id);

    Flix updateFlix(Flix flix);

    void deleteFlixById(Long id);

    List first_page_flix();




}
