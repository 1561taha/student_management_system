package com.students_management_system.Controller;

import com.students_management_system.Model.Student;
import com.students_management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/")
    public List<Student> allstudents(){
        return studentService.showall();
    }

    @GetMapping("/{id}")
    public Optional<Student> viewstudent(@PathVariable("id") long roll_no)
    {
       return studentService.showstudent(roll_no);
    }



    @GetMapping("/search/{Name}")
    public Optional<Student> search(@PathVariable("Name") String Name){
        return studentService.searchbyname(Name);
    }
}
