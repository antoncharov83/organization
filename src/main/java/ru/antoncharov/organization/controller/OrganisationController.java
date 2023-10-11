package ru.antoncharov.organization.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.antoncharov.organization.dto.OrganizationInfoDto;
import ru.antoncharov.organization.services.OrganizationService;

import java.util.List;

@RequestMapping("/organizations")
@RestController
@RequiredArgsConstructor
public class OrganisationController {
    private final OrganizationService organizationService;

    /**
     * get organizations by part of fullname all get all if param not exists
     * @param partOfName part of fullname
     * @return organizationsInfo
     */
    @GetMapping
    public List<OrganizationInfoDto> getByPartOfName(@RequestParam(value = "partOfName", required = false) String partOfName){
        return partOfName == null ? organizationService.getAll() : organizationService.getByOrganizationName(partOfName);
    }

    /**
     * get organizations by id
     * @param id
     * @return organizationsInfo
     */
    @GetMapping("/{id}")
    public OrganizationInfoDto getById(@PathVariable Integer id){
        return organizationService.getById(id);
    }
}
