package in.org.cutm.quizbackend.Controller;

import in.org.cutm.quizbackend.Entity.AdminInfo;
import in.org.cutm.quizbackend.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cutm/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
   
}
