
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("ollo"));
	}
	public static boolean isPalindrome(String s) {
		  return isPalindrome(s, 0, s.length() - 1);
		}
		public static boolean isPalindrome(String s, int low, int high) {
		  if (high <= low) // Base case
		    return true;
		  else if (s.charAt(low) != s.charAt(high)) // Base case
		    return false;
		  else
		    return isPalindrome(s, low + 1, high - 1);
		}


}
