package week06;

/* 访问String里面的字符，charAt(index)函数
   - 返回在index上的单个字符
   - index的范围是0到length()-1
   - 第一个字符的index是0，和数组一样
   但是不能用for-each循环来遍历字符串
 */
public class P6 {
    public static void main(String [] args){
        String s = "abc";
        for ( int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}