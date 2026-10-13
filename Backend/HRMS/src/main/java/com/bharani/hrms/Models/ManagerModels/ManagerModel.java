package com.bharani.hrms.Models.ManagerModels;
import com.bharani.hrms.Enums.EmployeeEnums.EmployeeStatus;
import com.bharani.hrms.Enums.EmployeeEnums.EmployeeType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ManagerModel {
    @Id
    @UuidGenerator
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;
    private String password;
    private String phone;
    private String profile_photo;
    private String employeeCode;
    private String department;
    private String designation;
    private List<String> team = new ArrayList<>();
    private LocalDate joiningDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeType employeeType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeStatus status = EmployeeStatus.ACTIVE;

    @CreationTimestamp
    @Column(nullable = false , updatable = false)
    private LocalDate createdAt;
}