public class K10 {
public static void main(String[] args){
String str ="OBJECT";
int len = str.length();
for(int i=1;i<=len;i++){
for(int j=len;j>i;j--){
System.out.print(" ");
}
System.out.println(str.substring(0,i));
}
for (int i=len-1;i >=1;i--){
for(int j=len;j>i;j--){
System.out.print(" ");
}
System.out.println(str.substring(0,i));
}
}
}