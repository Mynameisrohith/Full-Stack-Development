package com.project.project.repository;

import com.project.project.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project, Integer> {
public List<Project> findByClientName(String clientName);
public List<Project> findByProjectName(String ProjectName);
public List<Project> findByClientNameAndDescription(String clientName,String description);
public boolean existsByProjectName(String projectname);
}
