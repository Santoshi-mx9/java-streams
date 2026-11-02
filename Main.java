import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.function.Predicate;

/*public class Main{
    public static void main(String[] s){
        List<Integer> nums=Arrays.asList(4,5,6,7,8,9);
        //nums.stream->create a stream of data
        Stream<Integer> data=nums.stream();
        long count=data.count();
        System.out.println(count);
        //data.forEach(n-> System.out.println(n));IllegalStateException: stream has already been operated upon or closed
    }

}*/
public class Main{
    public static void main(String[] s){
        List<Integer> nums=Arrays.asList(4,12,13,5,6,7,8,9);
        //nums.stream->create a stream of data
//        Stream<Integer> data=nums.stream();
//        Stream<Integer> sorteddata=data.sorted();
//        sorteddata.forEach(n-> System.out.println(n));

//        Stream<Integer> data=nums.stream();
//        Stream<Integer> mappeddata=data.map(n->n*2);
//        mappeddata.forEach(n-> System.out.println(n));
//         nums.stream().map(n->n*2).forEach(n-> System.out.println(n));

        //Predicate<Integer> pre= n->n%2==1;

//parallelStream- sometimes yiur values are dependent on earlier operation at that time avoid parallel stream because it does operation parar
        int result=nums.stream()//1
                .filter(n->n%2==1)//.filter(n->n%2==1)
                .sorted()//2
                .map(n->n*2)//3
                .reduce(0,(c,e)->c+e);//returns a value 0->starting value c->carry e->new value
                //.forEach(n-> System.out.println(n));//it has 3 streams
        System.out.println(result);


    }

}