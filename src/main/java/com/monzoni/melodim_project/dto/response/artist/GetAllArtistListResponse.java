package com.monzoni.melodim_project.dto.response.artist;

import com.monzoni.melodim_project.dto.response.CommonResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetAllArtistListResponse extends CommonResponse {
    List<ArtistResponse> artistResponseList;
}
