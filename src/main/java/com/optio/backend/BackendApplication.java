package com.optio.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
            //test();
            //keywordSearch();
		SpringApplication.run(BackendApplication.class, args);
		//comment
	}
        
        /**public static void test(){
            List<String> keywords = new ArrayList(Arrays.asList("FIRSTNAME", "LASTNAME", "FUND"));
            List<String> dataList = new ArrayList(Arrays.asList("HUSBANDFIRSTNAME", "HUSBANDLASTNAME", "WIFEFIRSTNAME", "SOURCECURRENCY", "CURRENCYRATE"));
            Set<String> targetSet = new HashSet();

            String pattern = String.join("|", keywords);
            System.out.println(pattern);
            for (String data : dataList) {
                Matcher matcher = Pattern.compile(pattern).matcher(data);
                if (matcher.find()) {
                    
                    targetSet.add(data);
                }
            }

            System.out.println(targetSet);
        }
        
        public static void keywordSearch(){
            String input = "first name";
            input = input.replaceAll(" ", "|");
            
            //System.out.println(input);
            
            //System.out.println("*************************************************");
            List<String> keywords = new ArrayList(Arrays.asList("FIRST NAME", "LAST NAME", "FUND"));
            List<String> dataList = new ArrayList(Arrays.asList("HUSBAND FIRST NAME", "HUSBAND LAST NAME", "WIFEFIRSTNAME", "SOURCECURRENCY", "CURRENCYRATE"));
            Set<String> targetSet = new HashSet();

            String pattern = input;
          //  System.out.println(pattern);
            for (String data : dataList) {
                Matcher matcher = Pattern.compile(pattern).matcher(data.toLowerCase());
                if (matcher.find()) {
                    
                    targetSet.add(data);
                }
            }

            System.out.println(targetSet);
        }**/
}
