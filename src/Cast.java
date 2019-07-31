import java.util.Scanner;

public class Cast {

    public static void main(String[] args) {
//        double a = 5.52;
//        int i;
//        i = (int)a;
//        final float PI = 3.1416f;
//        final double Latitude,Lontitude;
//        Latitude =  100.1254;
//        Lontitude = 99.1564;
//
//        String s;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Name");
//        s = scan.next();
//        System.out.println(s);
//        System.out.println(Latitude);
//        System.out.println(Lontitude);
//        System.out.println("Value\t PI= "+ PI + "\n");
//        double r = Math.random();
//        byte d = (byte) (r*6);
//        System.out.println(d+1);
//        String +s = "15";
//        int d = Integer.parseInt(s);
//        System.out.println("covert string to int= "+ d*2);
//        s = Integer.toString(d);
//        System.out.println("convert int to string = " + s);
//        System.out.println( "convert int to base 16" + Integer.toHexString(d));
//        System.out.println("convert int to base 8 " + Integer.toOctalString(d));
//        System.out.println("convert int to base 2 "+ Integer.toBinaryString(d));
//
//        String login = "Admin";
//        boolean b = login.equals("Admin");
//        System.out.println(b);
//        b = (1>2) && (3>4);
//        System.out.println(b);
//        boolean x;
//        x = (1>0)? true:false;
//        System.out.println(x);
//        String s = "10";
//         int x = Integer.parseInt(s);
//        s = (x % 2==0)? "Even" : "Odd ";
//        System.out.println(s);

        Scanner scan = new Scanner(System.in);
        int withdraw;
        System.out.println("จำนวนเงินถอน : ");
        withdraw = scan.nextInt();

        int B1000 = (int) (withdraw / 1000);
        int remain = withdraw % 1000;

        int B500 = (int) (remain / 500);
        remain = remain % 500;
        int B100 = (int) (remain / 100);
        System.out.println("ธนบัตรที่ได้รับ : ");
        System.out.println("B1000 : " + B1000);
        System.out.println("B500 : " + B500);
        System.out.println("B100 : " + B100);
    }

    }


