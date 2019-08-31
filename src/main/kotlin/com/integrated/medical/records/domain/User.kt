package com.integrated.medical.records.domain

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "USERS", schema = "MEDICAL_RECORDS")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "idUSERS", nullable = false, unique = true)
        val idUser: Int,

        @Column(name = "NAME_LOGIN", length = 60)
        @NotBlank
        val nameLogin: String,

        @Column(name = "EMAIL", length = 60)
        @NotBlank
        val email: String,

        @Column(name = "PASSWORD", length = 60)
        @NotBlank
        val password: String,

        @Column(name = "CELL_PHONE", length = 14)
        val cellPhone:String
) {
        @OneToOne
        @JoinColumn(name = "PATIENTS_idPATIENTS")
        lateinit var patient: Patient
}