package io.emartins.jsfpoc.bean;

import java.io.Serializable;

public class Project implements Serializable {

	private static final long serialVersionUID = 5634907649946987990L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
