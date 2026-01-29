package com.project.project.serviceimpl;

import java.util.List;

import com.project.project.Entity.Project;
import com.project.project.repository.ProjectRepo;
import com.project.project.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepository;

    public ProjectServiceImpl(ProjectRepo projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Integer projectId, Project project) {
        Project existingProject = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + projectId));

        existingProject.setProjectName(project.getProjectName());
        existingProject.setDescription(project.getDescription());
        existingProject.setStatus(project.getStatus());
        existingProject.setClientName(project.getClientName());
        existingProject.setStartdate(project.getStartdate());
        existingProject.setEnddate(project.getEnddate());

        return projectRepository.save(existingProject);
    }


    public Project getProjectById(Integer projectId) {
        return projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + projectId));
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public void deleteProject(Integer projectId) {
        Project project = getProjectById(projectId);
        projectRepository.delete(project);
    }
}
