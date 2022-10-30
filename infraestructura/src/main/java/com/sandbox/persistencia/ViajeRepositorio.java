package com.sandbox.persistencia;

import com.sandbox.entidades.Driver;
import com.sandbox.entidades.Travel;
import com.sandbox.persistencia.entitys.Conductor;
import com.sandbox.persistencia.entitys.Viaje;
import com.sandbox.persistencia.mapper.DriverMapper;
import com.sandbox.persistencia.mapper.TravelMapper;
import com.sandbox.repositorio.TravelRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ViajeRepositorio implements TravelRepository {

    private ViajeCrudRepositorio viajeCrudRepositorio;
    private ConductorCrudRepositorio conductorCrudRepositorio;
    private TravelMapper mapper;
    private DriverMapper driverMapper;

    public ViajeRepositorio(ViajeCrudRepositorio viajeCrudRepositorio,
                            ConductorCrudRepositorio conductorCrudRepositorio,
                            TravelMapper mapper,
                            DriverMapper driverMapper) {
        this.viajeCrudRepositorio = viajeCrudRepositorio;
        this.conductorCrudRepositorio = conductorCrudRepositorio;
        this.mapper = mapper;
        this.driverMapper = driverMapper;
    }

    @Override
    public List<Travel> getAll() {
        List<Viaje> viajes = (List<Viaje>) this.viajeCrudRepositorio.findAll();
        return mapper.toTravels(viajes);
    }

    @Override
    public Travel save(Travel travel) {
        travel.setState("EN_PROCESO");
        this.assingIdDriver(travel);
        Viaje viaje = mapper.toViaje(travel);
        this.setDataDriver(viaje);
        return mapper.toTravel(viajeCrudRepositorio.save(viaje));
    }

    private void assingIdDriver(Travel travel){
        List<Long> freeIdDrivers = this.viajeCrudRepositorio.finFreeDrivers();
        if(freeIdDrivers.isEmpty()){
            throw new RuntimeException("Error assigning driver.");
        }

        travel.setIdDriver(freeIdDrivers.get(0));
    }

    private void setDataDriver(Viaje viaje){
        Optional<Conductor> conductor = this.conductorCrudRepositorio.findById(viaje.getIdConductor());
        viaje.setConductor(conductor.get());
    }
}
