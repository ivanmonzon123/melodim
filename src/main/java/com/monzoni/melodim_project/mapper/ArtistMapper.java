package com.monzoni.melodim_project.mapper;


import com.monzoni.melodim_project.dto.response.ArtistResponse;
import com.monzoni.melodim_project.dto.response.GetAllArtistListResponse;
import com.monzoni.melodim_project.repository.entity.ArtistEntity;
import com.monzoni.melodim_project.util.constant.ResponseConstant.SuccessResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, imports = {SuccessResponse.class})
public interface ArtistMapper {
    ArtistResponse mapperToArtistResponse(ArtistEntity source);

    default GetAllArtistListResponse mapperToGetAllArtistListResponse(List<ArtistResponse> artistResponseList) {
        return toGetAllArtistListResponse(SuccessResponse.CODE, SuccessResponse.MESSAGE, artistResponseList);
    }

    GetAllArtistListResponse toGetAllArtistListResponse(String code, String message, List<ArtistResponse> artistResponseList);
}
