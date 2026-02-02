package com.project.project.mapping;
import com.project.project.Entity.Project;
import com.project.project.dto.Projectdto;

public class ProjectMapping {
    public static Projectdto projecttodto(Project project){
        return new Projectdto(project.getProjectid(),project.getProjectName(),project.getDescription(),project.getStatus(),project.getClientName(),project.getStartdate(),project.getEnddate());
    }
    public static Project dtotoproject(Projectdto projectdto){
        return new Project(projectdto.getProjectid(),projectdto.getProjectName(),projectdto.getDescription(),projectdto.getStatus(),projectdto.getClientName(),projectdto.getStartdate(),projectdto.getEnddate());
    }
}
