package menuPicker;

public class pickFoodTypeFour {

    String f1 = "鱼头汤";
    String f2 = "西红柿鸡蛋汤";
    String f3 = "紫菜汤";
    String f4 = "冬瓜虾仁汤";
    String f5 = "藕汤";
    String f6 = "酸菜汤";
    String f7 = "海带汤";
    String f8 = "茶树菇汤";
    String f9 = "";
    String f10 = "";

    public pickFoodTypeFour() {
        Random random = new Random();
        int num = random.pickANumber();
        //有几个菜就写大于几，如果有6个菜就是 num > 6
        if (num > 8) {
            new pickFoodTypeFour();
        } else {
            //System.out.println(num);
            System.out.print("菜品四类（汤）:");
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
