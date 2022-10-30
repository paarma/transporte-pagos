package com.sandbox.repositorio;

import com.sandbox.entidades.Travel;

import java.util.List;

public interface TravelRepository {

    List<Travel> getAll();

    Travel save(Travel travel);
}
