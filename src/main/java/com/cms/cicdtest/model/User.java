package com.cms.cicdtest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data@Entity
public class User {
    @Id
    private int uid;
    private String name;
    private String email;
    private long phone;
}
