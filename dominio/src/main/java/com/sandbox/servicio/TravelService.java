package com.sandbox.servicio;

import com.sandbox.entidades.Travel;
import com.sandbox.repositorio.TravelRepository;

import javax.inject.Named;
import java.util.List;

@Named
public class TravelService {

    private TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    public List<Travel> getAll(){
        return travelRepository.getAll();
    }
}
