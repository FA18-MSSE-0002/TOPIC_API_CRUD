package com.appliedprogramming.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
				new Topic("Spring" , "Spring Framework" , "Spring Framework"),
				new Topic("Java" , "Java Course" , "Java Course Description"),
				new Topic("Node" , "Node JS" , "Node JS Description")
				));
	
	
	public void addTopic(Topic topi)
	{
		topics.add(topi);
	}
	
	public void updateTopic(String id, Topic topi)
	{
		for(int i=0; i< topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topi);
				return;
			}
		}
	}
	
	public void deleteTopic(String id)
	{
		for(int i=0; i< topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.remove(i);
				return;
			}
		}
	}
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		Topic topic = null;
		
		for(Topic t : topics)
		{
			if(t.getId().equals(id))
			{
				topic = t;
				break;
			}
		}
		
		return topic;
	}
	
}
