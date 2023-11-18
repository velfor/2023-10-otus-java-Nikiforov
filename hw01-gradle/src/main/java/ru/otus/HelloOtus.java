package ru.otus;

import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.util.logging.Logger;

public class HelloOtus {
    private static final Logger logger = Logger.getLogger(HelloOtus.class.getName());

    public static void main(String[] args) {
        BigInteger factorial = BigIntegerMath.factorial(5);
        String result = String.format("Факториал числа 5: %d", factorial);
        logger.info(result);
    }
}
