package com.williamfeliciano.organizationservice.repository;

import com.williamfeliciano.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}