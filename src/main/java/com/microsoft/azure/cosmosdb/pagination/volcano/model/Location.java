package com.microsoft.azure.cosmosdb.pagination.volcano.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Location {

    private String type;

    private List<Double> coordinates = null;

}