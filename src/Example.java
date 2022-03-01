import kotlin.collections.ArrayDeque;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Example {


    public static void main(String[] args) {

        Example obj= new Example();
        List<String> output=  obj.getPermutations("CAP");
        System.out.println(output);

    }

    public  List<String>  getPermutations(String input ) {
        List<String> output = new ArrayList<>();
        List<String> preoutput= new ArrayList<>();
        char[] subchars = input.toCharArray();

for (int i=0;i<subchars.length;i++){
for(int j=0;j<subchars.length;j++){

    if(subchars[i]!=subchars[j]){
        for(int k=0;k<subchars.length;k++){
if((subchars[k]!=subchars[j]) && (subchars[k]!=subchars[i])){

    StringBuilder sb = new StringBuilder();
    sb.append(subchars[i]);
    sb.append(subchars[j]);
    sb.append(subchars[k]);
    String value= sb.toString();
    output.add(value);
}
        }
    }

}
        }
return output;

    }
}
