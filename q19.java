// DAY 4
//Develop a simple grade system where marks are categorized into grades using a switch case.
public class q19 {
    public static void main(String[] args) {
        int marks = 85;
        switch(marks/10){
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}
