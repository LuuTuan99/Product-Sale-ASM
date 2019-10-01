package com.fpt.service;

import com.fpt.entity.Sale;
import com.fpt.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public List<Sale> getList() {
        return saleRepository.findAll();
    }

    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }

    public Sale getDetail(long id) {
        return saleRepository.findById(id).orElse(null);
    }
}
