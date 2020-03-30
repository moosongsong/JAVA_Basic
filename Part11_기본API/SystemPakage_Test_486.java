package Part11Main;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class SystemPakage_Test_486 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(File.separator);
//		System.out.println(File.pathSeparator);
//		
//		System.out.println(System.getProperty("user.name"));
		
		
		//환경변수 읽기
		Map<String, String> env = System.getenv();
		//키도 문자열, 값도 문자열
		Set<String> keys = env.keySet();
		
		Iterator<String> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			String k=keyIt.next();
			System.out.println(k+"------------------");
			String value = env.get(k);
			System.out.println(value);
		}
		
	}

}
