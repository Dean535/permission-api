package com.cannon.entity


import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToMany

@Entity
data class Permission(

        var entity: String = "",

        var authKey: String = "",

        var httpMethod: String = "",

        var authUris: String = "",

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "permission")
        var rolePermission: MutableList<RolePermission> = mutableListOf()

) : BaseEntity()