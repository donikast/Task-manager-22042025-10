package bg.tu_varna.sit.taskmanager16042025.service.impl;

import bg.tu_varna.sit.taskmanager16042025.model.dto.request.TaskRequestDto;
import bg.tu_varna.sit.taskmanager16042025.model.dto.response.TaskResponseDto;
import bg.tu_varna.sit.taskmanager16042025.model.entity.Task;
import bg.tu_varna.sit.taskmanager16042025.repository.TaskRepository;
import bg.tu_varna.sit.taskmanager16042025.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;
    private ModelMapper mapper;

    public TaskServiceImpl(TaskRepository taskRepository, ModelMapper mapper) {
        this.taskRepository = taskRepository;
        this.mapper = mapper;
    }

    public TaskResponseDto create(TaskRequestDto dto) {
        Task task = mapper.map(dto, Task.class);
        Task addedTask = taskRepository.save(task);
        return mapper.map(addedTask, TaskResponseDto.class);
    }

}
