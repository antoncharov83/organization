package ru.antoncharov.organization.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.antoncharov.organization.entity.Organization;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

    @EntityGraph(value = "Organization.Offices")
    List<Organization> findByFullnameContaining(String partOfName);
}
