package Othello.Engine;

public class ExampleSubclass extends Example {
    
    public void doSomething() {
        if (list != null) {
            for (String elem : list) {
                elem.hashCode();
            }
        }
    }
    
}
