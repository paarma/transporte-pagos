package com.sandbox.casouso;

import com.sandbox.entidades.Travel;
import com.sandbox.servicio.TravelService;

import javax.inject.Named;
import java.util.List;

@Named
public class TravelCaseUse {

    private TravelService travelService;

    public TravelCaseUse(TravelService travelService) {
        this.travelService = travelService;
    }

    public List<Travel> getListAllTravel(){
        return travelService.getAll();
    }

    public Travel save(Travel travel) {
        return travelService.save(travel);
    }
}
