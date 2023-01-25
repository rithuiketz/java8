package streams;

import dao.Business;
import dao.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCountofMembers
{
        public static void main(String[] args)
        {
            List<Business> businesses =  loadBusinesses();
            int  count  = businesses.stream().flatMapToInt(business -> IntStream.of(business.getVehicles().size())).sum();
            System.out.println(count);

        }

        private static List<Business> loadBusinesses()
        {
            List<Business> list =  new ArrayList<>();
            for(int i=0;i<10;i++)
            {
                List<Vehicle> vehicles =  new ArrayList<>();
                for(int j=1;j<=1000;j++)
                {
                        String make = new Random().toString();
                        String operator = new Random().toString();
                        vehicles.add(new Vehicle(make,operator));
                }
                list.add(new Business(vehicles));
            }
            return list;
        }

}
