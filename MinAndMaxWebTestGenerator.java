package pset6;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestGenerator {
    public static void main(String[] a) {
        String suite = new MinAndMaxWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.Assert.*;\n\n"
            + "import org.junit.Test;\n\n"
            + "import org.openqa.selenium.By;\n"
            + "import org.openqa.selenium.WebDriver;\n"
            + "import org.openqa.selenium.WebElement;\n"
            + "import org.openqa.selenium.firefox.FirefoxDriver;\n"
            + "import org.junit.AfterClass;\n"
        	+ "import org.junit.BeforeClass;\n";
    }

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinAndMaxWebTestSuite {\n");
        sb.append("static WebDriver wd;\n");
        
        //code goes here...
        ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("infinity"); // [0] = ??
        inputs.add("-3");	    // [1] = -3
        inputs.add("0");  	    // [2] = 0
        inputs.add("7");        // [3] = 7
        
        String invalid = ("Please enter integer values only!");

        int test_num = 0;
      
        //execute the test <x = [??, -3, 0 7], y = [??, -3, 0 7], z = [??, -3, 0 7], submitButton = click> and check the output message is correct
               
        sb.append("@BeforeClass public static void before(){\n");
        sb.append("   System.setProperty(\"webdriver.gecko.driver\", \"C:/Users/Charles/Desktop/pset6_jar_file/geckodriver.exe\");\n");
        sb.append("    wd = new FirefoxDriver();"); // launch the browser
        sb.append("}\n");
        
        sb.append("@AfterClass public static void after(){\n");
        sb.append("   wd.quit();\n"); // close the browser window
        sb.append("}\n");
        
        
        
        for(int x = 0; x<4; x+=1){
        
        	for(int y = 0; y<4; y +=1){
        		 
        		for(int z = 0; z<4; z +=1){
        			
        			for(int choose = 0; choose < 2; choose +=1){//choose 0 = findmax, choose 1 = findmin
        				
        				for(int ck = 0; ck < 2; ck += 1){ // 0 = clicked, 1 = not clicked
            				sb.append("@Test public void t"+test_num+"() {\n");
                	        sb.append("   wd.get(\"file:///C:/Users/Charles/workspace/EE360T/src/pset6/minandmax.html\");\n");
                			sb.append("   WebElement we = wd.findElement(By.id(\"x\"));\n");
                        	sb.append("   we.sendKeys(\"" +  inputs.get(x) + "\");\n"); // enter input for x
                			sb.append("   we = wd.findElement(By.id(\"y\"));\n");
                   		 	sb.append("   we.sendKeys(\"" +  inputs.get(y) + "\");\n"); // enter input for y
                	        sb.append("   we = wd.findElement(By.id(\"z\"));\n");
                	        sb.append("   we.sendKeys(\"" +  inputs.get(z) + "\");\n"); // enter input for z
                	        if(choose == 0){
                	        	sb.append("   we = wd.findElement(By.id(\"max\"));\n");
                	        	sb.append("   we.click();\n");
                	        }
                	        if(choose == 1){
                	        	sb.append("   we = wd.findElement(By.id(\"min\"));\n");
                	        	sb.append("   we.click();\n");
                	        }
                	        if(ck == 0){
                	        	sb.append("   we = wd.findElement(By.id(\"computeButton\"));\n");
                    	        sb.append("   we.click();\n");	
                    	        
                    	        sb.append("   WebElement result = wd.findElement(By.id(\"result\"));\n");
                    	        sb.append("   String output = result.getText();\n"); // read the output text
                    	        
                    	        if(x == 0 || y == 0 || z == 0){
                    	        	sb.append("   assertEquals(\"" +invalid+ "\", output);\n");
                    	        }else{
                    	        	if(choose == 0){
                    	        		String r = findMax(inputs.get(x),inputs.get(y),inputs.get(z));
                        	        	sb.append("   assertEquals(\"max("+inputs.get(x)+", "+inputs.get(y)+", "+inputs.get(z)+") = "+r+"\", output);\n");
                    	        	}if(choose == 1){
                    	        		String r = findMin(inputs.get(x),inputs.get(y),inputs.get(z));
                        	        	sb.append("   assertEquals(\"min("+inputs.get(x)+", "+inputs.get(y)+", "+inputs.get(z)+") = "+r+"\", output);\n");
                    	        	}
                    	        	
                    	        }
                	        }
                	        if(ck == 1){
                	        	//sb.append("   we = wd.findElement(By.id(\"computeButton\"));\n");
                    	        //sb.append("   we.click();\n");	
                    	        
                    	        sb.append("   WebElement result = wd.findElement(By.id(\"result\"));\n");
                    	        sb.append("   String output = result.getText();\n"); // read the output text
                    	        sb.append("   assertEquals(\"\", output);\n");
                	        }
                	        
                	        
                	        sb.append("}\n");
                	        test_num+=1;
            			}
        			}
        			
        		}
        	}
        }
       
        sb.append("}\n");
        
        return sb.toString();
    }

    // implement any helper methods that you need in this class
    String findMin(String x, String y, String z){
		int min = Math.min(Integer.parseInt(x), Integer.parseInt(y));
		int min2 = Math.min(min, Integer.parseInt(z));
		return String.valueOf(min2);
    	
    }
    String findMax(String x, String y, String z){
		int max = Math.max(Integer.parseInt(x), Integer.parseInt(y));
		int max2 = Math.max(max, Integer.parseInt(z));
		return String.valueOf(max2);
    	
    }
}
