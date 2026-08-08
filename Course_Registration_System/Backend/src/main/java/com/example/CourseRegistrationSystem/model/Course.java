package com.example.CourseRegistrationSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    private String courseId;
    private String courseName;
    public int durationInWeeks;
    private String trainer;
}
