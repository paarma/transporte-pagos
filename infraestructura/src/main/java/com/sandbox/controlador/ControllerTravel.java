package com.sandbox.controlador;

import com.sandbox.casouso.TravelCaseUse;
import com.sandbox.entidades.Travel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/viajes")
public class ControllerTravel {

    private TravelCaseUse travelCaseUse;

    public ControllerTravel(TravelCaseUse travelCaseUse) {
        this.travelCaseUse = travelCaseUse;
    }

    @GetMapping
    public List<Travel> getAllTravel(){
        return travelCaseUse.getListAllTravel();
    }
}
