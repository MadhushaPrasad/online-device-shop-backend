package com.sha.onlinedeviceshopbackend.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName",unique = true,nullable = false,length = 100)
    private String userName;

    @Column(name = "passowrd",nullable = false,length = 10)
    private String password;

    @Column(name = "name",nullable = false,length = 100)
    private String name;

    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;

    //role
    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private Role role;
}
