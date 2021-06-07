package com.mycompany.introducaojunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SCHARLES
 */
class MathUtilMdcTest {
    
    @Test
    void mdcAImparP1(){
        final int a=9;
        final int b=3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcAParP1(){
        final int a=6;
        final int b=3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcParesP2(){
        final int a=16;
        final int b=8;
        final int divisor=4;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido%divisor==0);
    }
    @Test
    void mdcAZeroP3(){
        final int a=0;
        final int b=10;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcBZeroP3(){
        final int a=6;
        final int b=0;
        final int esperado = a;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcBNegativoP3(){
        final int a=0;
        final int b=-10;
        final int esperado = Math.abs(b);
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcANegativoP3(){
        final int a=-6;
        final int b=0;
        final int esperado = Math.abs(a);
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcMParP4(){
        final int a=9;
        final int b=3;
        final int m=2;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m*MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcP5(){
        final int a=7;
        final int b=3;
        final int c=5;
        final int esperado = MathUtil.mdc(a*b, c);
        final int obtido = MathUtil.mdc(b,c);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcResultado1P5(){
        final int a=7;
        final int b=3;
        final int c=5;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(b,c);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcBMenorP6(){
        final int a=55;
        final int b=25;
        final int esperado = 5;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcAMenorP6(){
        final int a=25;
        final int b=55;
        final int esperado = 5;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcP7(){
        final int a=-50;
        final int b=10;
        final int esperado = 10;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcMultiplosValores(){
        final int a=30;
        final int b=12;
        final int c=4;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcNenhumParametro(){
        assertThrows(IllegalArgumentException.class, ()-> MathUtil.mdc());
        //assertThrows(ArrayIndexOutOfBoundsException.class, ()->mdc());
    }
    
    @Test
    void mdcNull(){
        assertThrows(NullPointerException.class, ()-> MathUtil.mdc(null));
        //assertThrows(ArrayIndexOutOfBoundsException.class, ()->mdc());
    }


}
