abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    abstract public void display();

    public void performQuack() {
        quackBehaviour.quack();
    }
   public void performSwim() {
        swimBehaviour.swim();
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Red Head Duck!");
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
        flyBehaviour = new NoFly();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
}

class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new NoSwim();
        flyBehaviour = new NoFly();
    }

    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }
}

