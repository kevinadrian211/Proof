package com.example.proof.entity

import jakarta.persistence.*
import java.math.BigDecimal


@Entity
@Table(name="client")
class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? =  null
    var name: String? = null
    var email: String? = null
    var password: Int? = null
    var rol: BigDecimal? = null
}