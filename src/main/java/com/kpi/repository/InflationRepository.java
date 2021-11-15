package com.kpi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kpi.model.Inflation;

public interface InflationRepository extends JpaRepository<Inflation, Long> {

	@Query(value = "SELECT * FROM test.inflation where CountryCode = 'ARG'", nativeQuery = true)
	List<Inflation> getInflationARG();
	
	@Query(value = "SELECT * FROM test.inflation where CountryCode = 'BRA'", nativeQuery = true)
	List<Inflation> getInflationBRA();
		
}
