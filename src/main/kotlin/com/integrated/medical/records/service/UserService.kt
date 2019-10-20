package com.integrated.medical.records.service

import com.integrated.medical.records.domain.dto.UserDTO
import org.springframework.stereotype.Service

@Service
interface UserService {
    fun getUser(idUser: Int): UserDTO
    fun insertUser(userDTO: UserDTO)
    fun update(userUpdated: UserDTO)
}