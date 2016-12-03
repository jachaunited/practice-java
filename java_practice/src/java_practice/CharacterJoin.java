package java_practice;

public class CharacterJoin {

 String join(String str1, String str2) {
  String str3="";
  for(int i = 0; i < str1.length(); i++) {
   str3 += str1.charAt(i);
   //System.out.println(str3);
   for(int j = i; j < str2.length();) {
    str3 += str2.charAt(j);
    //System.out.println(str3);
    break;
   }
  }
  return str3;
 }
 
 public static void main(String[] args) {
  String str1 = "Jnle";
  String str2 = "ael!";
  CharacterJoin newInstance = new CharacterJoin();
  String result = newInstance.join(str1, str2);
  System.out.println(result);
 }
}