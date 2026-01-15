package Java8;

import java.util.*;
import java.util.stream.Collectors;

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

        //Square of all numbers
        //vd.sortedNumbers().stream().map(x->x*x).forEach(System.out::println);

        //Sort numbers in descending order
        //vd.sortedNumbers().stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        //list of cities length > 6
        //List<String> longCities=vd.cities().stream().filter(s->s.length()>6).collect(Collectors.toList());
        //System.out.println(longCities);

        //sort cities alphabetically
        //vd.cities().stream().sorted().forEach(System.out::println);

        //first city that starts with B
        //String s1=vd.cities().stream().filter(s->s.startsWith("B")).findFirst().orElse("No City");
        //System.out.println(s1);

        //list to set
        //Set<String> set=vd.cities().stream().collect(Collectors.toSet());
        //System.out.println(set);

        //Join city name into a single String
        //String s5=vd.cities().stream().reduce((s1,s2)->s1.concat(","+s2)).get();
        //System.out.println(s5);

        //-------------------Level 3-------------------------

        //Find the maximum number
        //int max=vd.unsortedNumbers().stream().sorted((l1,l2)->l2.compareTo(l1)).findFirst().get();
        //System.out.println(max);

        //Find the minimum number
        //int min=vd.unsortedNumbers().stream().min((l1,l2)->l1.compareTo(l2)).get();
        //System.out.println(min);

        //Find the second-highest
        //int second=vd.sortedNumbers().stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        //System.out.println(second);

        //Find average of numbers
        //double average=vd.sortedNumbers().stream().mapToInt(Integer::intValue).average().orElse(0.0);
        //System.out.println(average);

        //Count occurrences of each city
        //Map<String,Integer> map1=new HashMap<>();
        //vd.cities().stream().forEach(x->map1.put(x,map1.getOrDefault(x,0)+1));
        //System.out.println(map1);

        //Group cities by length
        //Map<Integer,List<String>> map2= vd.cities().stream().distinct().collect(Collectors.groupingBy(String::length));
        //System.out.println(map2);

        //Find duplicate names
        //Set<String> set=new HashSet<>();
        //Set<String> duplicate=vd.cities().stream().filter(s->!set.add(s)).collect(Collectors.toSet());
        //System.out.println(duplicate);

        // ------------- Level 4 --------------

    }
}
