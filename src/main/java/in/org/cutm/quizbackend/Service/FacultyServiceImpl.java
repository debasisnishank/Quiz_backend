package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.Facultyinfo;
import in.org.cutm.quizbackend.Repository.FacultyRepository;
import in.org.cutm.quizbackend.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {
private FacultyRepository facultyRepository;
@Autowired
public FacultyServiceImpl(FacultyRepository facultyRepository){
    this.facultyRepository = facultyRepository;
}

    @Override
    public Facultyinfo saveFaculty(Facultyinfo facultyinfo) {
        return facultyRepository.save(facultyinfo);
    }

    @Override
    public void deleteFaculty(Integer id) {
        Optional<Facultyinfo> facultyinfo = facultyRepository.findById(id);
        if(facultyinfo.isPresent()){
            facultyRepository.deleteById(id);
        }else{
            throw new ResourceNotFoundException("Faculty","id",id);
        }
    }

    @Override
    public List<Facultyinfo> getFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public Facultyinfo getFacultyById(Integer id) {
        Optional<Facultyinfo> facultyinfo = facultyRepository.findById(id);
        if (facultyinfo.isPresent()) {
            return facultyinfo.get();
        } else {
            throw new ResourceNotFoundException("Faculty", "id", id);
        }
    }

    @Override
    public Facultyinfo updateFacultyInfo(Facultyinfo prevFacultyinfo, Integer id) {

    Facultyinfo facultyinfo = facultyRepository.findById(id).orElseThrow(()->
            new ResourceNotFoundException("Faculty","id",id)
            );
    facultyinfo.setFacultyName(prevFacultyinfo.getFacultyName());
    facultyinfo.setFacultyEmail(prevFacultyinfo.getFacultyEmail());
    facultyinfo.setFacultyPassword(prevFacultyinfo.getFacultyPassword());
    facultyRepository.save(facultyinfo);


    return facultyinfo;
    }
}
