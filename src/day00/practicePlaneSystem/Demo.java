package src.day00.practicePlaneSystem;

public class Demo {
    public static void main(String[] args) {

        Airplane planea1 = new Airplane(40,40,50,40,1);
        Bigplane planeb1 = new Bigplane(300,20,150,180,2);
        Bullet bullet01 = new Bullet(300,500,10,20,5);
        Hero hero = new Hero(250,600,150,150);
        Sky sky = new Sky(0,0,560,800,0.8);


        planea1.move();
        System.out.println(planea1);
        planea1.move();
        System.out.println(planea1);
        System.out.println(planea1.image.getImageLoadStatus());

        planeb1.move();
        System.out.println(planeb1);
        planeb1.move();
        System.out.println(planeb1);
        System.out.println(planeb1.image.getImageLoadStatus());

        bullet01.move();
        System.out.println(bullet01);
        bullet01.move();
        System.out.println(bullet01);
        System.out.println(bullet01.image.getImageLoadStatus());

        sky.move();
        System.out.println(sky);
        sky.move();
        System.out.println(sky);
        System.out.println(sky.image.getImageLoadStatus());

        hero.move(200,300);
        System.out.println(hero);
        System.out.println(hero.image.getImageLoadStatus());




    }
}
