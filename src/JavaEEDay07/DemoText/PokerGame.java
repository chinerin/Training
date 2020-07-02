package JavaEEDay07.DemoText;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @PackageName:JavaEEDay07.DemoText
 * @ClassName:PokerGame
 * @Description: 扑克牌游戏
 * @author: CK
 * @data: 2020/7/2 17:14
 */
public class PokerGame {
    public static void main(String[] args) {
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] colors = {"♥", "♠", "♣", "♦"};

        ArrayList<String> arrayList = new ArrayList<>();
        for (String number : numbers) {
            for (String color : colors) {
                arrayList.add(color + number);
            }
        }

        arrayList.add("wu");
        arrayList.add("wa");
        Collections.shuffle(arrayList);

        ArrayList<String> bottle = new ArrayList<>();
        ArrayList<String> menber1 = new ArrayList<>();
        ArrayList<String> menber2 = new ArrayList<>();
        ArrayList<String> menber3 = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= arrayList.size() - 3){
                bottle.add(arrayList.get(i));
            }else if (i % 3 == 0){
                menber1.add(arrayList.get(i));
            }else if (i % 3 == 1){
                menber2.add(arrayList.get(i));
            }else {
                menber3.add(arrayList.get(i));
            }
        }
        System.out.println("bottle:" + bottle);
        System.out.println("menber1:" + menber1);
        System.out.println("menber2:" + menber2);
        System.out.println("menber3:" + menber3);
    }
}
