package demo.generic;

import lombok.Data;

/**
 * 泛型类
 * @param <T>
 * @param <N>
 */
@Data
public class GenericClass2Example<T,N> {
    //member这个成员变量的类型为T,T的类型由外部指定
    private T member;

    public GenericClass2Example(){

    }
    //泛型构造方法形参member的类型也为T，T的类型由外部指定
    public GenericClass2Example(T member){
        this.member = member;
    }
    public T handleSomething(T target){
        return target;
    }
    public String sayHello(String name){
        return "Hello " + name;
    }
    public static <T,N> void printArray(T[] inputArray,N[] inputArray2){
        for (T element : inputArray){
            System.out.printf("%s", element);
            System.out.printf(" ");
        }

        for (N element : inputArray2){
            System.out.printf("%s", element);
            System.out.printf(" ");
        }
        System.out.println();
    }
}
