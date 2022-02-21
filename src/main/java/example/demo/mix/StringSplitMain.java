package example.demo.mix;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitMain {

    public static void main(String[] args) {
        String filename = "sample.Final.Delivery.txt";
        String[] split = filename.split("\\.");
        StringBuffer newFilename=new StringBuffer();
        for (int i = 0; i < split.length; i++) {
            if(i== split.length-1) {
                newFilename.append("-").append(System.currentTimeMillis()).append(".").append(split[i]);
            }else{
                newFilename.append(split[i]);

            }
        }
        System.out.println(newFilename);
    }


}
