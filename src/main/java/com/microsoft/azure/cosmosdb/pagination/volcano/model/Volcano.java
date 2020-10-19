package com.microsoft.azure.cosmosdb.pagination.volcano.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.microsoft.azure.cosmosdb.pagination.Constants;

import lombok.*;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Container(containerName  = Constants.DEFAULT_VOLCANO_CONTAINER_NAME)

public class Volcano {

    @Id
    private String id;

    private String volcanoName;

    private String country;

    private String region;

    private Location location;

    private Integer elevation;

    private String status;

    private String lastKnownEruption;

    @PartitionKey
    private String type;


}