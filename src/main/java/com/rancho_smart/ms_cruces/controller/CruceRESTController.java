package com.rancho_smart.ms_cruces.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rancho_smart.ms_cruces.entity.Cruce;
import com.rancho_smart.ms_cruces.service.CruceService;

@RestController
@RequestMapping(path = "/cruces")
public class CruceRESTController {

    @Autowired
    private CruceService cruceService;

    @GetMapping
    public ResponseEntity<List<Cruce>> getAllCruces() {
        List<Cruce> listado = this.cruceService.getCruces();
        return new ResponseEntity<>(listado, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cruce> getCruceById(@PathVariable Long id) {
        Optional<Cruce> cruce = this.cruceService.getCruceById(id);
        return cruce.map(ResponseEntity::ok)
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Cruce> saveCruce(@RequestBody Cruce cruce) {
        Cruce cruceCreado = this.cruceService.saveCruce(cruce);
        return new ResponseEntity<>(cruceCreado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cruce> updateCruce(@PathVariable Long id, @RequestBody Cruce cruce) {
        if (!this.cruceService.getCruceById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            cruce.setIdCruce(id);
            Cruce cruceActualizado = this.cruceService.saveCruce(cruce);
            return new ResponseEntity<>(cruceActualizado, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCruce(@PathVariable Long id) {
        if (!this.cruceService.getCruceById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.cruceService.deleteCruce(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
