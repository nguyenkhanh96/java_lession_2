import java.util.Scanner;

public class MainStudent {
    public void printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng chọn số");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("input student");
                break;
            case 2:
                System.out.println("DisplayDetail : 1 save, 2 cancel");
                int status = sc.nextInt();
                switch (status) {
                    case 1:
                        // Save
                        System.out.println("save project");
                        break;
                    case 2:
                        // Save
                        System.out.println("cancel project");
                        break;
                }
                break;
            case 3:
                System.out.println("show all list Student");
                break;
            case 4:
                System.out.println("Exit");
                break;
        }
    }
}
