package com.developerxandra.todoapp.tasks;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateTaskDTO {
	@NotBlank
	private String task;
	
	@NotNull
	private Boolean isComplete;

	public String getTask() {
		return task;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	@Override
	public String toString() {
		return "CreateTaskDTO [task=" + task + ", isComplete=" + isComplete + "]";
	}
}
