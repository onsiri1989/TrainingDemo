

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
        this.Panjapoll();
		this.Adichart();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }

    private void Panjapoll() {
        System.out.println("Trainee - Panjapol Lomarat, SSE");
    }
	
	private void Adichart() {
		System.out.println("Trainee - Adichart Chanhomhaun, SE");
	}
    
    public static void main(String [] argv) {
        new Hello();
    }
}
