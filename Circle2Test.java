

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle2;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle2 = new Circle2(1,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle2.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle2.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}
/*@Test
public void size(double x){
	 System.out.println("Running test Size");
	 circle1.scale(x);
	 Assert.assertEquals(6.0,x);
}*/
@Test
public void Inter(){
	 System.out.println("Running test Inter");
	 circle2.intersects(circle2);
	 Assert.assertTrue(true);
}


/*** NOT USED*/
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle2Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}/*
***/

}