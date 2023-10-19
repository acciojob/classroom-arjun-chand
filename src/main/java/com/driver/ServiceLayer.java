package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ServiceLayer {
   @Autowired
    StudentRepository repositoryLayerObj;
   public void addStudent(Student student){
       repositoryLayerObj.addStudent(student);
   }
   public void addTeacher(Teacher teacher){
       repositoryLayerObj.addTeacher(teacher);
   }
   public void studentTeacherPair(String student, String teacher){
       repositoryLayerObj.addStudentTeacherPair(student,teacher);
   }
   public Student getStudentByName(String name){
       return repositoryLayerObj.getStudentByName(name);
   }
    public Teacher getTeacherByName(String name){
        return repositoryLayerObj.getTeacherByName(name);
    }
    public List<String> getStudentsByTeacherName(String name){
       return repositoryLayerObj.getStudentsByTeacherName(name);
    }
    public List<String> getAllStudents(){
       return repositoryLayerObj.getAllStudents();
    }

    public void deleteTeacherByName(String teacher){
       repositoryLayerObj.removeTeacher(teacher);
    }
    public void deleteAllTeachers(){
       repositoryLayerObj.removeAllTeacher();
    }
}
