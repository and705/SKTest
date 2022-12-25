package com.example.SKtest.repo;

import com.example.SKtest.models.SkExampleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<SkExampleTable, Integer> {
}
