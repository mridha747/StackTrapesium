public class testStackTrapesium {

    public static void main(String[] args) {
        StackTrapesiu x = new StackTrapesiu(5);
        x.push(new Trapesiu(4,5,8,9,10));
        x.push(new Trapesiu(5,7,8,9,4));
        System.out.println(x.pop().luas());
        System.out.println(x.pop().luas());












    }
}
