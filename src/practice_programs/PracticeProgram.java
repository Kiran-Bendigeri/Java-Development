package practice_programs;

public class PracticeProgram {

	public static void main(String args[]) {

		String lang[] = { "Java", "Python", "PHP", "Kotlin", "Ruby" };

		int num[] = { 102, 230, 855, 665, 114222 };

		for (int i = 0; i < lang.length; i++) {
			
			System.out.print(lang[i]);

			for (int j = lang[i].length(); j < 15 ; j++) {
				
				System.out.print(' ');
			}
			System.out.print(num[i]);
			System.out.println();
		}

	}

}
