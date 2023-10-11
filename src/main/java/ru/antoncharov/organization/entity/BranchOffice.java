package ru.antoncharov.organization.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BranchOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * name of branch office
     */
    private String name;
    /**
     * postal address
     */
    private String postalAddress;
    /**
     * director of branch office
     */
    @OneToOne
    private Chief director;
}
