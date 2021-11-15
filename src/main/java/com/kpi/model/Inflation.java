package com.kpi.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="inflation")
public class Inflation {

    @Id
    @GeneratedValue
    @Column(name = "Inflation_IDE",updatable = false, nullable = false)
    Long inflationIDE;
    
    @Column(name = "Country")
    String country;
    
    @Column(name = "CountryCode")
    String countryCode;
    
    @Column(name = "Year")
    Integer year;
    
    @Column(name = "Inflation")
    BigDecimal inflation;
}
