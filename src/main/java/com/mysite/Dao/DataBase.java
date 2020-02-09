package com.mysite.Dao;

import java.util.HashMap;
import java.util.Map;

import com.site.model.StudentModel;

public class DataBase {
	
	public static Map<Integer, StudentModel> profiles =new HashMap<>();
	
	public static Map<Integer,StudentModel> getProfiles() {
		return profiles;	
	}
	}
