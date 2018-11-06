package Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Map<String, String>> students = new ArrayList<>();
        Map<String, String> student1 = new HashMap<>();
        student1.put("name", "Merfy");
        student1.put("lastname", "Jiji");
        student1.put("age", "27");
        student1.put("book", "JS");
        students.add(student1);
        System.out.println(students);
        Map<String, String> student2 = new HashMap<>();
        student2.put("name", "Jo");
        student2.put("lastname", "Long");
        student2.put("age", "24");
        student2.put("book", "Java");

        students.add(student2);
        System.out.println(students);
        List<Map<String, String>> filteredMap1 = students.stream().filter(x -> x.get("name").contains("e")).collect(Collectors.toList());
        System.out.println(filteredMap1);
        Map<String, String> foundStudent = students.stream().filter(x -> x.get("age").startsWith("2")).findFirst().get();
        System.out.println(foundStudent);
        List<String> names = students.stream().map(x -> x.get("name")).collect(Collectors.toList());
        System.out.println(names);
        long count = students.stream().filter(x->x.get("book").equals("Java")).count();
        System.out.println(count);
    }
}
