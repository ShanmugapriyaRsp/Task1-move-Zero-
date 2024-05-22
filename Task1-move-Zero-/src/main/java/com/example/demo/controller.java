package com.example.demo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
        public static void exchange(int [] array){
            for (int j=0; j<array.length; j++){
                if (array[j]==0)
                     {
                        for (int i=array.length-1; i!=j ; i--) {
                            int temp = array[j];
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                System.out.print(array[j]+ " ");
            }
            System.out.print("------Expected Output------");
        }
}
