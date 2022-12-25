package com.example.SKtest.service;

import com.example.SKtest.models.SkExampleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SKtest.repo.TestRepository;

import java.util.List;
import java.util.logging.SocketHandler;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;


    public void save(SkExampleTable skExampleTable) {
        testRepository.save(skExampleTable);
    }

    public SkExampleTable findById(int id) {
        return testRepository.findById(id).orElse(null);
    }

    public List<SkExampleTable> findAll() {
        return testRepository.findAll();
    }

}
