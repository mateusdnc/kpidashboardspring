package com.kpidashboardspring.kpi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpidashboardspring.kpi.model.Inflation;
import com.kpidashboardspring.kpi.repository.FilterRepository;
import com.kpidashboardspring.kpi.repository.InflationRepository;

@Service
@Transactional
public class InflationService {
 
    @Autowired
    private InflationRepository inflationRepository;
    
    @Autowired
    private FilterRepository filterRepository;
     
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
    
    public List<String> getCountryList(){
    	return filterRepository.getCountryList();
    }

    
    public List<Inflation> getInflationKPIData() {
    	return inflationRepository.getInflationBRA();
		
    }
}