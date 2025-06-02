package Collection_Framework.src.opgave_2_2;

public class App {
    public static void main(String[] args) {
        Skole s1 = new Skole("Lorte skole");

        Studerende st1 = new Studerende(1,"Lasse");
        Studerende st2 = new Studerende(2, "Jeppe");
        Studerende st3 = new Studerende(3, "Sean");
        Studerende st4 = new Studerende(4, "Jacob");
        Studerende st5 = new Studerende(5, "Niels");

        st1.addKarakter(7);
        st1.addKarakter(4);
        st2.addKarakter(2);
        st2.addKarakter(4);
        st3.addKarakter(10);
        st3.addKarakter(12);
        st4.addKarakter(7);
        st4.addKarakter(7);
        st5.addKarakter(4);
        st5.addKarakter(4);

        s1.addStuderende(st1);
        s1.addStuderende(st2);
        s1.addStuderende(st3);
        s1.addStuderende(st4);
        s1.addStuderende(st5);

        System.out.println(s1);
        System.out.println(s1.gennemsnit());

        System.out.println(s1.findStuderende(6));
    }
}
