package com.example.CourseRegistrationSystem.ServiceLayer;

import com.example.CourseRegistrationSystem.Model.Course;
import com.example.CourseRegistrationSystem.Model.Enrolled;
import com.example.CourseRegistrationSystem.Repository.CourseRepo;
import com.example.CourseRegistrationSystem.Repository.EnrolledRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo crrepo;

    @Autowired
    EnrolledRepo enrrepo;

    public List<Course> getAllCourse() {
        return crrepo.findAll();
    }

    public List<Enrolled> enrolledStudents() {
        return enrrepo.findAll();
    }

    public void registerStudents(String course_name, String name, String email_id) {
        Enrolled enr = new Enrolled(0,course_name,name,email_id);
        enrrepo.save(enr);
    }
}
