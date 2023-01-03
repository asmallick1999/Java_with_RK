public class StaticConcept {
    public static void main(String args[]){
        StaticConcept obj1 = new StaticConcept();
//        int addResult = obj1.add(50,40);
//        int subResult = obj1.sub(30,20);

        System.out.println("addition: "+StaticConcept.add(40,30));
        System.out.println("substraction: "+StaticConcept.sub(40,30));
        System.out.println(roll);
        System.out.println(obj1.roll);
    }
    static int roll = 45;
    int hagu = 203;
    public static int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
    public static int sub(int num1, int num2){
        int result = num1-num2;
        return result;
    }
}
