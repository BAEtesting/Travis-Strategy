/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travis;


import java.util.function.Predicate; 
import java.util.*;
import static javafx.scene.input.KeyCode.T;
/**
 *
 * @author BAEtesting
 */
public class Travis {

    List<String> name;
    List<Integer> num;
    
    public static <T> int linearSearch(List <T> list, Predicate<T> check){
        int num = -1;
        
        for (T l : list){
            if (check.test(l)) {
                num = list.indexOf(l);
            } 
        }
        return num;
    }
    
    public Travis(List<String> na, List<Integer> nu){
        name = na;
        num = nu;
    }
    
    
    public static Predicate<Travis> startsWithLetterJ() {
		return name -> name.startsWith("J");
	}
    
    
    public static void main(String[] args) {
          List<String> name = new ArrayList<>();
          List<Integer> num = new ArrayList<>();  
        

          
          List<Travis> l = new ArrayList<>();
          
          
          
        name.add("James");
        name.add("John");
        name.add("Henry");
        
        num.add(7);
        num.add(4);
        num.add(5);
 
          
        
        System.out.println(linearSearch(l, starstWithLetterJ()));
        
    }
    
}
