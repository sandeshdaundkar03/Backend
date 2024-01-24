package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Link;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long>{

}
