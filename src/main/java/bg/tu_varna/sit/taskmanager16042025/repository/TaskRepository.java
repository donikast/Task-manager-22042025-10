package bg.tu_varna.sit.taskmanager16042025.repository;

import bg.tu_varna.sit.taskmanager16042025.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
