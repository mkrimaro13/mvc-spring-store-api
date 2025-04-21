package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Entity Indica que esta clase es una entidad JPA, lo que significa que representa una tabla en la base de datos.
 */
@Entity
/**
 * @Table(name = "productos") Especifica el nombre de la tabla en la base de datos a la que se mapea esta entidad.
 * En este caso, la tabla se llama "productos".
 */
@Table(name = "productos")
/**
 * @Getter Anotación de Lombok que genera automáticamente los métodos getter para todos los campos de la clase.
 */
@Getter
/**
 * @Setter Anotación de Lombok que genera automáticamente los métodos setter para todos los campos de la clase.
 */
@Setter
public class Product {
 /**
  * @Id Indica que este campo es la clave primaria de la entidad.
  */
 @Id
 /**
  * @GeneratedValue(strategy = GenerationType.IDENTITY)
  * Especifica la estrategia de generación de la clave primaria.
  * GenerationType.IDENTITY indica que el valor es autogenerado por la base de datos (por ejemplo, mediante una columna AUTO_INCREMENT en MySQL o una secuencia IDENTITY en PostgreSQL).
  */
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 /**
  * @Column(name = "id") Especifica los detalles de la columna a la que se mapea este campo en la tabla "productos".
  * En este caso, el campo 'Id' se mapea a la columna llamada "id".
  */
 @Column(name = "id")
 private Integer Id;

 /**
  * @Column(name = "nombre") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'name' se mapea a la columna llamada "nombre".
  */
 @Column(name = "nombre")
 private String name;

 /**
  * @Column(name = "enlace_imagen") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'imageAddress' se mapea a la columna llamada "enlace_imagen".
  */
 @Column(name = "enlace_imagen")
 private String imageAddress;

 /**
  * @Column(name = "descripcion") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'description' se mapea a la columna llamada "descripcion".
  */
 @Column(name = "descripcion")
 private String description;

 /**
  * @Column(name = "precio") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'price' se mapea a la columna llamada "precio".
  */
 @Column(name = "precio")
 private Double price;

 /**
  * @Column(name = "descuento") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'discount' se mapea a la columna llamada "descuento".
  */
 @Column(name = "descuento")
 private Integer discount;

 /**
  * @Column(name = "id_categoria") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'categoryId' se mapea a la columna llamada "id_categoria".
  * Es probable que esta columna sea una clave foránea que referencia a otra tabla (por ejemplo, "categorias").
  */
 @ManyToOne
 @JoinColumn(name = "id_categoria", referencedColumnName = "id", insertable = false, updatable = false)
 private Category category;

 /**
  * @Column(name = "fecha_creacion") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'creationDate' se mapea a la columna llamada "fecha_creacion" y contendrá la fecha y hora de creación del registro.
  */
 @Column(name = "fecha_creacion")
 private LocalDateTime creationDate;

 /**
  * @Column(name = "fecha_actualizacion") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'updateDate' se mapea a la columna llamada "fecha_actualizacion" y contendrá la fecha y hora de la última actualización del registro.
  */
 @Column(name = "fecha_actualizacion")
 private LocalDateTime updateDate;

 /**
  * @Column(name = "activo") Especifica los detalles de la columna a la que se mapea este campo.
  * El campo 'active' se mapea a la columna llamada "activo" y probablemente indica si el producto está activo o no (valor booleano).
  */
 @Column(name = "activo")
 private Boolean active;

 /**
  * @OneToMany(mappedBy = "product") Indica una relación One-to-Many con la entidad ProductSize.
  * Esto permite acceder a la información de la tabla intermedia desde la entidad Producto.
  */
 @OneToMany(mappedBy = "product")
 private List<ProductSize> productSizes;
}