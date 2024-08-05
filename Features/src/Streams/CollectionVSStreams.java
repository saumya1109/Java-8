package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionVSStreams {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("steve");
        names.add("jenny");

        names.remove("jenny");

        System.out.println(names);
        System.out.println(names.stream().collect(Collectors.toList()));


        for(String name :names){
            System.out.println(name);
        }

        /*for(String name :names){
            System.out.println(name);
        }*/

        names.stream().forEach((name)-> System.out.println(name));

        //Unless the terminal process in invoked the streams doesn't start

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
       // nameStream.forEach(System.out::println); <----- stream has already been operated upon or closed
    }
}
