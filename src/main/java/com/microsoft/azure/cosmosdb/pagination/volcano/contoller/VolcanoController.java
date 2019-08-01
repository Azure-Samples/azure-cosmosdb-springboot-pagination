package com.microsoft.azure.cosmosdb.pagination.volcano.contoller;

import com.microsoft.azure.cosmosdb.pagination.volcano.model.Volcano;
import com.microsoft.azure.cosmosdb.pagination.volcano.service.VolcanoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "/api" ,produces = MediaType.APPLICATION_JSON_VALUE)
public class VolcanoController {
    @Autowired
    VolcanoService volcanoService;

    @RequestMapping(value="/volcanoes", method=RequestMethod.GET)
    @ApiOperation(value = "Get all volcanoes", notes = "Retrieve all volcanoes")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "List of volcano objects") })
    public ResponseEntity<List<Volcano>> getAllVolcanoes(){
        List<Volcano> volcanoes = volcanoService.getAllVolcanoes();
        return new ResponseEntity<>(volcanoes, HttpStatus.OK);

    }


    @RequestMapping(value="/volcanoesbypage", method=RequestMethod.GET)
    @ApiOperation(value = "Get all volcanoes by page", notes = "Retrieve all volcanoes by page")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "List of volcano objects by page") })
    public ResponseEntity<List<Volcano>> getAllVocanoesByPage(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy)
    {
        List<Volcano> list = volcanoService.getAllVolcanoesByPage(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<Volcano>>(list, new HttpHeaders(), HttpStatus.OK);
    }



}
