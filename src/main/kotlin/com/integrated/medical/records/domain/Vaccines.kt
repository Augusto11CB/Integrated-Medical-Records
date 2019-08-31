package com.integrated.medical.records.domain

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "VACCINES", schema = "MEDICAL_RECORDS")
data class Vaccines(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "idVACCINES", nullable = false, unique = true)
        val idVaccine: Int,

        @Column(name = "NAME")
        @NotBlank
        val name: String,

        @Column(name = "DESCRIPTION", length = 1000)
        val description: String,

        @Column(name = "N_DOSES", length = 2)
        val nDoses: Int
) {
    @OneToMany(mappedBy = "vaccines")
    lateinit var patientVaccines: List<PatientVaccines>
}