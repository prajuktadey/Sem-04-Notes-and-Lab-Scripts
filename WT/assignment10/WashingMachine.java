interface Motor {
    int capacity = 0;
    
    void run();
    void consume();
}

class WashingMachine implements Motor {
    
    public void run() {}
    
    public void consume() {}

    public static void main(String[] args)
    {
        WashingMachine obj = new WashingMachine();
        System.out.println("The capacity is: " + obj.capacity);
    }
}


