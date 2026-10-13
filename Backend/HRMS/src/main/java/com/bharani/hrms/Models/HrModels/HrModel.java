package com.bharani.hrms.Models.HrModels;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class HrModel {
    @Id
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String profilePhoto;
//    private
}
