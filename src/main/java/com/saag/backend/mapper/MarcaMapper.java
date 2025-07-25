package com.saag.backend.mapper;

import com.saag.backend.dto.marca.MarcaRequestDTO;
import com.saag.backend.dto.marca.MarcaResponseDTO;
import com.saag.backend.entity.Marca;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MarcaMapper {

    @Mapping(source = "nombre", target = "nombreMarca")
    Marca toEntity(MarcaRequestDTO marcaRequestDTO);

    @Mapping(source = "nombreMarca", target = "nombre")
    MarcaResponseDTO toDto(Marca marca);
}