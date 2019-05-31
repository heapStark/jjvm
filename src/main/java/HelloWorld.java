/**
 * 作者: yanlang.wzl 时间: 2019/5/31 工程: jjvm
 */
public class HelloWorld {
    static HelloWorld helloWorld = new HelloWorld();
    public static void main(String[] args) {
        //System.out.println(HelloWorld.class.getResource("/").toString());
        int a= 1;
        //int b = 2;
        //b+=a;
        System.out.println("hello world"+a);
    }
}
