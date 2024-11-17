import java.util.*;

class pet{
	Scanner in = new Scanner(System.in);
	int hunger;
	int hapiness;
	int energy;
	String name;
	
	pet(){
		name = "pet";
		hunger = 50;
		hapiness = 50;
		energy = 50;
	}
	void feed(int feeding){
		if(feeding == 1) {
			hunger += 10;
			System.out.println("You fed the pet. The pet's hunger is " + hunger);
		}
		else {
			System.out.println("You did not feed the pet. The pet's hunger is " + hunger);
			
		}
	}
	void play(int playing) {
		if(playing == 1) {
			hapiness += 10;
			System.out.println("You played with the pet. The pet's hapiness is " + hapiness + " and it's hunger is " + hunger);
		}
		else {
			System.out.println("You did not play wiht the pet");
		}
	}
	void sleep(int sleeping) {
		energy += 10;
		if(sleeping == 1) {
			System.out.println("The pet is well rested. It's energy is " + energy);
			}else {
			System.out.println("The pet did not sleep");
		}
		
	}
	void check(int checking) {
		if(checking == 1) {
			System.out.println("Name: " + name);
			System.out.println("Hunger: " + hunger);
			System.out.println("Hapiness: " + hapiness);
			System.out.println("Energy: " + energy);
		}
		else {
			System.out.println("You changed your mind.");
		}
	}
	void cname(int cname) {
		if(cname == 1) {
			System.out.println("Enter a new name for your pet");
			name = in.next();
			System.out.println("Your pet's new name is: "+ name);
		}else {
			System.out.println("You changed your mind");		}
	}
	void checks() {
		if(hunger == 0) {
			System.out.println("Your pet died of hunger");
			gameover();
		}
		if(hapiness == 0) {
			System.out.println("Your pet left cause it was unhappy");
			gameover();
		}
		if(energy == 0) {
			System.out.println("Your pet is sad and won't look at you anymore");
			gameover();
		}
		if(hunger == 100) {
			System.out.println("Your pet ate too much and fell asleep");
			hunger = 10;
		}
		if(hapiness == 100) {
			System.out.println("Your pet is spoiled");
			hapiness = 10;
		}
		if(energy == 100) {
			System.out.println("Your pet won't stop barking");
			energy = 10;
		}
	}
	void gameover(){
		System.out.println("Game over. Thanks for playing");
		System.exit(0);
	}
}

public class tomadachi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		pet p = new pet();
		while(true) {
			System.out.println("What do you want to do with the pet? 1 for feed, 2 for play, 3 for sleep, 4 to see stats, 5 to change name");
			int c = input.nextInt();
			if(c == 1) {
				System.out.println("Feed the pet? 1 for yes, 0 for no");
				int feeding = input.nextInt();
				p.feed(feeding);
			}
			else if(c == 2) {
				System.out.println("Play with pet? 1 for yes, 0 for no");
				int playing = input.nextInt();
				p.play(playing);
			}
			else if(c == 4) {
				System.out.println("See pet's stats? 1 for yes, 0 for no");
				int checking = input.nextInt();
				p.check(checking);
			}
			else if(c == 5) {
				System.out.println("Change pet's name? 1 for yes, 0 for no");
				int cname = input.nextInt();
				p.cname(cname);
			}
			else {
				System.out.println("Put pet to bed? 11 for yes, 0 for no");
				int sleeping = input.nextInt();
				p.sleep(sleeping);
			}
			p.checks();
		}
	}

}
