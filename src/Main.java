public class Main {
    public static void main(String[] args) {
        System.out.println ("задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        System.out.println ("задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        System.out.println ("задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        System.out.println ("задание 4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend/7;
        System.out.println (friend);

        System.out.println ("задание 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        System.out.println ("задание 6");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var sum = fighter1 + fighter2;
        System.out.println (sum);
        var raz = fighter2 - fighter1;
        System.out.println (raz);

        System.out.println ("задание 7");
        var ost = fighter2 % fighter1;
        System.out.println (ost);

        System.out.println ("задание 8");
        var hours = 640;
        var hoursStaff = 8;
        var staff = hours / hoursStaff;
        System.out.println ("Всего работников в компании — " + staff + " человек");
        staff = 94;
        hoursStaff = hours / staff;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + hoursStaff + " часов работы может быть поделено между сотрудниками");
    }
}