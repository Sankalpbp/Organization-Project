package io.sankalp.organizationservice.controllers;

import io.sankalp.organizationservice.entities.Organization;
import io.sankalp.organizationservice.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizationController {

    @Autowired
    private OrganizationService service;

    @GetMapping ( "/" )
    public List<Organization> getOrganizations () {
        return service.getAllOrganizations ();
    }

    @PostMapping ( "/" )
    public Organization addOrganization ( @RequestBody  Organization organization ) {
        return service.addOrganization ( organization );
    }

    @GetMapping ( "/getOrganization/{id}" )
    public Organization getOrganizationById ( @PathVariable ( "id" ) Long id) {
        return service.getOrganizationById ( id );
    }

    @DeleteMapping ( "/deleteOrganization/{id}" )
    public String deleteOrganizationById ( @PathVariable ( "id" ) Long id ) {
        service.deleteOrganizationById ( id );
        return "Organization with id: " + id + " has been deleted.";
    }

    @PutMapping ( "/updateOrganization" )
    public Organization updateOrganization ( @RequestBody Organization organization ) {
        return service.updateOrganization ( organization );
    }

}
