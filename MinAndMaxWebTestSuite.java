package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class MinAndMaxWebTestSuite {
static WebDriver wd;
@BeforeClass public static void before(){
   System.setProperty("webdriver.gecko.driver", "C:/Users/Charles/Desktop/pset6_jar_file/geckodriver.exe");
    wd = new FirefoxDriver();}
@AfterClass public static void after(){
   wd.quit();
}
@Test public void t0() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t1() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t2() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t3() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t4() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t5() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t6() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t7() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t8() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t9() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t10() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t11() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t12() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t13() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t14() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t15() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t16() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t17() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t18() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t19() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t20() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t21() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t22() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t23() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t24() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t25() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t26() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t27() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t28() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t29() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t30() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t31() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t32() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t33() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t34() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t35() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t36() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t37() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t38() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t39() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t40() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t41() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t42() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t43() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t44() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t45() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t46() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t47() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t48() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t49() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t50() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t51() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t52() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t53() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t54() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t55() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t56() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t57() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t58() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t59() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t60() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t61() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t62() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t63() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t64() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t65() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t66() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t67() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t68() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t69() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t70() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t71() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t72() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t73() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t74() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t75() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t76() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t77() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t78() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t79() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t80() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t81() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t82() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t83() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t84() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, -3, -3) = -3", output);
}
@Test public void t85() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t86() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, -3, -3) = -3", output);
}
@Test public void t87() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t88() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, -3, 0) = 0", output);
}
@Test public void t89() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t90() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, -3, 0) = -3", output);
}
@Test public void t91() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t92() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, -3, 7) = 7", output);
}
@Test public void t93() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t94() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, -3, 7) = -3", output);
}
@Test public void t95() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t96() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t97() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t98() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t99() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t100() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, 0, -3) = 0", output);
}
@Test public void t101() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t102() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, 0, -3) = -3", output);
}
@Test public void t103() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t104() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, 0, 0) = 0", output);
}
@Test public void t105() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t106() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, 0, 0) = -3", output);
}
@Test public void t107() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t108() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, 0, 7) = 7", output);
}
@Test public void t109() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t110() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, 0, 7) = -3", output);
}
@Test public void t111() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t112() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t113() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t114() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t115() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t116() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, 7, -3) = 7", output);
}
@Test public void t117() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t118() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, 7, -3) = -3", output);
}
@Test public void t119() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t120() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, 7, 0) = 7", output);
}
@Test public void t121() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t122() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, 7, 0) = -3", output);
}
@Test public void t123() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t124() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(-3, 7, 7) = 7", output);
}
@Test public void t125() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t126() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(-3, 7, 7) = -3", output);
}
@Test public void t127() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t128() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t129() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t130() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t131() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t132() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t133() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t134() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t135() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t136() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t137() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t138() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t139() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t140() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t141() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t142() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t143() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t144() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t145() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t146() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t147() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t148() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, -3, -3) = 0", output);
}
@Test public void t149() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t150() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, -3, -3) = -3", output);
}
@Test public void t151() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t152() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, -3, 0) = 0", output);
}
@Test public void t153() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t154() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, -3, 0) = -3", output);
}
@Test public void t155() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t156() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, -3, 7) = 7", output);
}
@Test public void t157() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t158() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, -3, 7) = -3", output);
}
@Test public void t159() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t160() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t161() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t162() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t163() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t164() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, 0, -3) = 0", output);
}
@Test public void t165() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t166() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, 0, -3) = -3", output);
}
@Test public void t167() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t168() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, 0, 0) = 0", output);
}
@Test public void t169() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t170() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, 0, 0) = 0", output);
}
@Test public void t171() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t172() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, 0, 7) = 7", output);
}
@Test public void t173() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t174() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, 0, 7) = 0", output);
}
@Test public void t175() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t176() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t177() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t178() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t179() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t180() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, 7, -3) = 7", output);
}
@Test public void t181() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t182() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, 7, -3) = -3", output);
}
@Test public void t183() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t184() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, 7, 0) = 7", output);
}
@Test public void t185() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t186() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, 7, 0) = 0", output);
}
@Test public void t187() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t188() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(0, 7, 7) = 7", output);
}
@Test public void t189() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t190() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(0, 7, 7) = 0", output);
}
@Test public void t191() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("0");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t192() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t193() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t194() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t195() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t196() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t197() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t198() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t199() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t200() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t201() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t202() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t203() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t204() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t205() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t206() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t207() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t208() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t209() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t210() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t211() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t212() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, -3, -3) = 7", output);
}
@Test public void t213() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t214() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, -3, -3) = -3", output);
}
@Test public void t215() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t216() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, -3, 0) = 7", output);
}
@Test public void t217() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t218() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, -3, 0) = -3", output);
}
@Test public void t219() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t220() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, -3, 7) = 7", output);
}
@Test public void t221() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t222() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, -3, 7) = -3", output);
}
@Test public void t223() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t224() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t225() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t226() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t227() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t228() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, 0, -3) = 7", output);
}
@Test public void t229() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t230() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, 0, -3) = -3", output);
}
@Test public void t231() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t232() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, 0, 0) = 7", output);
}
@Test public void t233() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t234() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, 0, 0) = 0", output);
}
@Test public void t235() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t236() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, 0, 7) = 7", output);
}
@Test public void t237() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t238() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, 0, 7) = 0", output);
}
@Test public void t239() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("0");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t240() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t241() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t242() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("Please enter integer values only!", output);
}
@Test public void t243() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("infinity");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t244() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, 7, -3) = 7", output);
}
@Test public void t245() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t246() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, 7, -3) = -3", output);
}
@Test public void t247() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("-3");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t248() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, 7, 0) = 7", output);
}
@Test public void t249() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t250() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, 7, 0) = 0", output);
}
@Test public void t251() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("0");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t252() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("max(7, 7, 7) = 7", output);
}
@Test public void t253() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("max"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
@Test public void t254() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   we = wd.findElement(By.id("computeButton"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("min(7, 7, 7) = 7", output);
}
@Test public void t255() {
   wd.get("file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html");
   WebElement we = wd.findElement(By.id("x"));
   we.sendKeys("7");
   we = wd.findElement(By.id("y"));
   we.sendKeys("7");
   we = wd.findElement(By.id("z"));
   we.sendKeys("7");
   we = wd.findElement(By.id("min"));
   we.click();
   WebElement result = wd.findElement(By.id("result"));
   String output = result.getText();
   assertEquals("", output);
}
}

