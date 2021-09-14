package com.javaspringjpa.huynhnguyenquocbao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "email")
    private  String email;
    @Column(name = "firstName")
    private  String firstName;
    @Column(name = "lastName")
    private  String lastName;


}
