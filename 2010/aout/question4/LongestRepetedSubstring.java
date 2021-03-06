public class LongestRepetedSubstring {
	
	private static String longestCommonPrefixe(String s1, String s2){
		String s = "";
		int min = Math.min(s1.length(), s2.length());
		int i = 0;
		while(i != min && s1.charAt(i) == s2.charAt(i)){
			s += s1.charAt(i);
			i++;
		}		
		return s;
	}
	
	public static String longestRepetedSubstring(String s1){
		String s = "";
		String current = "";
		for(int i = 0; i < s1.length();i++){
			for(int j = i+1; j < s1.length(); j++){
				current = longestCommonPrefixe(s1.substring(i, s1.length()), s1.substring(j, s1.length()));
				if(current.length() > s.length())
					s= current;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String s1 = "aacaagtttacaagc";
		System.out.println(longestRepetedSubstring(s1)); //Affiche "acaag"	
	}

}
