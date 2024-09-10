package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClassroomRepository extends JpaRepository <ClassroomEntity, UUID> {

}
