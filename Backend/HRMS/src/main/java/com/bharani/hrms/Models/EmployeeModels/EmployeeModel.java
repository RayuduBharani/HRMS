package com.bharani.hrms.Models.EmployeeModels;
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
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {
    @Id
    @UuidGenerator
    @GeneratedValue
    private UUID id;

    //Personal
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String profilePhoto;
    private String phone;

    //Account
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeStatus status = EmployeeStatus.ACTIVE;

    //Job information
    @Column(nullable = false)
    private String employeeCode;
    private String department;
    private String designation;
    private String manager;
    private int team;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeType employeeType;

    //Address
    private String city;
    private String state;
    private String country;
    private String landmark;

    //EmergencyContact
    private String emergencyName;
    private String emergencyPhone;
    private String emergencyRelationShip;

    @CreationTimestamp
    @Column(nullable = false , updatable = false)
    private LocalDate createdAt;

}
