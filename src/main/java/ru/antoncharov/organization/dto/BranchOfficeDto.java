package ru.antoncharov.organization.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BranchOfficeDto {
    private String name;
    private String postalAddress;
    private String chiefName;
    private String chiefSurname;
    private String chiefPatronymic;
    private LocalDate chiefBirthdate;
}
