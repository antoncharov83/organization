package ru.antoncharov.organization.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedEntityGraph(name = "Organization.Offices",
        attributeNodes = @NamedAttributeNode("offices")
)
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullname;
    private String shortname;
    private String INN;
    private String OGRN;
    private String postalAddress;
    private String legalAddress;
    @OneToOne
    private Chief general;
    @OneToMany
    @JoinColumn(name = "organization_id")
    private List<BranchOffice> offices = new ArrayList<>();
}
