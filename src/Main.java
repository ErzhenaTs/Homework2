//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat +4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = (int) (frog / 3.5);
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var overallWheight = firstBoxer + secondBoxer;
        System.out.println(overallWheight);
        var differenceWheight = firstBoxer - secondBoxer;
        System.out.println(differenceWheight);

        var remainWheight = secondBoxer % firstBoxer;
        System.out.println(remainWheight);


        var overallTime = 640;
        var oneEmployeeTime = 8;
        var numberOfEmployees = overallTime / oneEmployeeTime;
        System.out.println("Всего работников в компании — " + numberOfEmployees);

        var newNumberOfEmployees = numberOfEmployees + 94;
        var newOneEmployeeTime = overallTime / newNumberOfEmployees;
        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newOneEmployeeTime +" часов работы может быть поделено между сотрудниками.");









            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                    }
}