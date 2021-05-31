package com.hazir.Hazirlaniyor.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Contact {
    @SequenceGenerator(
            name = "contact_sequence",
            sequenceName = "contact_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contact_sequence"
    )
    private Long Id;
    private String firstName;
    private String lastName;
    private String postalCode;
    private String fullAdress;
    private String phoneNumber;
    private String userEmail;
    private String shipmentStatus;

}
