package com.techolution.service;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.techolution.MapImpl;

@Component
public class TechoMapService {
	 private Map<String, MapImpl<Object, Object>> hashMaps = new MapImpl<String, MapImpl<Object, Object>>();
	 @PostConstruct
	 public void init() {
		 //default is for backup
		 hashMaps.put("techohashclinet", new MapImpl<Object,Object>());
	 }
	 public void create(String id) {
	        hashMaps.put(id, new MapImpl<Object, Object>());
	    }

	    public void delete(String id) {
	        hashMaps.remove(id);
	    }

	    public void put(String id, Object key, Object value) {
	        Map<Object, Object> mapInstance = hashMaps.get(id);
	        mapInstance.put(key, value);
	    }

	    public Object get(String id, Object key) {
	        Map<Object, Object> mapInstance = hashMaps.get(id);
	        return mapInstance.get(key);
	    }

	    public void delete(String id, Object key) {
	        Map<Object, Object> mapInstance = hashMaps.get(id);
	        mapInstance.remove(key);
	    }
	 
}
