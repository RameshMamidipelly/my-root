package com.mysite.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mysite.Dao.DataBase;
import com.site.model.StudentModel;

public class MyService {

	public Map<Integer,StudentModel> profiles=DataBase.getProfiles();
	

	public MyService() {
	profiles.put(1,new StudentModel(1,"rammi"));
	profiles.put(2,new StudentModel(2,"ramesh"));
	profiles.put(3,new StudentModel(3,"reshma"));
	}


	public List<StudentModel> getAllProfiles() {
		
		return new ArrayList<>(profiles.values());
	}
	
	public  StudentModel getProfile(int sid) {
		if(sid<=0) {
			System.out.println("getprofile "+sid);
			}
		return profiles.get(sid);
	}
	
	public StudentModel addProfile(StudentModel profile) {
		profile.setSid(profiles.size()+1);
		profiles.put(profile.getSid(), profile);
		return profile;
	}
	
	public StudentModel profileUpDate(StudentModel profile) {
		if(profile.getSid()<=0) {
			return null;
		}
		System.out.println("update "+profile);
		profiles.put(profile.getSid(),profile);
		return profile;
	}
	
	public StudentModel profileRemove(int sid) {
		return profiles.remove(sid);
	}
	

}
