package Nomer1;
public class TumpukanApp {
    public static void main (String[] args){
        Tumpukan tumpukan = new Tumpukan(5);
        tumpukan.push(8);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("nilai teratas = "+tumpukan.peek());
        System.out.println("muhammad Farid Baehaqi");
        System.out.println("nilai yang dihapus= "+tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        }
}

