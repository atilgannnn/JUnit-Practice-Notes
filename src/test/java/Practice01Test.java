import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Practice01Test {


    //Task-1: Her bir testten önce Practice01 classından obje oluşturup, testten sonra null a set ediniz.


    public static Practice01 object;
/*
    @BeforeEach
    public void beforeEach(){

        object = new Practice01();
        System.out.println("beforeEach() çalıştı");

    }

    @AfterEach
    public void afterEach(){

        object = null;
        System.out.println("afterEach() çalıştı");

    }

 */

    //Task-2-a:Practice01 classının Hypotenuse Metodunu pozitif senaryo ile test ediniz. --> 5,12 ->13
    //Task-2-b:Practice01 classının Hypotenuse Metodunu negatif senaryo ile test ediniz.

    @Test
    @DisplayName("Hipotenüs Metodunun Testi")
    public void testHypotenuse(TestInfo info){

        double act = object.hypotenuse(5,12);
        double exp = 13;
        double notExp = 17;
        assertNotEquals(notExp,act);
        System.out.println(info.getDisplayName() + " çalıştı");


    }

    //Task-3:Testin ismini değiştiriniz.
    // --> Methodun üstüne "@DisplayName("Hipotenüs Metodunun Testi")" bu annotation ı kullanıyoruz



    //Task-4:Testin ismini konsolda yazdırınız.

    // --> Method parantezi içine TestInfo interface ini yazıp şu kodu kullanıyoruz : "System.out.println(info.getDisplayName() + " çalıştı");"

    //Task-5: tüm testlerde kullanmak üzere Practice01 classından obje oluşturup, kullanımı bitince null a set ediniz.

    @BeforeAll
    public static void beforeAll(){

        object = new Practice01();
        System.out.println("beforeAll() çalıştı");


    }

    @AfterAll
    public static void afterAll(){

        object = null;
        System.out.println("afterAll() çalıştı");


    }

    //Task-6-a:Practice01 classının IsPalindrom Metodunu pozitif senaryo ile test ediniz.
    //Task-6-b:Practice01 classının IsPalindrom Metodunu negatif senaryo ile test ediniz.

    @Test
    public void testIsPalindrom(TestInfo info){

        //assertTrue(object.isPalindrom("kayak"));
        assertFalse(object.isPalindrom("palindrom"));
        System.out.println(info.getDisplayName() + " çalıştı");


    }

    //Task-7:Practice01 classının Factorial metodunu 0,1,3 parametreleri için test ediniz.

    @Test
    public void testFactorial(TestInfo info){

        assertEquals(1,object.factorial(0));
        assertEquals(1,object.factorial(1));
        assertEquals(6,object.factorial(3));
        assertTrue(object.factorial(1)==1);
        System.out.println(info.getDisplayName() + " çalıştı");

    }

    //------------------------------------------------- DAY - 2 ------------------------------------------------------//

    //Task-1 : Practice01 classının isPalindrom metodunu "kayak","nalan","yapay" parametreleri için test ediniz.

    @ParameterizedTest
    @ValueSource(strings = {"kayak","nalan","yapay"})
    //@ValueSource(ints = {"","",""})
    public void testPalindrom(String str){

        assertTrue(object.isPalindrom(str));

    }

    //Task-2 : Practice01 classının isPalindrom metodunu "kayak","nalan","hayal" parametreleri için test ediniz.

    @ParameterizedTest
    @CsvSource(value = {"kayak,true","nalan,true","hayal,false"})
    public void testPalindromMix(String str,boolean exp){

        assertEquals(exp,object.isPalindrom(str));

    }

    //Task-3 : Practice01 classının Factorial metodunu 0,1,3 parametreleri için test ediniz.

    @ParameterizedTest
    @CsvSource(value = {"1,0","1,1","6,3"})
    public void testFactorialParam(int exp, int param){

       assertEquals(exp,object.factorial(param));

    }

    //Task-4 : Practice01 classının factorial metodunu -1 parametresi için test ediniz.

    @Test
    public void testFactorialNgativeParam(){

        Exception exception = assertThrows(IllegalArgumentException.class,()-> object.factorial(-1));
        System.out.println(exception.getMessage());
    }

    //Task-5 : Practice01 classının findNumber metodunu 999999 parametresi için 50 ms de sonuç verip vermediğini test ediniz.

    @Test
    public void testFindNumberPerformance(){
        assertTimeout(Duration.ofMillis(60),()->object.findNumber(999999));
    }










}
