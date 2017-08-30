

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
<<<<<<< HEAD
        this.Onsiri();
=======
        this.Krerk();
        this.Panjapoll();
		this.Adichart();
		this.Sittikorn();
>>>>>>> 17a3c08f4280d045c476b2d95e2a144d585a4abd
    }
    
    private void Onsiri() {
        System.out.println("Trainer - Onsiri Homsup");
        System.out.println("  Demo  - Onsiri Homsup2");
    }
	
    private void Panjapoll() {
        System.out.println("Trainee - Panjapol Lomarat, SSE");
    }
	
	private void Adichart() {
		System.out.println("Trainee - Adichart Chanhomhaun, SE");
	}
	
	private void Sittikorn() {
        System.out.println("Trainer - Sittikorn Chuensukprasong, SE");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}
