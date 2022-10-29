package com.sandbox.persistencia.mapper;

import com.sandbox.entidades.Travel;
import com.sandbox.persistencia.entitys.Viaje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DriverMapper.class})
public interface TravelMapper {

    @Mappings({
            @Mapping(source = "idViaje", target = "travelID"),
            @Mapping(source = "latitudInicio", target = "startLatitude"),
            @Mapping(source = "longitudInicio", target = "startLength"),
            @Mapping(source = "latitudFin", target = "endLatitude"),
            @Mapping(source = "longitudFin", target = "endLenth"),
            @Mapping(source = "emailCliente", target = "emailCustomer"),
            @Mapping(source = "idConductor", target = "idDriver"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "totalRecorrido", target = "totalRoute"),
            @Mapping(source = "monto", target = "mount"),
            @Mapping(source = "conductor", target = "driver")
    })
    Travel toTravel(Viaje viaje);

    List<Travel> toTravels(List<Viaje> viajes);

}
