package com.company;

public class Main {


    private int i,value,max,counter,max2,z;

    public static void main(String[] args) {
        Main main = new Main();
        main.control();
    }

    private void control(){
        init();
        calculator();
        System.out.println("max : " + max2);
    }

    private void init() {
        max=0;
        max2 = 0;
    }

    private void calculator() {
        for (i=7;i<1000;i++){
            counter=0;
            value = 10%i;
            z=1000;
            //최대 1000번까지 계산을 할 수 있도록함
            while (value != 1 && z>0){
                value = value *10;
                value = value % i;
                counter++;
                z--;
            }
            if (counter>max && z>1){
                max=counter;
                max2=i;
            }
        }
    }

}
