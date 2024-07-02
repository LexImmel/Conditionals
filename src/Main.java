public class Main {
    public static void main(String[] args) {
        //Задача 1
        short age = 19;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        //Задача 2
        int temp = 12;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов,можно идти без шапки");
        }
        //Задача 3
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость "+ speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задача 4
        short personAge = 19;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если человеку " + personAge + " лет, то ему нужно ходить в детский сад");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если человеку " + personAge + " лет, то ему нужно ходить в школу.");
        }
        if (personAge >= 18 && personAge <= 24 ) {
            System.out.println("Если человеку " + personAge + ", то его место в университете.");
        }
        if (personAge >= 25) {
            System.out.println("А если человеку " + personAge + ", то ему пора ходить на работу.");
        }
        //Задача 5
        short childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен "+ childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого.");
            }
        //Задача 6
        short capacityTotal = 102;
        short capacitySit = 60;
        short capacityNow = 100;
        if (capacityNow<capacitySit) {
            System.out.println("В вагоне есть сидячие места.");
        }
        if (capacityNow>=capacitySit && capacityNow<capacityTotal) {
            System.out.println("В вагоне нет сидячих, но остались стоячие места.");
        }
        else {
            System.out.println("Вагон полностью заполнен, мест нет.");
        }
        //Задача 7
        int one=1;
        int two=2;
        int three=3;
        if (one>two && one>three) {
            System.out.println("Первое число больше остальных.");
        }
        if (two>three && two>one) {
            System.out.println("Второе число больше остальных.");
        } else {
            System.out.println("Третье число больше остальных.");
        }
    }
    }