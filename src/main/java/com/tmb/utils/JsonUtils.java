package com.tmb.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmb.constants.FrameworkConstants;
import com.tmb.enums.ConfigProperties;



public class JsonUtils {
private static Map<String, String> CONFIGMAP;
	
	private JsonUtils()
	{
		
	}
	
	static
	{
		
			try {
				CONFIGMAP = new ObjectMapper()
						.readValue(new File(FrameworkConstants.getJsonconfigfilepath()), 
						new TypeReference<Map<String, String>>(){});
			} catch (StreamReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatabindException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static String get(ConfigProperties key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))

		{
			throw new Exception("Property name" + key + " is not found. Please check config properties");

		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}
}
