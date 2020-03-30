package Part11Main;

import java.util.Map;
import java.util.StringTokenizer;

public class StringTokenizer_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Java World";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		//환경변수 출력해보기
		Map<String, String>env=System.getenv();
		String path = env.get("Path");
		
		StringTokenizer tt = new StringTokenizer(path, ";");
		while(tt.hasMoreElements()) {
			System.out.println(tt.nextElement());
		}
	}

}
