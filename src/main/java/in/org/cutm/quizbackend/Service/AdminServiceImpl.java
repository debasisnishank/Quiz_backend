package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.AdminInfo;
import in.org.cutm.quizbackend.Repository.AdminRepository;
import in.org.cutm.quizbackend.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    private final AdminRepository adminRepository;
    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }
}
