package com.project.project.service;

import java.util.List;
import com.project.project.Entity.Project;
import com.project.project.dto.Projectdto;
import org.springframework.stereotype.Service;


public interface ProjectService {

    Project createProject(Project project);

    Project updateProject(Integer projectId, Project project);

    Project getProjectById(Integer projectId);

    List<Project> getAllProjects();

    void deleteProject(Integer projectId);

    List<Projectdto> getProjectsByClientName(String clientName);
    List<Projectdto> getProjectsByProjectName(String ProjectName);
    List<Projectdto> getProjectByClientNameAndDescription(String clientName,String description);
    boolean getifprojectexists(String projectname);
}
