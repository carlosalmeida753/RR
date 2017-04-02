import java.util.concurrent.ThreadLocalRandom;
import java.util.arrays;

public class premio{
	int mult;
	public getMult(){return this.mult;}
	public setMult(int i){this.mult=i;}
	
	public devolvepremio(this.getMult(), int aposta){return this.getMult()*aposta;}
}
public class Numero extends premio{
	int mult=36;
}
public class Pares extends premio{
	int mult=18;
}
public class Duzia extends premio{
	int mult=3;
}
public class Fila extends premio{
	int mult=3;
}
public class Metade extends premio{
	int mult=2;
}
public class Cor extends premio{
	int mult=2;
}

public class mesa{
	int mesa[];
	public string premios(int aposta){
		int i;
		for(i=0;i<36;i++) {
			
			mesa[i].devolve_premio(i}
	

public class Casa{
	int			i;
	Numero 		x;
	Cor 		c;
	Paridade 	p;
	Duzia		d;
	Metade		m;
	Fila		f;
	
	
	
	
	}
	
public class Jogo{
	int numerocalhou;
	Player p;
	
	public setNumeroCalhou( int x){
		this.numerocalhou=x;
	}
	public getNumeroCalhou(){
		return this.numerocalhou;
	}
	public setPlayer(Player _player){
		this.player = _player;
	}
	
	public jogo( Player _player){
		setPlayer(_player);
	}
	public rodarroda(){
		setNumeroCalhou(ThreadLocalRandom.current().nextInt(0,37);
		system.out.println("calhou" + this.numerocalhou + "seu merdao");
	}
	public distribuiFichas(Player p){
		p.getOndeAposta
	}
}

	

public class Player{
	int balance;
	int tipoFichas;
	int quantoaposta;
	Casa ondeAposta;
	
	public player(int _balance){
		this.setBalance(_balance);
	}
	public setBalance( int x){
		this.balance=x;
	}
	public getBalance(){
		return this.balance;
	}
	public setTipoFichas( int x){
		this.tipoFichas=x;
	}
	public getTipoFichas(){
		return this.tipoFichas;
	}
	public setQuantoAposta( int x){
		this.quantoaposta=x;
	}
	public getQuantoAposta(){
		return this.quantoaposta;
	}
	
	public setOndeAposta( int x){
		this.ondeAposta=x;
	}
	public getOndeAposta(){
		return this.ondeAposta;
	}
}

public static void main(String [] args){
	while(1){
		Scanner reader =new Scanner(System.in);
		Player player= new Player(Integer.parseInt(reader));
		
		Jogo jogo = new Jogo(player);
		
		reader =new Scanner(System.in);
		int ficha=Integer.parseInt(reader);
		Player.setTipoFichas(ficha);
		if (numero!=1 && numero!=2 && numero!=5 && numero!=10 && numero!=20 ){
			system.out.println("mete um numero de fichas bem");
			continue;
		}
		
		reader =new Scanner(System.in);
		int numero=Integer.parseInt(reader);
		if (numero>36 || numero<0){
			system.out.println("mete um numero bem");
			continue;
		}
		
		
		reader =new Scanner(System.in);
		int fichanumber=Integer.parseInt(reader);
		player.aposta=fichanumber*ficha;
		if(player.getAposta()>player.getBalance())
			player.setAposta(player.getBalance());
		jogo.rodarroda();
		
		
		
		
	}
}