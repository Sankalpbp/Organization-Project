package io.sankalp.organizationservice.services;

import io.sankalp.organizationservice.entities.Organization;
import io.sankalp.organizationservice.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository repository;

    public List<Organization> getAllOrganizations ( ) {
        return repository.findAll ();
    }

    public Organization addOrganization ( Organization organization ) {
        return repository.save ( organization );
    }

    public Organization getOrganizationById ( Long id ) {
        return repository.findById ( id ).orElse ( null );
    }

    public void deleteOrganizationById ( Long id ) {
        repository.deleteById ( id );
    }

    public Organization updateOrganization ( Organization organization ) {
        final Organization foundOrganization = repository.findById ( organization.getId () )
                                                         .orElse ( null );

        if (Objects.nonNull( foundOrganization )) {
            foundOrganization.setName ( organization.getName () );
            foundOrganization.setOwnership( organization.getOwnership () );
            foundOrganization.setNumberOfEmployees ( organization.getNumberOfEmployees () );

            return repository.save ( foundOrganization );
        }

        return null;
    }

}
