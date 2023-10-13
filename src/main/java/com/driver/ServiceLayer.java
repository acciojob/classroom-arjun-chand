package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class ServiceLayer {
   @Autowired
    RepositoryLayer repositoryLayerObj;
   public void addStudent(Student student){
       repositoryLayerObj.addStudentToDb(student);
   }
   public void addTeacher(Teacher teacher){
       repositoryLayerObj.addTeacherToDb(teacher);
   }
   public void studentTeacherPair(String student, String teacher){
       repositoryLayerObj.addStudentTeacherDb(student,teacher);
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
       repositoryLayerObj.deleteTeacherByName(teacher);
    }
    public void deleteAllTeachers(){
       repositoryLayerObj.deleteAllTeachers();
    }
}
