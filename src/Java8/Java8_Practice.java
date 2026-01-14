package Java8;

import java.util.List;

public class Java8_Practice {
    static void main(String[] args) {
        VariableData vd=new VariableData();
        System.out.println(vd.cities());

        //------------------- Level 1 ------------------
        //Print all even numbers
        //vd.sortedNumbers().stream().filter(i->i%2==0).forEach(System.out::println);

        //Sum of even numbers
        //int sum1=vd.sortedNumbers().stream().filter(i->i%2==0).reduce(0,Integer::sum);
        //int sum2=vd.sortedNumbers().stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
        //System.out.println("Even: "+sum1+"   Odd: "+sum2);

        //Print all cities using stream
        //vd.cities().stream().forEach(System.out::println);

        //City name to UpperCase
        //vd.cities().stream().forEach(s->System.out.println(s.toUpperCase()));

        //How many cities are in the list
        //int count=(int)vd.cities().stream().count();
        //System.out.println(count);

        //remove duplicate cities
        //vd.cities().stream().distinct().forEach(System.out::println);

        //All strings having letter s
        //vd.strings().stream().filter(s->s.toLowerCase().contains("s")).forEach(System.out::println);

        //All strings start with s
        //vd.strings().stream().filter(s->s.startsWith("S")).forEach(System.out::println);

        //---------------------- Level 2 ---------------------

    }
}
