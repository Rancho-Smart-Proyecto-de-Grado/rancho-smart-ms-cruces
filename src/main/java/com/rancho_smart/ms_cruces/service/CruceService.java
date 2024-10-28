package com.rancho_smart.ms_cruces.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_cruces.entity.Cruce;
import com.rancho_smart.ms_cruces.repository.CruceRepository;

@Service
public class CruceService {

    @Autowired
    private CruceRepository cruceRepository;

    public List<Cruce> getCruces() {
        return this.cruceRepository.findAll();
    }

    public Optional<Cruce> getCruceById(Long id) {
        return this.cruceRepository.findById(id);
    }

    public Cruce saveCruce(Cruce cruce) {
        return this.cruceRepository.save(cruce);
    }

    public void deleteCruce(Long id) {
        this.cruceRepository.deleteById(id);
    }
}

