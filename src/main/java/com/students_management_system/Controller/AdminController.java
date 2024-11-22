package com.students_management_system.Controller;


import com.students_management_system.Model.Student;
import com.students_management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {

    @Autowired
    StudentService studentService;
    @GetMapping("/")
    public List<Student> allstudents(){
        return studentService.showall();
    }
    @PostMapping("/students")
    public void  addstudent(@RequestBody Student student)
    {
        studentService.savestudent(student);
    }
    @PutMapping("/students")
    public void updatestudent(@RequestBody Student student)
    {
        studentService.update(student);
    }

    @DeleteMapping("/students/{id}")
    public void deletestudent(@PathVariable("id") long rollno)
    {
        studentService.delete(rollno);

    }


}
