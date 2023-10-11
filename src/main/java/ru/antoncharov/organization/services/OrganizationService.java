package ru.antoncharov.organization.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.antoncharov.organization.dto.OrganizationInfoDto;
import ru.antoncharov.organization.mapper.OrganizationMapper;
import ru.antoncharov.organization.repository.OrganizationRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    final private OrganizationRepository organizationRepository;
    final private OrganizationMapper mapper;

    /**
     * get all organization
     * @return list of organization ifno
     */
    public List<OrganizationInfoDto> getAll(){
        List<OrganizationInfoDto> organizations = organizationRepository.findAll()
                .stream().map(organization -> mapper.toDto(organization))
                .collect(Collectors.toList());

        return organizations;
    }

    /**
     * find organisation by part of fullname
     * @param partOfName part of fullname
     * @return list of organization ifno
     */
    public List<OrganizationInfoDto> getByOrganizationName(String partOfName){
        List<OrganizationInfoDto> organizations = organizationRepository.findByFullnameContaining(partOfName)
                .stream().map(organization -> mapper.toDto(organization))
                .collect(Collectors.toList());

        return organizations;
    }

    /**
     * find organization by id
     * @param id
     * @return organization ifno
     */
    public OrganizationInfoDto getById(Integer id) {
        return mapper.toDto(organizationRepository.findById(id).orElseThrow(() -> new RuntimeException("Does not exists")));
    }
}
