package com.monzoni.melodim_project.service;

import com.monzoni.melodim_project.dto.request.album.CreateAlbumRequest;
import com.monzoni.melodim_project.dto.response.album.AlbumResponse;

import java.util.List;

public interface AlbumService {
    List<AlbumResponse> getAllAlbumList();
    AlbumResponse saveNewAlbum(CreateAlbumRequest createAlbumRequest);
}