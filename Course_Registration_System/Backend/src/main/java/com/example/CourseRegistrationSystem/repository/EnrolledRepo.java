package com.example.CourseRegistrationSystem.Repository;

import com.example.CourseRegistrationSystem.Model.Enrolled;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledRepo extends JpaRepository<Enrolled,Integer> {
}
