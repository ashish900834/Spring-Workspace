package com.ashish.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class GetCollegeName {
	
	Map<Integer,String> clgMap=new HashMap<>();
	
	public List<String> getCollegeName(int roll) {

		clgMap.put(1,"IMIT");
		clgMap.put(2,"CMT");
		clgMap.put(3,"HMT");
		clgMap.put(4,"LMT");
		List<String> result=clgMap.entrySet().stream().filter(c -> c.getKey().equals(roll)).map(Map.Entry::getValue).collect(Collectors.toList());
	
		return result;
		
	}

}
