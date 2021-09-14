package com.javaspringjpa.huynhnguyenquocbao.repository;

import com.javaspringjpa.huynhnguyenquocbao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select *from student s where s.email = ?1", nativeQuery = true)
    public  Student getStudentByEmailNative(String email);

    @Query(value = "select *from student s where s.email=:email", nativeQuery = true)
    public  Student getStudentByEmailNativeNameParam(@Param("email")String email);
}