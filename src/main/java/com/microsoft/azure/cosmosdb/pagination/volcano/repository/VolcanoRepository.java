package com.microsoft.azure.cosmosdb.pagination.volcano.repository;

import com.microsoft.azure.cosmosdb.pagination.volcano.model.Volcano;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VolcanoRepository extends DocumentDbRepository<Volcano, String> {

}


