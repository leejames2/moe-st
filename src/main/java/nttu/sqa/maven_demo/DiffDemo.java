package nttu.sqa.maven_demo;

import org.apache.commons.lang3.StringUtils;

public class DiffDemo {
    
    public String getDiff(String a, String b) throws Exception {
    	if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b))
    		throw new Exception("Empty or null string is not allowed!");
    	return StringUtils.difference(a, b);
    }

}
