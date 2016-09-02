package io.emartins.jsfpoc.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.emartins.jsfpoc.bean.Project;

@ManagedBean
@ViewScoped
public class ProjectController extends AbstractFlashScope {

	private Project project;
	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);

	public ProjectController() {

		LOGGER.info("Creating Controller");
		this.project = (Project) getFromFlashScope("project");

		if (project == null) {
			LOGGER.info("Creating Project");
			project = new Project();
		}
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String createProject() {
		putOnFlashScope("project", project);
		return "/projects?faces-redirect=true";
	}

}