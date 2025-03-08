interface QuackBehaviour {
    void quack();
}

class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quacking!");
    }
}

class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak...");
    }
}
interface SwimBehaviour {
    void swim();
}

class Swim implements SwimBehaviour {
    public void swim() {
        System.out.println("Swimming in water!");
    }
}

class NoSwim implements SwimBehaviour {
    public void swim() {
        System.out.println("Can't swim!");
    }
}
interface FlyBehaviour {
    void fly();
}

class FlyWithWings implements FlyBehaviour {
    public void fly() {
        System.out.println("Flying high!");
    }
}

class NoFly implements FlyBehaviour {
    public void fly() {
        System.out.println("Can't fly!");
    }
}
