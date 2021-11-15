package com.kpi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpi.model.Inflation;
import com.kpi.repository.InflationRepository;

@Service
@Transactional
public class InflationService {
 
    @Autowired
    private InflationRepository inflationRepository;
     
    public List<Inflation> listAll() {
        return inflationRepository.findAll();
    }
     
    public void save(Inflation Seguro) {
        inflationRepository.save(Seguro);
    }
     
    public Inflation get(long id) {
        return inflationRepository.findById(id).get();
    }
     
    public void delete(long id) {
        inflationRepository.deleteById(id);
    }
    
    public List<Integer> getInflationYear(){
    	List<Integer> years = new ArrayList<Integer>();
		for (Inflation inflation : inflationRepository.getInflationBRA()) {
			years.add(inflation.getYear());
		}
    	return years;
    }
    
    public List<BigDecimal> getInflationBRA(){
    	List<BigDecimal> inflations = new ArrayList<BigDecimal>();
		for (Inflation inflation : inflationRepository.getInflationBRA()) {
			inflations.add(inflation.getInflation());
		}
    	return inflations;
    }
    
    public List<BigDecimal> getInflationARG(){
    	List<BigDecimal> inflations = new ArrayList<BigDecimal>();
		for (Inflation inflation : inflationRepository.getInflationARG()) {
			inflations.add(inflation.getInflation());
		}
    	return inflations;
    }
}