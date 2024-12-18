package com.restApiSpringBoot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> getCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "Java point"),
                new Course(2, "Learn Spring Boot", "Goosing George"),
                new Course(3, "Learn Azure", "Goosing George")
        );
    }
}
