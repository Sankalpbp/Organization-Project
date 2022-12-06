package io.sankalp.organizationservice.repositories;

import io.sankalp.organizationservice.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
