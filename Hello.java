

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
        this.Panjapoll();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }

    private void Panjapoll() {
        System.out.println("Trainee - Panjapol Lomarat, SSE");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}
