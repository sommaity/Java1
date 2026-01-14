package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class VariableData {
    //List of Sorted Integer
    public List<Integer> sortedNumbers(){
        List<Integer> numbers=new ArrayList<>();
        int n=30;
        for (int i = 1; i <=n ; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    //List of Unsorted Integer
    public List<Integer> unsortedNumbers(){
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(28,66,2,9,56,334,28,32,9));
        for(int i=0;i<10;i++){
            int x=(int)(Math.random()*991)+10;
            numbers.add(x);
            int y=(int)(Math.random()*100)+1;
            numbers.add(y);
        }
        return numbers;
    }

    //List of Strings(Cities)
    public List<String> cities(){
        return Arrays.asList("Kolkata","Chennai","Mumbai","Thane","Bangalore","Pune","Thiruvantapuram","Thane","Mumbai");
    }

    //List of Random Strings
    public List<String> strings(){
        ArrayList<String> strings1=new ArrayList<>();
        String chars="abcdefghijklmnopqrstuvwxyz";
        Random random=new Random();
        for(int i=0;i<12;i++){
            int length=random.nextInt(11)+2;
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<length;j++){
                if(j==0)
                    sb.append(Character.toUpperCase(chars.charAt(random.nextInt(chars.length()))));
                sb.append(chars.charAt(random.nextInt(chars.length())));
            }
            strings1.add(sb.toString());
        }
        return strings1;
    }

}
