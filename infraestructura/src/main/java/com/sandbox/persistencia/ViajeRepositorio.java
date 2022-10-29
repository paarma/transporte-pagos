package com.sandbox.persistencia;

import com.sandbox.entidades.Travel;
import com.sandbox.persistencia.entitys.Viaje;
import com.sandbox.persistencia.mapper.TravelMapper;
import com.sandbox.repositorio.TravelRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ViajeRepositorio implements TravelRepository {

    private ViajeCrudRepositorio viajeCrudRepositorio;
    private TravelMapper mapper;

    public ViajeRepositorio(ViajeCrudRepositorio viajeCrudRepositorio, TravelMapper mapper) {
        this.viajeCrudRepositorio = viajeCrudRepositorio;
        this.mapper = mapper;
    }

    @Override
    public List<Travel> getAll() {
        List<Viaje> viajes = (List<Viaje>) this.viajeCrudRepositorio.findAll();
        return mapper.toTravels(viajes);
    }
}
