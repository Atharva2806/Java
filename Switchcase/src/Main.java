public class Main
{
    static public void main(String args[]) {
        System.out.println("1->Hellow\n 2->Welecome\n 3-> How are you\n 4->Bye\n\n");
        String chs = "12";

//        switch (chs)
//        {
//            case 1:
//                System.out.println("Hellow");
//                break;
//            case 2:
//                System.out.println("Welcome");
//                break;
//            case 3:
//                System.out.println("How are you?");
//            default:
//                System.out.println("Invalid choice");
//                break;
//            }
        switch(chs)
        {
            case "11" -> System.out.println("Hellow");
            case "12"->System.out.println("Welcome");
            case "13"->System.out.println("How are you?");
            case "14"->System.out.println("Invalid choice");
            default->System.out.println("Invalid choice");
        }
    }
}