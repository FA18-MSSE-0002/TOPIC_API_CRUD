package com.appliedprogramming.springboot.topics;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics/{id}")
	public Topic getTopics(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
	public void updateTopics(@PathVariable String id, @RequestBody Topic topi)
	{
		topicService.updateTopic(id, topi);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/topics")
	public void addTopics(@RequestBody Topic topi)
	{
		topicService.addTopic(topi);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
		/*return Arrays.asList(
				new Topic("Spring" , "Spring Framework" , "Spring Framework"),
				new Topic("Java" , "Java Course" , "Java Course Description"),
				new Topic("Node" , "Node JS" , "Node JS Description")
				);*/
	}
}
