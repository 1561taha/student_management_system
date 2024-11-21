package com.students_management_system.Service;

import com.students_management_system.Model.Student;
import com.students_management_system.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> showall() {
        return studentRepo.findAll();
    }

    public Optional<Student> showstudent(long  rollNo) {
        return studentRepo.findById((rollNo));
    }

    public void savestudent(Student student) {
        studentRepo.save(student);

    }

    public void update(Student student) {
        studentRepo.save(student);
    }

    public void delete(long rollno) {
        studentRepo.deleteById(rollno);
    }

    public Optional<Student> searchbyname(String Name) {
        return studentRepo.findByName(Name);
    }
}
