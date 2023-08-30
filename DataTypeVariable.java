public class DataTypeVariable{
    public static void main(String[] args){
        //在终端机印出各种资料形态的资料
        //整数,预设是 int 形态
        System.out.println(3);
        System.out.println(120);
        
        // 散列値,预讯后面加上 #
        int x;
        x=3;
        int s;
        s=3;    
        System.out.println(x);
        x = 120;
        System.out.println(x);    
        // 长整数,数字的后面特别加上 L
        long y=2000000000000L;
        System.out.println(y);
        // System.out.println(2000000000000L);
        
        // 浮点数,预设为 double 形态
        double m = 3.14159268;
        System.out.println(m);
        // 单精度浮点数,数字的后面特别加上 F
        float n=3.14159268F;
        System.out.println(n);
        // System.out.println(3.14159268F);

        // 布林值
        boolean b;
        b=true;
        System.out.println(b);
        // System.out.println(false);    
        
        //字元
        char c='他';
        System.out.println(c);
        // System.out.println('a');
        
        // 字串:可以包含 0 到多个字元
        
        //System.out.println("哈喽你好");
       
        String w="哈喽你好";
        System.out.println(w);
        w="Hello Java";
        System.out.println(w);

        // System.out.println("Halo");
        //System.out.println("");

    }
    
}