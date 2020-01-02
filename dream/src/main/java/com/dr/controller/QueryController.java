package com.dr.controller;

import com.dr.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-10-17 15:36
 */
@RestController
@Slf4j
public class QueryController {
    @Autowired
    DemoService demoService;
    private static Logger logger = LoggerFactory.getLogger(QueryController.class);

    @RequestMapping(value = "/test")
    public void testHttp(){

    }

    /**
     * the entrance of the program
     * @param args
     */
    public  static void main(String[] args) throws Exception{
        //generate a random array
        ArrayList<Integer> array= getRandomArray();
        menu(array);
    }

    /**
     * menu
     * @param array
     */
    public static void menu(ArrayList<Integer> array) throws Exception{
        //kurenai's homework
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Array Review Program by Kurenai");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Choose 1 of the following options");
        System.out.println("1. view the array");
        System.out.println("2. output the largest and smallest array elements");
        System.out.println("3. sort the array");
        System.out.println("4. scramble the array");
        System.out.println("5. remove a value from the array");
        System.out.println("6. add a value to the array");
        System.out.println("0. exit the program");
        System.out.println("Enter your choice:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        switch (n){
            case 1 :
                showArray(array);
                break;
            case 2 :
                getLargestAndSmallest(array);
                break;
            case 3 :
                array = sort(array);
                break;
            case 4 :
                boolean reuslt = scramble(array);
                if (reuslt){
                    System.out.println("SUCESS");
                }else {
                    System.out.println("FAILED");
                }
                break;
            case 5 :
                System.out.println("input the number you want to remove");
                int toBeRemoved=input.nextInt();
                remove(array,toBeRemoved);
                break;
            case 6 :
                System.out.println("input a number");
                int toBeAdded=input.nextInt();
                add(array,toBeAdded);
                break;
            case 0 :
                System.exit(0);
        }
        menu(array);
    }

    /**
     * generate a new arrayList with 20 random elements
     * @return
     */
    public static ArrayList<Integer> getRandomArray(){
        ArrayList<Integer> arrays = new ArrayList();
        for (int i=0;i<20;i++){
            arrays.add((int) (Math.random()*100)+1);
        }
        return arrays;
    }
    public static void showArray(ArrayList<Integer> array){
        System.out.println(array);
    }

    /**
     * bubble sort
     * @param array
     * @return
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        //bubbleSort
        for (int i=0;i<array.size()-1;i++){
            for (int j=1;j<array.size()-i;j++){
                if (array.get(j - 1).compareTo(array.get(j)) > 0){
                    Integer temp = array.get(j-1);
                    array.set((j-1),array.get(j));
                    array.set(j,temp);
                }
            }
        }
        System.out.println(array);
        return array;
    }

    /**
     * output the largest and smallest array elements
     * @param array
     */
    public static void getLargestAndSmallest(ArrayList<Integer> array){
        int max =array.get(0);
        int min =array.get(0);
        for (int i = 0;i < array.size();i++){
           if (min>array.get(i)){
               min=array.get(i);
           }
           if (max<array.get(i)){
               max=array.get(i);
           }
        }
        System.out.println("the largest number in array is "+max);
        System.out.println("the smallest number in array is "+min);
    }

    /**
     * remove elements
     * @param array
     * @param toBeRemoved
     * @return
     */
    public static ArrayList<Integer> remove(ArrayList<Integer> array,int toBeRemoved){
        int count = 0;
        if (array.contains(toBeRemoved)){
            for (int i=0;i<array.size();i++){
                int indexToBeRemoved = array.indexOf(toBeRemoved);
                if (indexToBeRemoved==-1){
                    break;
                }
                array.remove(indexToBeRemoved);
                count++;
            }
            System.out.println(count+" "+toBeRemoved+" has been removed");
            return array;
        }else {
            System.out.println("no such element");
            return array;
        }
    }

    /**
     * add an element
     * @param array
     * @param toBeAdded
     * @return
     */
    public static ArrayList<Integer> add(ArrayList array,int toBeAdded){
        array.add(toBeAdded);
        System.out.println(toBeAdded+" has been added");
        return array;
    }

    /**
     * shuffle array
     * @param array
     * @return
     * @throws Exception
     */
    public static boolean scramble(ArrayList array) throws Exception{
        try {
            Collections.shuffle(array);
            System.out.println("array has been scrambled");
            return true;
        }catch (Exception e){
            System.out.println("shuffle error:"+e);
            return false;
        }
    }


}
