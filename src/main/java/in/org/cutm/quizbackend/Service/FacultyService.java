package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.Facultyinfo;

import java.util.List;

public interface FacultyService {

    Facultyinfo saveFaculty(Facultyinfo facultyinfo);

    void deleteFaculty(Integer id);

    List<Facultyinfo> getFaculties();

    Facultyinfo getFacultyById(Integer id);

    Facultyinfo updateFacultyInfo(Facultyinfo facultyinfo,Integer id);

}
