public class Arithmatic {
    public int add(int a ,int b){
        return a+b;
    }
    public int sub(int a ,int b){
        return a-b;
    }
    public int mul(int a ,int b){
        return a*b;
    }
    public int div(int a ,int b){
        return a/b; 
    }
    public static void main(String[] args) {
        Arithmatic arthicmethic = new Arithmatic();
        System.out.println("add-" +arthicmethic.add(2,1));
        System.out.println("sub-" +arthicmethic.sub(2,1));
        System.out.println("mul-" +arthicmethic.mul(2,1));
        System.out.println("div-" +arthicmethic.div(2,1));
    }
}
