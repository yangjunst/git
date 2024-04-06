package learn.chapter01;

import learn.beans.Apple;

import java.util.Collections;
import java.util.Comparator;

import static learn.consts.Constant.inventory;
import static learn.utils.Util.display;
public class Demo01 {//11
    public static void sort1() {//11
        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());//Author  

            }
        });
    }
}
