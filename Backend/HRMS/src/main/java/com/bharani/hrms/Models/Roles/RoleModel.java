package com.bharani.hrms.Models.Roles;
import com.bharani.hrms.Enums.RolesEnums.RolesType;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "roles")
public class RoleModel {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RolesType name;
    private String description;
}
