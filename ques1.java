import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class ques1 {

    static class Pair{
        int firstIndex;
        ArrayList<Integer> list;

        Pair(){
            firstIndex = -1;
            list = new ArrayList<>();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        String[] inarr = s.split(",");


        HashMap<Character, Pair> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                Pair p = map.get(ch);
                if(p.firstIndex == -1) p.firstIndex = i;
                else p.list.add(i);
            }
            else{
                Pair pp = new Pair();
                pp.firstIndex = i;
                map.put(ch, pp);
            }
        }

        HashMap<String, ArrayList<Integer>> freqOfInarr = new HashMap<>();

        for(int i = 0; i< inarr.length; i++){
            String strng = inarr[i];
            if(freqOfInarr.containsKey(strng) == true){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
            }
            else{
                ArrayList<Integer> ll = freqOfInarr.get(strng);
                ll.add(i);
                freqOfInarr.replace(strng, ll);
            }
        }

        String outstr = "";

        for (Map.Entry<Character,Pair> entry : map.entrySet()){
            Character ch = entry.getKey();
            Pair p = entry.getValue();
            String extract = inarr[p.firstIndex];

            if(p.list.isEmpty()){
                int count = 0;
                for(int i = 0; i < inarr.length; i++){
                    if(extract.equals(inarr[i]) == true) count++;
                }
                if(count == 1) outstr += ch;
            }
            else{
                int count = 0;
                for(int l : p.list){
                    if(inarr[l].equals(extract) == true) count++;
                }
                if(count == p.list.size()) outstr += ch;
            }
        }

        if(outstr != ""){
            System.out.println(outstr);
        }
        else{
            System.out.println("NA");
        }
        
        sc.close();


    }
}
