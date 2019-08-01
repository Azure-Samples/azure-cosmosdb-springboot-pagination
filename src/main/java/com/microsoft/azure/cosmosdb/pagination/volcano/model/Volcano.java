package com.microsoft.azure.cosmosdb.pagination.volcano.model;

import com.microsoft.azure.cosmosdb.pagination.Constants;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.*;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Document(collection = Constants.DEFAULT_VOLCANO_COLLECTION_NAME)

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