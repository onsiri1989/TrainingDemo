

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
        this.Panjapoll();
		this.Adichart();
		this.Sittikorn();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("  Demo  - Krerk Piromsopa, Ph.D.");
    }
	
    private void Panjapoll() {
        System.out.println("Trainee - Panjapol Lomarat, SSE");
    }
	
	private void Adichart() {
		System.out.println("Trainee - Adichart Chanhomhaun, SE");
	}
	
	private void Sittikorn() {
        System.out.println("Trainer - Sittikorn Chuensukprasong, Software Engineer.");
        System.out.println("  Demo  - Sittikorn Chuensukprasong, Software Engineer.");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}
