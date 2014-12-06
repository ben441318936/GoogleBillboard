import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907632338298807531952510190115738341879307021540891499348841675092447614606680822648001684774118537423454424371075390777449920695517027618386062613313845830007520449338265602976067371132007093287091274437470472306969772093101416928368190255151086574637721112523897844250569536967707854499699679468644549059879316368892300987931277361782154249992295763514822082698951936680331825288693984964651058209392398294887933203625094431173012381970684161403970198376793206832823764648042953118023287825098194558153017567173613320698112509961818815930416903515988885193458072738667385894228792284998920868058257492796104841984443634632449684875602336248270419786232090021609902353043699418491463140934317381436405462531520961836908887070167683964243781405927145635490613031072085103837505101157477041718986106873969655212671546889570350354";  
public void setup()  
{            
     noLoop();  
}  
public void draw()  
{   
  //not needed for this assignment
  /*for(int i=2;i<=e.length()-10;i++)
  {
    double t=0;
    //Double dNum=Double.parseDouble(e.substring(i,i+10));
    //if(isPrime(dNum)==true) {println(dNum);}
    //println((i-1)+" "+dNum);
    for(int x=i;x<=i+9;x++)
    {
      t=t+Double.parseDouble(e.substring(x,x+1));
    }
    if(t==49) {println(i);}
  }*/

  ArrayList <Double> tNum=new ArrayList <Double> ();
  ArrayList <Integer> tIn=new ArrayList <Integer> ();
  ArrayList <Double> tNum1=new ArrayList <Double> ();
  ArrayList <Integer> tIn1=new ArrayList <Integer> ();
  ArrayList <Double> tNum2=new ArrayList <Double> ();
  ArrayList <Integer> tIn2=new ArrayList <Integer> ();

  for(int i=2;i<=e.length()-10;i++)
  {
    tNum.add(Double.parseDouble(e.substring(i,i+10)));
    tIn.add(i);
    tNum1.add(Double.parseDouble(e.substring(i,i+10)));
    tIn1.add(i);
    tNum2.add(Double.parseDouble(e.substring(i,i+10)));
    tIn2.add(i);
  }

  for(int i=0;i<tNum1.size();i++)
  {
    if(isPrime(tNum1.get(i)) == false)
    {
      tNum1.remove(i);
      tIn1.remove(i);
      i=i-1;
    }
  }
  println("tNum1: "+tNum1);
  println("tIn1: "+tIn1);  
  
  for(int i=0;i<tIn2.size();i++)
  {
    double t=0;
    int tempIn=(int)tIn2.get(i);
    String tNumString=e.substring(tempIn,tempIn+10);
    for(int n=0;n<tNumString.length();n++)
    {
      //t=t+Double.parseDouble(tNumString);
      //println(Double.parseDouble(tNumString.substring));
      t=t+Double.parseDouble(tNumString.substring(n,n+1));
    }
    if(t!=49)
    {
      tNum2.remove(i);
      tIn2.remove(i);
      i=i-1;
    }
  }
  println("tNum2: "+tNum2);
  println("tIn2: "+tIn2);
  
}  
public boolean isPrime(double num)
{
  if(num < 2) {return false;}
  else 
  {
    for (double i=2; i<=Math.sqrt(num);i++)
    {
      if(num%i==0)
      {
        return false;
      }
    }
  }
  return true;
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
