package com.te.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.blog.entity.PostComment;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Integer>{

}
