package com.javaspringjpa.huynhnguyenquocbao;

import com.javaspringjpa.huynhnguyenquocbao.entity.Student;
import com.javaspringjpa.huynhnguyenquocbao.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void saveStudent(){
        Student student = Student.builder()
                .firstName("Huynh")
                .lastName("Bao")
                .email("hnquocbao22@gmail.com")
                .build();

        studentRepository.save(student);
    }

    @Test
    void printAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        System.out.println("list-student" + studentList);
    }

    @Test
    void deleteStudentById(){
        studentRepository.deleteById(2L);
    }

    @Test
    void updateStudentById(){
        Student student=studentRepository.getById(1L);
        Student studentUp = studentRepository.save(
                new Student(
                        student.getId(),
                        "hnquocbao22@gmail.com",
                        student.getFirstName(),
                        student.getLastName()
                )
        );
    }
    @Test
    void getStudentByEmailNative(){
        Student student = studentRepository.getStudentByEmailNative("HuynhBao1@gmai.com");
        System.out.println("student get by email native" + student);
    }

    @Test
    void getStudentByEmailNativeNameParam(){
        Student student = studentRepository.getStudentByEmailNativeNameParam("baobuahh@gmail.com");
        System.out.println("student get by email native name param:" + student);
    }
}
