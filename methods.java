class Main {
    public static void main(String[] args) throws InterruptedException {
        // method = a block of reusable code that is executed when called ()
        System.out.println(ageCheck(18));
    }
    static void printHappyBirthday() {
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number) {
        return number * number;
    }
    static double cube(double number) {
        return number * number * number;
//        return square(number) * number;
    }
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age) {
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
        // 1
        //  if(age >= 18) return true;
        // return false;

        // 2
        // return (age >= 18);
    }
}