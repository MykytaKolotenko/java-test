package test1;

public class ttt {
    public static void main(String[] args) {

        Dog x = new Poodle("one");

        x.info();
    }
}


class Dog {
    String name, color;

    void info() {
        
    }

}

class Poodle extends Dog {
    String type;

    public Poodle(String type) {
        this.type = type;
    }

    void info() {
        System.out.println(this.type);
    }
}
