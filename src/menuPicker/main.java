package menuPicker;

import java.util.Scanner;

public class main {

    public main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------欢迎使用抽菜系统----------");
            System.out.println("请输入您想选择的抽菜类型：");
            System.out.println("1.抽选三菜一汤");
            System.out.println("2.爸爸吃的菜");
            System.out.println("3.妈妈吃的菜");
            System.out.println("4.我吃的菜");
            System.out.println("0.结束程序");
            System.out.println("---------------------------------");
            //检测输入是否正确
            while (scanner.hasNextInt() == false) {
                System.out.println("输入错误，请使用数字进行选择");
                scanner.next();
            }
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("**************以下是今日的菜单**************");
                new pickFoodTypeOne();
                new pickFoodTypeTwo();
                new pickFoodTypeThree();
                new pickFoodTypeFour();
                System.out.println("*****************************************");
                System.out.println("1.继续选择");
                System.out.println("0.退出系统");

                //用户输入和输入检查
                if (check(scanner)) return;

            } else if (input == 2) {
                System.out.println("************以下是今日爸爸的菜单************");
                new fatherFood();
                System.out.println("****************************************");
                System.out.println("1.继续选择");
                System.out.println("0.退出系统");
                //用户输入和输入检查
                if (check(scanner)) return;
            } else if (input == 3) {
                System.out.println("************以下是今日妈妈的菜单************");
                new motherFood();
                System.out.println("****************************************");
                System.out.println("1.继续选择");
                System.out.println("0.退出系统");
                //用户输入和输入检查
                if (check(scanner)) return;
            } else if (input == 4) {
                System.out.println("************以下是今日我的菜单************");
                new sonFood();
                System.out.println("***************************************");
                System.out.println("1.继续选择");
                System.out.println("0.退出系统");
                //用户输入和输入检查
                if (check(scanner)) return;
            } else if (input == 0) {
                System.out.println("感谢使用抽菜系统，再见");
                return;
            } else {
                System.out.println("您输入了错误的数字，请重新输入");
                continue;
            }
        }
    }

    //此方法为检测用户输入是否正确，勿动！！
    private static boolean check(Scanner scanner) {
        while (true) {
            while (scanner.hasNextInt() == false) {
                System.out.println("输入错误，请使用数字进行选择");
                scanner.next();
            }
            int input = scanner.nextInt();
            if (input == 1) {
                break;
            } else if (input == 0) {
                System.out.println("感谢使用抽菜系统，再见");
                return true;
            } else {
                System.out.println("您输入了错误的数字，请重新输入");
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        main m = new main();
    }
}


