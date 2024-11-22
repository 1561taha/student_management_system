package com.students_management_system.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.lang.reflect.Type;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long roll_no;

   private String name;

   private Long mobile_no;

   private String marks;

}
