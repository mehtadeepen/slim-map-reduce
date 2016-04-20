package com.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.main.Context;
import com.mr.Mapper;

public class Prediction {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Context context = new Context();
		context.setMapperClass(M.class);
		context.setReducerClass(R.class);
		
		Mapper mapper = getInstance(Context.mapper); 
		mapper.map("", "", context);
		
//		Class<?> mapper = Context.mapper;
//		Constructor<?> ctor = mapper.getConstructor();
//		Object myMapper = ctor.newInstance(new Object[] {ctor});
		
	}
	
	public static <T> T getInstance(Class<T> theClass)
		    throws IllegalAccessException, InstantiationException {

		    return theClass.newInstance();
		}
}
