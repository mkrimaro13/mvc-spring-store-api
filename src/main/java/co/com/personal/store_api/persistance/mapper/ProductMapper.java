package co.com.personal.store_api.persistance.mapper;

import co.com.personal.store_api.domain.Product;
import co.com.personal.store_api.persistance.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CategoryMapper.class })
public interface ProductMapper {

        @Mappings({
                        @Mapping(source = "id", target = "id"),
                        @Mapping(source = "nombre", target = "name"),
                        @Mapping(source = "descripcion", target = "description"),
                        @Mapping(source = "enlaceImagen", target = "image"),
                        @Mapping(source = "precio", target = "price"),
                        @Mapping(source = "descuento", target = "discount"),
                        @Mapping(source = "categoria", target = "category"),
                        @Mapping(source = "activo", target = "active"),
        })
        Product toProduct(Producto producto);

        List<Product> toProducts(List<Producto> productos);

        @InheritInverseConfiguration
        @Mappings({
                        @Mapping(target = "fechaCreacion", ignore = true),
                        @Mapping(target = "fechaActualizacion", ignore = true),
                        @Mapping(target = "tallaProductos", ignore = true),
                        //Hace el match entre el campo idCategoria de Producto y el id de Categoria
                        // Este id de categerialo obtiene del dominio product -> categery -> id
                        @Mapping(target = "idCategoria", expression = "java(product.getCategory().getId())")
        })
        Producto toProducto(Product product);
}