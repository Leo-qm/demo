package Array;

public class Calcu {
    public static void main(String[] args){
        int a =6;
        int b =3;
        //三元运算符
        /*
        - （关系表达式）？表达式1：表达式2；
        - 如果关系表达式成立（true），运算后的结果则为表达式1
        - 如果关系表达式不成立（false），运算后的结果则为表达式2
        要求：
        - 关系表达式结果为Boolean类型
        - 表达式1和表达式2的结果类型必须一致
        */
        System.out.println(a > b ? b : a);

        double in1 = false ? 3.2 : 3.1;
        System.out.println(in1);
    }
}

