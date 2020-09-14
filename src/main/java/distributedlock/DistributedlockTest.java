package distributedlock;

import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangze
 * @create 2020-09-02 上午9:59
 */

@Data
public class DistributedlockTest {

    private String name;

    private List<String> list;



    public static void main(String[] args) {
//        List<DistributedlockTest> list = new ArrayList<DistributedlockTest>(){{
//            add(new DistributedlockTest("a",1));
//            add(new DistributedlockTest("b",2));
//            add(new DistributedlockTest("c",1));
//            add(new DistributedlockTest("d",2));
//            add(new DistributedlockTest("e",1));
//            add(new DistributedlockTest("f",2));
//            add(new DistributedlockTest("g",1));
//            add(new DistributedlockTest("h",2));
//
//        }};
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            DistributedlockTest e = list.get(i);
//            System.out.println(e.name);
//            if (e.age==2){
//                System.out.println(e);
//
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(new ArrayList<>().size());
//         DistributedlockTest test = new DistributedlockTest();
//         System.out.println(CollectionUtils.isEmpty(test.getList()));
        List<String> list = null;
        if (CollectionUtils.isEmpty(list) || list.size() != 1){
            System.out.println("A");
            System.out.println(list);

        }

    }



}
