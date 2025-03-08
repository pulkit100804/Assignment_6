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
