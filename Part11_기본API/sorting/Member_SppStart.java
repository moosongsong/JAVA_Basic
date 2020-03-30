package Part11Main.sorting;

import java.util.Arrays;

public class Member_SppStart {

	public static void main(String[] args) {
		Member []mems= {new Member("bebe"), new Member("meme"), new Member("bibi")};
		
		Arrays.sort(mems);
		
		for (int i = 0; i < mems.length; i++) {
			System.out.println(mems[i].getName());
		}
	}

}
