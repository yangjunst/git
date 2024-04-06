package learn.chapter01;

import java.io.File;
public class Demo02 {//22222
    public static void main(String[] args) {//1222
        File file = new File("E:\\hidden\\.git");
        System.out.println(file.isHidden());
        file = new File("E:\\hidden\\.git\\refs");//2222222
        System.out.println(file.isHidden());
    }
}
