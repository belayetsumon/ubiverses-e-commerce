/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.app.product.ripository;

import com.ecommerce.app.module.user.model.Users;
import com.ecommerce.app.product.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Page<Comment> findByUserId(Users userid, Pageable pageable);

}
