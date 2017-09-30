package com.WilJones.Service;

import com.WilJones.Dao.FakeStudentDaoImpl;
import com.WilJones.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakedata")
    private FakeStudentDaoImpl fakeStudentDaoImpl;

    public Collection<Student> getAllStudents() {
        return fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id){
        return fakeStudentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id){
        fakeStudentDaoImpl.removeStudentById(id);
    }
}
