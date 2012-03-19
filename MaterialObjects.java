enum Material{
	bronze,
	gold,
	marble,
	silver,
	wood;
}

abstract class MaterialObject{
	Material material;
}

class Ball extends MaterialObject {
	Ball(Material material){
		this.material = material;
	}
}

class Coin extends MaterialObject {
	Coin(Material material){
		this.material = material;
	}
}

class Ring extends MaterialObject {
	Ring(Material material){
		this.material = material;
	}
}

class MaterialObjects{
	public static void main(String args[]){
		Ball ball = new Ball(Material.wood);
		Coin coin = new Coin(Material.silver);
		Ring ring = new Ring(Material.marble);

		System.out.println(ball.material);
		System.out.println(coin.material);
		System.out.println(ring.material);

	}
}