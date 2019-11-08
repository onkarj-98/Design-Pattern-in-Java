package FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter the name for which bill will be generated:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Enter the number of units for bill weill bw calculated");
        int units = Integer.parseInt(br.readLine());
        //call getRate() method and calculateBill()method of DomesticPaln.
        Plan p = planFactory.getPlan(planName);
        System.out.println("Bill amount for"+planName+"of"+"units is:");
        p.getRate();
        p.calculateBill(units);
    }
}
