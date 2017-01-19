package io.jfsaaved.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import io.jfsaaved.topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
	

}
