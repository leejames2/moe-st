package nttu.sqa.maven_demo;

import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
/*
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
*/    
    public String getDiff(String a, String b) throws Exception {
    	if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b))
    		throw new Exception("Empty or null string is not allowed!");
    	return StringUtils.difference(a, b);
    }
}
