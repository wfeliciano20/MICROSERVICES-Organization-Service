package com.williamfeliciano.organizationservice.controller;

import com.williamfeliciano.organizationservice.dto.OrganizationDto;
import com.williamfeliciano.organizationservice.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Organization Service - OrganizationController",
        description = "Organization Controller Exposes REST APIs for Organization Service"
)
@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    @Operation(
            summary = "Save Organization REST API Endpoint",
            description = "Save Organization Object In Database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP status code 201 Created"
    )
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get a Organization by code REST API Endpoint",
            description = "Get a Organization Object from Database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status code 200 Success"
    )
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable("code") String organizationCode){
        OrganizationDto organizationDB = organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok(organizationDB);
    }

}
