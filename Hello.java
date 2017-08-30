

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Adichart();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
	
	private void Adichart() {
		System.out.println("Adichart Chanhomhaun, SE");
	}
    
    public static void main(String [] argv) {
        new Hello();
    }
}
