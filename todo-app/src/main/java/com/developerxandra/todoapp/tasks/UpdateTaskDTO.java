package com.developerxandra.todoapp.tasks;

import jakarta.validation.constraints.Pattern;

public class UpdateTaskDTO {
	@Pattern(regexp = "^(?=\\S).*$", message = "Task cannot be empty")
	private String task;

	private Boolean isComplete;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
}
