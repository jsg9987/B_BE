package org.example.repository;

import org.example.entity.PostImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImageRepository extends JpaRepository<PostImage, Long> {

}