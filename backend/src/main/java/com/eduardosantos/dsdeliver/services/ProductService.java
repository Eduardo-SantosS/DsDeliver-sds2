package com.eduardosantos.dsdeliver.services;

import com.eduardosantos.dsdeliver.dto.ProductDTO;
import com.eduardosantos.dsdeliver.entities.Product;
import com.eduardosantos.dsdeliver.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(ProductDTO::new).collect(Collectors.toList());
    }
}
