package co.com.personal.store_api.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombres")
    private String names;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "genero")
    private String gender;
    @Column(name = "correo")
    private String email;
    @Column(name = "telefono")
    private String phone;
    @Column(name = "fecha_creacion")
    private LocalDateTime creationDate;
    @Column(name = "fecha_actualizacion")
    private LocalDateTime updateDate;
    @Column(name = "activo")
    private boolean active;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;
}