package com.microsoft.azure.cosmosdb.pagination.volcano.config;

import com.microsoft.azure.spring.data.cosmosdb.config.AbstractDocumentDbConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.DocumentDBConfig;
import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableDocumentDbRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * RepositoryConfig
 */
@Configuration
@EnableDocumentDbRepositories(basePackages = "com.microsoft.azure.cosmosdb.pagination.*")
@EnableConfigurationProperties

public class RepositoryConfig extends AbstractDocumentDbConfiguration {

    @Value("${azure.cosmosdb.uri}")
    private String uri;

    @Value("${azure.cosmosdb.key}")
    private String key;

    @Value("${azure.cosmosdb.database}")
    private String dbName;

    @Override
    public DocumentDBConfig getConfig() {
        return DocumentDBConfig.builder(uri, key, dbName).build();
    }
}