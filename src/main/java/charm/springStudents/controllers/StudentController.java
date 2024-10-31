package charm.springStudents.controllers;

import charm.springStudents.models.Student;
import charm.springStudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {


    private final StudentService service;

    @GetMapping("")
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        return  "Student successfully saved";
    }

    @GetMapping("/{email}")
    public Student findByEmail(String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
         service.deleteStudent(email);
    }
}
