
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Teste {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(10);
        test.add(20);
         test.add(30);
          test.add(40);
           test.add(50);
        
        for (int i = 0; i < test.size(); i++) {
            System.out.println("["+i+"]: "+test.get(i));
        }
    }
}
