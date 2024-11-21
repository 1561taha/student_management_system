package com.students_management_system.Controller;

import com.students_management_system.Model.Student;
import com.students_management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/students")
    public List<Student> allstudents(){
        return studentService.showall();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> viewstudent(@PathVariable("id") long roll_no)
    {
       return studentService.showstudent(roll_no);
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

    @GetMapping("/searchstudents/{Name}")
    public Optional<Student> search(@PathVariable("Name") String Name){
        return studentService.searchbyname(Name);
    }
}
