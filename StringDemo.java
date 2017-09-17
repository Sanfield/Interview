package com.aiqiyi.demo;
import java.io.IOException;
import java.util.Scanner;

public class StringDemo
{

    public static void main(String args[]) throws IOException
    {
    	Scanner sc =new Scanner(System.in);
    	int x1=sc.nextInt();
    	int k1=sc.nextInt();
    	int x2=sc.nextInt();
    	int k2=sc.nextInt();
    	int len1=getLength(x1);
    	int len2=getLength(x2);
        sc.close();
    	if(len1*k1>len2*k2){
    		System.out.println("Greater");
    	}
    	else if(len1*k1<len2*k2){System.out.println("Less");}
    	else{
    		String str1="";
    		int i=0,j=0;
    		while(i<k1){
    			i++;
    			str1+=String.valueOf(x1);
    			}
    		String str2="";
    		while(j<k2){
    			j++;
    			str2+=String.valueOf(x2);
    			}
    		int result=str1.compareTo(str2);
    		if(result==-1){
    			System.out.println("Less");
    		}else if(result==0){
    			System.out.println("Equal");
    		}else{
    			System.out.println("Greater");
    		}
    	   }
    }
    public static int getLength(int x){
		int length=1;
		for(;x/10>0;length++){
			x/=10;
		}
		return length;
	}
}