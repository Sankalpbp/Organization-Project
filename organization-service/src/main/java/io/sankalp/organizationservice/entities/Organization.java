package io.sankalp.organizationservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table ( name = "organizations" )
public class Organization {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private Long id;

    private String name;

    private String ownership;

    private int numberOfEmployees;

}
