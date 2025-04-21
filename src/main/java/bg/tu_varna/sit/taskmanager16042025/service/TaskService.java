package bg.tu_varna.sit.taskmanager16042025.service;

import bg.tu_varna.sit.taskmanager16042025.model.dto.request.TaskRequestDto;
import bg.tu_varna.sit.taskmanager16042025.model.dto.response.TaskResponseDto;

public interface TaskService {
    TaskResponseDto create(TaskRequestDto dto);
}
