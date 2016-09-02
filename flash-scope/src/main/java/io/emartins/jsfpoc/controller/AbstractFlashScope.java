package io.emartins.jsfpoc.controller;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

public abstract class AbstractFlashScope {

	public Flash getFlashScope() {
		return FacesContext.getCurrentInstance().getExternalContext().getFlash();
	}
	
	public Object getFromFlashScope(String key) {
		return getFlashScope().get(key);
	}
	
	public void putOnFlashScope(String key, Object value) {
		getFlashScope().put(key, value);
	}
	
	public FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	
}