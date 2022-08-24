package menuPicker;

public class motherFood {
    String f1 = "粉丝";
    String f2 = "黄瓜";
    String f3 = "胡萝卜炒鸡蛋";
    String f4 = "";
    String f5 = "";
    String f6 = "";
    String f7 = "";
    String f8 = "";
    String f9 = "";
    String f10 = "";

    public motherFood() {
        Random random = new Random();
        int num = random.pickANumber();
        //有几个菜就写大于几，如果有6个菜就是 num > 6
        if (num > 3) {
            new motherFood();
        } else {
            //System.out.println(num);
            System.out.print("妈妈的菜:");
            switch (num) {
                case 1:
                    print(f1);
                    break;
                case 2:
                    print(f2);
                    break;
                case 3:
                    print(f3);
                    break;
                case 4:
                    print(f4);
                    break;
                case 5:
                    print(f5);
                    break;
                case 6:
                    print(f6);
                    break;
                case 7:
                    print(f7);
                    break;
                case 8:
                    print(f8);
                    break;
                case 9:
                    print(f9);
                    break;
                case 10:
                    print(f10);
                    break;
            }
        }
    }

    private void print(String f) {
        System.out.println(f);
    }
}
