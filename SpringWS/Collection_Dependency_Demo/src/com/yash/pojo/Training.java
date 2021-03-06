package com.yash.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Training {
	private List<String> courses;
	private Set<String> trainees;
	private Map<String, String> mentorMentee;
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Set<String> getTrainees() {
		return trainees;
	}
	public void setTrainees(Set<String> trainees) {
		this.trainees = trainees;
	}
	public Map<String, String> getMentorMentee() {
		return mentorMentee;
	}
	public void setMentorMentee(Map<String, String> mentorMentee) {
		this.mentorMentee = mentorMentee;
	}
	
	
	public void showDetail(){
		
		System.out.println("---------Course Detail-----------");
		for (String course : courses) {
			System.out.println(course);
		}
		
		System.out.println("----------Trainee Detail---------");
		for (String trainee : trainees) {
			System.out.println(trainee);
		}
		
		System.out.println("---------Mentor and Mentee Detail------------");
		Set<String> mentors=mentorMentee.keySet();
		for (String mentor : mentors) {
			System.out.println(mentor+" --> "+mentorMentee.get(mentor));			
		}	
		
		System.out.println("-----------------Collection Types are ------------------");
		System.out.println("courses : "+courses.getClass());
		System.out.println("trainees : "+trainees.getClass());
		System.out.println("mentorMentee : "+mentorMentee.getClass());
	}
}
