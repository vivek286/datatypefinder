import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
class Data{
///////////////////CLASS FOR FINDING DATA TYPE/////////////////////////////////////////
class finddata{
public static <T> String nameOf(T o) {
    return o.getClass().getSimpleName();
}}
///////////////////////////////////////////////////////////////////////////////////////
	public static void main (String[] args) throws java.lang.Exception{
  Scanner s=new Scanner(System.in);
  finddata dt=new finddata();
  System.out.println(dt.(nameOf(s.next())));
  
  }
}
