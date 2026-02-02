package com.project.project.controller;

import com.project.project.Entity.Project;
import com.project.project.dto.Projectdto;
import com.project.project.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/projects")

public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // 🔹 Create Project
    @PostMapping
    public ResponseEntity<?> createProject(@RequestBody Project project) {
        Project savedProject = projectService.createProject(project);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Project created successfully");
    }

    // 🔹 Get Project by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getProjectById(@PathVariable Integer id) {
        Project project = projectService.getProjectById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(project);
    }

    // 🔹 Get All Projects
    @GetMapping
    public ResponseEntity<?> getAllProjects() {
        List<Project> projects = projectService.getAllProjects();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(projects);
    }

    // 🔹 Update Project
    @PutMapping("/{id}")
    public ResponseEntity<?> updateProject(
            @PathVariable Integer id,
            @RequestBody Project project) {

        projectService.updateProject(id, project);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Project updated successfully");
    }

    // 🔹 Delete Project
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable Integer id) {
        projectService.deleteProject(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Project deleted successfully");
    }


    @GetMapping("/getprojectsbyclientname/{name}")
    public ResponseEntity<List<Projectdto>> getProjectsByClientName(@PathVariable("name") String clientname){
        return new ResponseEntity<>(projectService.getProjectsByClientName(clientname),HttpStatus.OK);
    }

    @GetMapping("/getprojectsbyprojectname/{projectname}")
    public ResponseEntity<List<Projectdto>> getProjectsByProjectName(@PathVariable("projectname") String pname){
        return new ResponseEntity<>(projectService.getProjectsByProjectName(pname),HttpStatus.OK);
    }

    @GetMapping("/getprojectsbyclientnameanddesc/{clientname}/{description}")
    public ResponseEntity<List<Projectdto>> getProjectsByProjectName(@PathVariable("clientname") String clientname,@PathVariable String description){
        return new ResponseEntity<>(projectService.getProjectByClientNameAndDescription(clientname,description),HttpStatus.OK);
    }
    @GetMapping("/checkifprojectexists/{projectname}")
    public ResponseEntity<Boolean> getProjectsByProject(@PathVariable("projectname") String name){
        return new ResponseEntity<>(projectService.getifprojectexists(name),HttpStatus.OK);
    }
}
