package com.github.b1412.permission.controller

import com.github.b1412.permission.controller.base.BaseRoleController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.github.b1412.permission.service.RoleService

@RestController
@RequestMapping("/v1/role")
class RoleController : BaseRoleController()