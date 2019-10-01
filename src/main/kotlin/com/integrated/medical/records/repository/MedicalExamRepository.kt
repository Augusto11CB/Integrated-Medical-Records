package com.integrated.medical.records.repository

import com.integrated.medical.records.domain.MedicalExam
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@RepositoryRestResource
interface MedicalExamRepository : CrudRepository<MedicalExam, Int> {

}