package ru.antoncharov.organization.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.antoncharov.organization.dto.BranchOfficeDto;
import ru.antoncharov.organization.entity.BranchOffice;

@Mapper(componentModel = "spring")
public interface BranchOfficeMapper {

    @Mappings({
            @Mapping(target = "chiefName", source = "director.name"),
            @Mapping(target = "chiefSurname", source = "director.surname"),
            @Mapping(target = "chiefPatronymic", source = "director.patronymic"),
            @Mapping(target = "chiefBirthdate", source = "director.birthdate")
    })
    BranchOfficeDto toDto(BranchOffice branchOffice);
}
