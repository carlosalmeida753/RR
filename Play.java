import java.util.concurrent.ThreadLocalRandom;

public class Play {
	int numerocalhou;
	Player p;
	
	public void setNumeroCalhou( int x){
		this.numerocalhou=x;
	}
	public int getNumeroCalhou(){
		return this.numerocalhou;
	}
	public void setPlayer(Player _player){
		this.p = _player;
	}
	
	public void jogo(Player _player){
		setPlayer(_player);
	}
	public void rodarroda(){
		setNumeroCalhou(ThreadLocalRandom.current().nextInt(0,37));
		System.out.println("calhou" + this.numerocalhou + "seu merdao");
	}
	public void distribuiFichas(Player p){
		p.getOndeAposta();
	}
}
