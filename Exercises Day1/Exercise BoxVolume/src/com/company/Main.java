package com.company;

import java.util.Scanner;


class Box{
    int height;
    int width;
    int depth;


    public Box(int height,int width,int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    public int volume(){
        int volume;
        return volume=this.height*this.width*this.depth;
    }
}

public class Main {


    public static void main(String[] args) {

        System.out.println("Input Height");
	int height=new Scanner(System.in).nextInt();
        System.out.println("Input Width");
	int width=new Scanner(System.in).nextInt();
        System.out.println("Input Depth");
	int depth=new Scanner(System.in).nextInt();

	//Obj B with parameters passed in constructor.
      Box B= new Box(height,width,depth);
        System.out.println("Result");
      System.out.println(B.volume());



    }
}
