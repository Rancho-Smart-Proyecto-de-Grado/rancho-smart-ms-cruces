package com.rancho_smart.ms_cruces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_cruces.entity.Cruce;

@Repository
public interface CruceRepository extends JpaRepository<Cruce, Long>{
    
}
