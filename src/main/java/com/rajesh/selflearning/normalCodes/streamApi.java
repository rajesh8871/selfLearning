package com.rajesh.selflearning.normalCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {

    public static void main(String[] args) {


        //adding product details
        List<ProductList> productList = new ArrayList<ProductList>();
        productList.add(new ProductList(1, "mirror", 2500f));
        productList.add(new ProductList(2, "Note Book", 250f));
        productList.add(new ProductList(1, "PC", 25000f));
        productList.add(new ProductList(4, "fan", 4000f));

        //Before processing Products
        System.out.println(productList);

        //Iterating through data and filtering through price
        List<ProductList> costlyProducts = productList.stream()
                .filter(product -> product.price > 2000f)//filtering through whole data
                .map(p -> p)//fetching the product, you can map on single fields also like name
                .collect(Collectors.toList());//collecting the products finally

        //Now printing the product
        for (ProductList p : costlyProducts)
            System.out.println(p.name + ": " + p.price);

        //Before processing Products
        System.out.println(costlyProducts);


        AtomicInteger i = new AtomicInteger();
        Stream<String> data = Stream.generate(() -> "element" + i.getAndIncrement()).limit(10);

        //Iterating through stream data
        data.forEach(System.out::println);

        /*Now streams can only be iterated though out its lifecycle
        so if accessing again will throw exception*/

        try {
            data.forEach(s -> System.out.println(s));
        } catch (Exception e) {
            System.out.println("Stream has been already operated before");
            //  e.printStackTrace();
        }

        /*Stream Iterate*/
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        streamIterated.forEach(System.out::println);

        //If you want to use the stream twice then we can use peek method of stream class
        //It will not consume the data so can be used as many times you want
        Stream<Integer> streamIteratedUsingPeek = Stream.iterate(0, n -> n + 2).limit(10);
        streamIteratedUsingPeek.peek(System.out::println).count();//Count is used for terminal operation


        // Get the stream
        Stream<String> stream = Stream.of("Raj", "For",
                "Rajesh", "A",
                "desktop", "Bhardwaj");

        // Since the stream is not being consumed
        // this will not throw any exception

        // Print the stream
        stream.filter(s -> s.toLowerCase().startsWith("r"))
                .peek(s -> System.out.println("Filtered value: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Uppercase value :" + s))
                .count();


    }
}
