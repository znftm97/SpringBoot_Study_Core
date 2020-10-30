package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int num;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("jh");
        helloLombok.setNum(11);

        System.out.println("name : " + helloLombok.getName());
        System.out.println("name : " + helloLombok.getNum());
        System.out.println("helloLombok = " + helloLombok);
    }
}
