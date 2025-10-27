import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hash_map {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int x = input.nextInt();
         int[]arr = new int[x];
         for(int i=0; i<x; i++){
              arr[i]=input.nextInt();
          }
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i =0 ; i<x; i++){
                int key = arr[i];
                int freq = 0;
                if(map.containsKey(key)){
                    freq = map.get(key);}
                    freq++;
                    map.put(key,freq);

          }
            int maxfreq = 0;
            int maxele = 0;
            int minfreq = x;
            int minele = 0;
          for(Map.Entry<Integer,Integer>entry:map.entrySet()){
              int count = entry.getValue();
              int value = entry.getKey();
              if(count>maxfreq){
                  maxfreq = count;
                  maxele = value;
              }
              if(count<minfreq){
                  minfreq = count;
                  minele = value;
              }
          }
        System.out.println("max element is"+maxele);
        System.out.println("min element is"+minele);

        }
    }



