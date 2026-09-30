package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonalInfo {
	
	@Value("${per.name}")
	private String name;
	
	@Value("${per.age}")
	private int age ;
	
	@Value("${per.loc}")
	private String address;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String version;
	
	
	@Override
	public String toString() {
		return "PersonalInfo=[name="+name+",age="+age+",address="+address+",osName="+osName+",version="+version+"]";
	}
	
    

}
