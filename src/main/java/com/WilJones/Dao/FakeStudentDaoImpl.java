package com.WilJones.Dao;

import com.WilJones.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakedata")
public class FakeStudentDaoImpl implements StudentDao {
    private static Map<Integer, Student> Students;

    static {
        Students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Wil", "Java 101"));
                put(2, new Student(2, "John", "Java 101"));
                put(3, new Student(3, "Adam", "Java 101"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.Students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.Students.get(id);
    }

    @Override
    public void removeStudentById(int id){
        this.Students.remove(id);
    }
}

