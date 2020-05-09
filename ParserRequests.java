import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



/*
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ParserRequests {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String URL = reader.readLine();
            String tmp;
            int a=URL.lastIndexOf("?");
            tmp=URL.substring(a+1);
            String[] parts=tmp.split("&");
            ArrayList<String> list=new ArrayList<>();
            for (int i=0;i<parts.length;i++) {
                if(parts[i].contains("=")){
                    int b=parts[i].lastIndexOf("=");
                    list.add(parts[i].substring(0,b));
                }else {
                    list.add(parts[i]);
                }
            }
            for (int i=0;i<list.size();i++) {
                System.out.print(list.get(i)+" ");
            }
            for (int i=0;i<parts.length;i++) {
                if(parts[i].contains("obj")){
                    System.out.println("");
                    int c=parts[i].lastIndexOf("=");
                    try {
                        alert(Double.parseDouble(parts[i].substring(c+1)));
                    }catch (Exception e){
                        alert(parts[i].substring(c+1));
                    }
                }
            }//add your code here
        }

        public static void alert(double value) {
            System.out.println("double: " + value);
        }

        public static void alert(String value) {
            System.out.println("String: " + value);
        }
    }

