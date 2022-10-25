import org.w3c.dom.css.CSSStyleDeclaration;

import javax.xml.stream.FactoryConfigurationError;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod(20, 23, 32, 4, 20, 42, 45));

    }

    public static boolean myMethod(int num, int... numbers) {
        boolean trueOrFalse = false;
        for (int number : numbers) {
            if (num == number){
                trueOrFalse = true;
            }
        }
        return trueOrFalse;
    }
}



















