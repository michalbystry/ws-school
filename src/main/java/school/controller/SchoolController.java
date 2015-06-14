package school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.model.Student;
import school.repository.StudentService;
import school.service.SchoolManagementService;

import javax.validation.Valid;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by michal on 03.06.15.
 */
@RestController
public class SchoolController {

    @Autowired
    SchoolManagementService schoolManager;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity addStudent(@RequestBody @Valid SchoolDto schoolDto) {
        boolean status = schoolManager.addNewStudent(schoolDto);
        return ResponseEntity.ok("Operation status: " + status); // jak to dziala?
    }
    @RequestMapping(value="/students/{name}/{surname}", method=RequestMethod.DELETE)
    public void removeStudent(@PathVariable ("name") String name, @PathVariable("surname") String surname){
        schoolManager.deleteStudent(name, surname);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public SortedSet<Student> showAllStudents() {
        return schoolManager.showAllStudents();
    }

    @RequestMapping(value = "/students/{name}/{surname}", method = RequestMethod.GET, produces = "application/json")
    public Student findStudent(@PathVariable("name") String name, @PathVariable("surname") String surname) {
        return schoolManager.findStudent(name,surname);
    }



}


