package com.williamfeliciano.organizationservice.service.impl;

import com.williamfeliciano.organizationservice.dto.OrganizationDto;
import com.williamfeliciano.organizationservice.entity.Organization;
import com.williamfeliciano.organizationservice.repository.OrganizationRepository;
import com.williamfeliciano.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    private ModelMapper modelMapper;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert to entity
        Organization organization = modelMapper.map(organizationDto,Organization.class);

        // Save the organization
        Organization savedOrganization = organizationRepository.save(organization);

        // convert to dto and return
        return modelMapper.map(savedOrganization,OrganizationDto.class);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return modelMapper.map(organization,OrganizationDto.class);
    }
}
