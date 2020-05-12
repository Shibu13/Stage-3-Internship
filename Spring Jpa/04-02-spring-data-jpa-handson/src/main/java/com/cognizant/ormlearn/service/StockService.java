package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    @Transactional
    public List<Stock> findAll() {
        List<Stock> stockList = new ArrayList<>();
        stockRepository.findAll().forEach(stockList::add);
        return stockList;
    }

    @Transactional
    public List<Stock> stocksByCodeAndMonth(String st_Code, Date startDate, Date endDate) {
        return stockRepository.findByCodeAndDateBetween(st_Code, startDate, endDate);
    }

    @Transactional
    public List<Stock> stocksByCodeAndCloseGreaterThan(String st_Code, BigDecimal close) {
        return stockRepository.findByCodeAndCloseGreaterThan(st_Code, close);
    }

    @Transactional
    public List<Stock> top3StockByVolume() {
        return stockRepository.findTop3ByOrderByVolumeDesc();
    }

    @Transactional
    public List<Stock> bottom3StockByCodeAndVolume(String st_Code) {
        return stockRepository.findTop3ByCodeOrderByVolumeAsc(st_Code);
    }

}
