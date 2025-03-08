public class Main {
    public static void main(String[] args) {
        RedHeadDuck rd = new RedHeadDuck();
        System.out.println("---------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("---------------------");

        RubberDuck rb = new RubberDuck();
        System.out.println("---------------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("---------------------");

        MallardDuck md = new MallardDuck();
        System.out.println("---------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("---------------------");

        DecoyDuck dd = new DecoyDuck();
        System.out.println("---------------------");
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("---------------------");
    }
}
