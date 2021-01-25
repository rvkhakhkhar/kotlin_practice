package com.ravi;

import java.util.Arrays;
import static com.ravi.ExtensionKtKt.*;

public class KotlinFromJava {

  public static void main(String[] args) {
    String s = StringFunctions.joinToString(Arrays.asList("A", "B", "C"));
    System.out.println("KotlinFromJava.main :--> " + lastChar(s));

    String separator = StringFunctions.getSEPARATOR();
    System.out.println("separator = " + separator);
    StringFunctions.setSEPARATOR("*");
    System.out.println(StringFunctions.joinToString(Arrays.asList("A", "B", "C")));
  }

}
