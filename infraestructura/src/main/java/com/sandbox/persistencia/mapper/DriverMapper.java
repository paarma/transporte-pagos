package com.sandbox.persistencia.mapper;

import com.sandbox.entidades.Driver;
import com.sandbox.persistencia.entitys.Conductor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    @Mappings({
            @Mapping(source = "idConductor", target = "idDriver"),
            @Mapping(source = "primerNombre", target = "firstName"),
            @Mapping(source = "segundoNombre", target = "secondName"),
            @Mapping(source = "primerApellido", target = "surname"),
            @Mapping(source = "segundoApellido", target = "secondSurname"),
            @Mapping(source = "identificacion", target = "identity"),
    })
    Driver toDriver(Conductor conductor);
}
