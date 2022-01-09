package com.example.RequirementsProject.services;

import com.example.RequirementsProject.domain.Internship;
import com.example.RequirementsProject.dto.InternshipDto;
import com.example.RequirementsProject.mapper.InternshipMapper;
import com.example.RequirementsProject.repositories.InternshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipService {

    private final InternshipRepository internshipRepository;
    private final InternshipMapper internshipMapper;

    public InternshipService(InternshipRepository internshipRepository,
                             InternshipMapper internshipMapper) {
        this.internshipRepository = internshipRepository;
        this.internshipMapper = internshipMapper;
    }

    public InternshipDto addInternship(InternshipDto internshipDto) {
        Internship internship = internshipMapper.internshipDTOToInternship(internshipDto);
        return internshipMapper.internshipToInternshipDTO(internshipRepository.save(internship));
    }

    public InternshipDto updateInternship(InternshipDto internshipDto) {
        Internship internship = internshipMapper.internshipDTOToInternship(internshipDto);
        Optional<Internship> internshipData = internshipRepository.findById(internship.getId());
        if (internshipData.isPresent()) {
            Internship _internship = internshipData.get();
            _internship.setType(internship.getType());
            _internship.setTitle(internship.getTitle());
            _internship.setSalary(internship.getSalary());
            _internship.setLocation(internship.getLocation());
            _internship.setDuration(internship.getDuration());
            _internship.setDomain(internship.getDomain());
            _internship.setDescription(internship.getDescription());
            _internship.setAllStudents(internship.getAllStudents());
            return internshipMapper.internshipToInternshipDTO(internshipRepository.save(_internship));
        }

        return new InternshipDto();
    }

    public List<InternshipDto> findAll() {
        return internshipMapper.internshipsToInternshipsDTOs(internshipRepository.findAll());
    }

    public void deleteInternship(InternshipDto internshipDto) {
        Internship internship = internshipMapper.internshipDTOToInternship(internshipDto);
        internshipRepository.delete(internship);
    }

    public List<InternshipDto> findByTitle(String title) {
        return internshipMapper.internshipsToInternshipsDTOs(internshipRepository.findByTitle(title));
    }

    public List<InternshipDto> findByDomain(String domain) {
        return internshipMapper.internshipsToInternshipsDTOs(internshipRepository.findByDomain(domain));
    }
}
