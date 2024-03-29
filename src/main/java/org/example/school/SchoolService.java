package org.example.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {
    // temp
    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        List<School> schools = new ArrayList<>();
        schoolRepository.findAll()
                .forEach(schools::add);
        return schools;
    }

    public void addSchool(School school) {
        schoolRepository.save(school);
    }

    public void deleteSchoolById(long id) {
        schoolRepository.deleteById(id);
    }

}
