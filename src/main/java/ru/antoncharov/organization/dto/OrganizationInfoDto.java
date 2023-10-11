package ru.antoncharov.organization.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
public class OrganizationInfoDto {
    private String fullname;
    private String shortname;
    private String INN;
    private String OGRN;
    private String postalAddress;
    private String legalAddress;
    private String chiefName;
    private String chiefSurname;
    private String chiefPatronymic;
    private LocalDate chiefBirthdate;
    private List<BranchOfficeDto> offices;
}
