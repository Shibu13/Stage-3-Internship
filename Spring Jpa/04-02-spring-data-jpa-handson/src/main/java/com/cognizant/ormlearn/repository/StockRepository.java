package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {

    List<Stock> findByCodeAndDateBetween(String st_Code, Date startDate, Date endDate);

    List<Stock> findByCodeAndCloseGreaterThan(String st_Code, BigDecimal close);

    List<Stock> findTop3ByOrderByVolumeDesc();

    List<Stock> findTop3ByCodeOrderByVolumeAsc(String st_Code);

}
