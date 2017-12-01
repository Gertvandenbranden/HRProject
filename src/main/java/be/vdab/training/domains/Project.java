package be.vdab.training.domains;

public class Project extends BaseDomain {

       String[] projects ={
        "Project 1,Project voor HR",
        "Project 2,Project voor CFO",
        "Project 3,Project voor HP",
        "Project 4,Project voor TELENET",
        "Project 5,Project voor BASE"};

    public Project(String[] projects) {
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }
}
