public class k9 {
public static void main(String[] args) {
String word = "Object";
int length = word.length();
for(int i =1; i<= length; i++) {
System.out.println(word.substring(0,i));
}
for(int i =length - 1; i>=1; i--) {
System.out.println(word.substring(0,i));
}
}
}