package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 1;
        if (power == 0){
            System.out.println(1);
        } else if (power < 0) {
            System.out.println("too much power");
        }else {
            System.out.println(1);
            while (i <= power){
                int count = 1;
                int value = 2;
                while (count < i){
                    value *=2;
                    count++;
                }
                System.out.println(value);
                i++;
            }
        }
    }
}
