package in.org.cutm.quizbackend.Controller;

import in.org.cutm.quizbackend.Entity.Facultyinfo;
import in.org.cutm.quizbackend.Service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cutm/faculty")
public class FacultyController {
    private FacultyService facultyService;
    @Autowired
    public FacultyController(FacultyService facultyService1){
        facultyService = facultyService1;
    }

    @GetMapping
    public List<Facultyinfo> getAllFaculty(){
        return facultyService.getFaculties();
    }

    @GetMapping("{id}")
    public Facultyinfo getFacultyById(@PathVariable("id") Integer id){
        return facultyService.getFacultyById(id);
    }
    @PostMapping
    public ResponseEntity<Facultyinfo> saveFaculty(@RequestBody Facultyinfo facultyinfo){
        return new ResponseEntity<Facultyinfo>(facultyService.saveFaculty(facultyinfo), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteFaculty(@PathVariable Integer id){
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok("Faculty with id " + id + "deleted ");
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateFaculty(@RequestBody Facultyinfo facultyinfo,@PathVariable("id") Integer id){
        facultyService.updateFacultyInfo(facultyinfo,id);
        return new ResponseEntity<String>("Faculty Information updated",HttpStatus.NOT_FOUND);
    }


}
