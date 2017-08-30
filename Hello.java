

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");

        this.Onsiri();

        this.Krerk();
		this.Piyanat() ;
		this.Sujinno();
        this.Panjapoll();
		this.Adichart();
		this.Sittikorn();

    }

}

    
    private void Onsiri() {
        System.out.println("Trainer - Onsiri Homsup1");
        System.out.println("  Demo  - Onsiri Homsup2");
    }
	

	private void Piyanat(){
        System.out.println("  Demo  - Piyanat Kongkaew");
	}

	private void Sujinno() {
		System.out.println("Trainee - Sujinno.K, SE");
	}
			
    private void Panjapoll() {
        System.out.println("Trainee - Panjapol Lomarat, SSE");
    }

	private void Adichart() {
		System.out.println("Trainee - Adichart Chanhomhaun, SE");
	}
	
	private void Sittikorn() {
        System.out.println("Trainer - Sittikorn Chuensukprasong, SE");

	 private void Krerk() {
        System.out.println("Trainee - Piyaporn Eiamsakul, Miss");

    }

    
    public static void main(String [] argv) {
        new Hello();
    }
}
