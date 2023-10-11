package ru.antoncharov.organization.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.antoncharov.organization.dto.OrganizationInfoDto;
import ru.antoncharov.organization.entity.Organization;

@Mapper(componentModel = "spring", uses = {BranchOfficeMapper.class})
public interface OrganizationMapper {

    @Mappings({
            @Mapping(target = "chiefName", source = "general.name"),
            @Mapping(target = "chiefSurname", source = "general.surname"),
            @Mapping(target = "chiefPatronymic", source = "general.patronymic"),
            @Mapping(target = "chiefBirthdate", source = "general.birthdate")
    })
    OrganizationInfoDto toDto(Organization organization);
}
