package com.sandbox.persistencia;

import com.sandbox.entidades.Driver;
import com.sandbox.persistencia.entitys.Conductor;
import com.sandbox.persistencia.entitys.Viaje;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ViajeCrudRepositorio extends CrudRepository<Viaje, Long> {

    @Query(
            value = "SELECT ID\n" +
                    "FROM CONDUCTORES\n" +
                    "WHERE ID NOT IN (SELECT ID_CONDUCTOR FROM VIAJES WHERE ESTADO = 'EN_PROCESO')",
            nativeQuery = true
    )
    List<Long> finFreeDrivers();

}
