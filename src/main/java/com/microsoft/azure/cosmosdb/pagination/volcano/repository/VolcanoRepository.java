package com.microsoft.azure.cosmosdb.pagination.volcano.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.microsoft.azure.cosmosdb.pagination.volcano.model.Volcano;
import org.springframework.stereotype.Repository;


@Repository
public interface VolcanoRepository extends CosmosRepository<Volcano, String> {

}


