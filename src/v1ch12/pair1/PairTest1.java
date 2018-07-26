package v1ch12.pair1;

import java.io.Serializable;
import java.util.ArrayList;

import org.omg.CORBA.Object;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest1
{
   public static void main(String[] args)
   {
      String[] words = { "Mary", "had", "a", "little", "lamb" };
      Pair<String> mm = ArrayAlg.minmax(words);
      System.out.println("min = " + mm.getFirst());
      System.out.println("max = " + mm.getSecond());
      
      
      //测试泛型方法
      double middle = (double) ArrayAlg.getMiddle(3.14, 1729, 0);
      
      String mid = ArrayAlg.getMiddle("a", "b", "c");
   }
}

class ArrayAlg
{
   /**
    * Gets the minimum and maximum of an array of strings.
    * @param a an array of strings
    * @return a pair with the min and max value, or null if a is null or empty
    */
   public static Pair<String> minmax(String[] a)
   {
      if (a == null || a.length == 0) return null;
      String min = a[0];
      String max = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<String>(min, max);
   }

   public static <T> T getMiddle(T...  a){
	   return a[a.length / 2];
   }
   
   /**
    * 泛型限定 只能有一个类，它必须是限定列表的第一个，但是可以有多个限定接口
    * @param a
    * @return
    */
   public static <T extends java.lang.Object & Serializable & AutoCloseable> T getMiddle2(T...  a){
	   return a[a.length / 2];
   }
 }
