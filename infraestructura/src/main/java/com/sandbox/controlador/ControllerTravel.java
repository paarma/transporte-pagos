package com.sandbox.controlador;

import com.sandbox.casouso.TravelCaseUse;
import com.sandbox.entidades.Travel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Travel> save(@RequestBody Travel travel){
        return new ResponseEntity<>(travelCaseUse.save(travel), HttpStatus.CREATED);
    }
}
