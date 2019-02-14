package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.example.demo.controller.EasyController;
import com.example.demo.controller.NewController;

//@ApplicationPath("/services")
public class MyApplication extends Application {

	/* private final Set<Object> singletons = new HashSet<Object>();

	    public MyApplication() {
	            this.init();
	    }

	    protected void init() {
	                this.singletons.add(EasyController.class);
	    }

	    @Override
	    public Set<Object> getSingletons() {
	            return singletons;
	    }*/
	
	 @Override
	    public Set<Class<?>> getClasses() {
	        Set<Class<?>> classes = new HashSet<>();
	        classes.add(EasyController.class);
	        classes.add(NewController.class);

	        return classes;
	    }
}
