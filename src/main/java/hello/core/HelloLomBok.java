package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLomBok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLomBok h= new HelloLomBok();
        h.setName("gd");
        System.out.printf(h.name);
    }
}
