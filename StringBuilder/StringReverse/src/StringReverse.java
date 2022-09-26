public class StringReverse {
    public static void main(String[] args) {
        StringReverse obj1 = new StringReverse();
        obj1.stringReverse();
    }
    public void stringReverse(){
        String name = "Sohail";
        StringBuilder stb = new StringBuilder();

        System.out.println(stb.append(name).reverse().toString());

    }
}
