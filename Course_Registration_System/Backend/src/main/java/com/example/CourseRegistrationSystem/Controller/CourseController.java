package com.example.CourseRegistrationSystem.Controller;

import com.example.CourseRegistrationSystem.Model.Course;
import com.example.CourseRegistrationSystem.Model.Enrolled;
import com.example.CourseRegistrationSystem.ServiceLayer.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CourseController {

    @Autowired
    CourseService crservice;

    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return crservice.getAllCourse();
    }

    @GetMapping("/courses/enrolled")
    public List<Enrolled> enrolledStudents(){
        return crservice.enrolledStudents();
    }

    @PostMapping("/courses/add")
    public String registerStudents(@RequestParam("course_name") String course_name,
                                   @RequestParam("name") String name,
                                   @RequestParam("email_id") String email_id){
        crservice.registerStudents(course_name,name,email_id);
        return "Registration is Successful";
    }
}
