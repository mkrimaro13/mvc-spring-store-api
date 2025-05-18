package co.com.personal.store_api.persistance.mapper;

import co.com.personal.store_api.domain.Category;
import co.com.personal.store_api.persistance.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

        @Mappings({
                        @Mapping(source = "id", target = "id"),
                        @Mapping(source = "nombre", target = "category"),
                        @Mapping(source = "activo", target = "active")
        })
        Category toCategory(Categoria categoria);

        @InheritInverseConfiguration
        @Mappings({
                        @Mapping(target = "productos", ignore = true),
                        @Mapping(target = "fechaCreacion", ignore = true),
                        @Mapping(target = "fechaActualizacion", ignore = true),
        })
        Categoria toCategoria(Category category);
}