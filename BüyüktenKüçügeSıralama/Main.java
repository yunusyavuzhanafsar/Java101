import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//değişkenleri atayalım
        int a, b, c;
//kullanıcıdan verileri alalım
        Scanner kong = new Scanner(System.in);

        System.out.print("a sayısını giriniz : ");
        a = kong.nextInt();

        System.out.print("b sayısını giriniz : ");
        b = kong.nextInt();

        System.out.print("c sayısını giriniz : ");
        c = kong.nextInt();
        //karşılaştırma yapalım
        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }

            } else if((b > a) && (b > c)) {

                if (a > c) {
                    System.out.println("b>a>c");
                } else {
                    System.out.println("b>c>a");
                }
            } else {
            }
            if ((c > b) && (c > a)) {
                {
                    if (a > b) {
                        System.out.println("c>a>b");
                    } else {
                        System.out.println("c>b>a");
                    }
                }


            }


        }
    }



