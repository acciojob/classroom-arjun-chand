package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class RepositoryLayer {
    HashMap<String, Student> studentDb = new HashMap<>();
    HashMap<String, Teacher> TeacherDb = new HashMap<>();
    HashMap<String, List<String>> studentTeacherDb = new HashMap<>();

    public void addStudentToDb(Student student){
        studentDb.put(student.getName(), student);
    }
    public void addTeacherToDb(Teacher teacher){
        TeacherDb.put(teacher.getName(), teacher);
    }
    public void addStudentTeacherDb(String student, String teacher){
        List<String> students = studentTeacherDb.get(teacher);
        if(students == null){
            students = new ArrayList<>();
        }
        students.add(teacher);
        studentTeacherDb.put(teacher,students);
    }
    public Student getStudentByName(String name){
        return studentDb.get(name);
    }
    public Teacher getTeacherByName(String name){
        return TeacherDb.get(name);
    }
    public List<String> getStudentsByTeacherName(String name){
        return studentTeacherDb.get(name);
    }

    public List<String> getAllStudents(){
        List<String> students = new ArrayList<>();
        for( String student : studentDb.keySet()){
            students.add(student);
        }
        return students;
    }

    public void deleteTeacherByName(String teacher){
        for(String str : studentTeacherDb.get(teacher)){

            studentDb.remove(str);

        }
        studentTeacherDb.remove(teacher);
        TeacherDb.remove(teacher);
    }

    public void deleteAllTeachers(){
        for (String teacher : TeacherDb.keySet() ) {
            for (String str : studentTeacherDb.keySet()) {
                studentDb.remove(str);
            }
            studentTeacherDb.remove(teacher);
            TeacherDb.remove(teacher);
        }
    }

}
