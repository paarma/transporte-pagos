package com.sandbox.persistencia;

import com.sandbox.persistencia.entitys.Conductor;
import org.springframework.data.repository.CrudRepository;

public interface ConductorCrudRepositorio extends CrudRepository<Conductor, Long> {

}
