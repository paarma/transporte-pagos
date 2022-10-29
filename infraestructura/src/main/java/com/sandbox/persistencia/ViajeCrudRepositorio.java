package com.sandbox.persistencia;

import com.sandbox.persistencia.entitys.Viaje;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ViajeCrudRepositorio extends CrudRepository<Viaje, Long> {

}
