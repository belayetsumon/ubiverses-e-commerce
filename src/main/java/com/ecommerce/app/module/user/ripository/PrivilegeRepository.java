/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.app.module.user.ripository;


import com.ecommerce.app.module.user.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Md Belayet Hossin
 */
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

}
