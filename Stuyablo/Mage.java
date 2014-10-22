import java.util.*;
import java.io.*;

public class Mage extends BaseChar {

    Random thing = new Random();

    
    public Mage(int h, int m, int a, int d, int s, int ac, int c, String n, String w){
	 super(h,m,a,d,s,ac,c,n,w);
    }
    public String spell(Monster other, String userInput){
	if(userInput.equals( "1") && this.getACC() > 20 ) {
	    if ((this.getMP() - 20) < 0) {
		return("Not enough mana!");
	    } else {
		other.setHP(other.getHP() - 20);
		this.setMP(this.getMP() - 20);
		return(this + " shot a fireball at " + other + ". " + other + " lost 20 HP." );
	    }
	}else if(userInput.equals("2") && this.getACC() > 0) {
	    if ((this.getMP() - 30) < 0) {
		return("Not enough mana!");
	    } else {
		other.setHP(other.getHP() - 20);
		this.setMP(this.getMP() - 30);
		return(this + " electrified " + other + ". " + other + " lost 20 HP.");
	    }
	}else if(userInput.equals("3") && this.getACC() > 20) {
	    if ((this.getMP() - 40) < 0) {
		return("Not enough mana!");
	    } else {
	    other.setHP(other.getHP() - 30);
	    this.setMP(this.getMP() - 40);
	    return(this + " froze " + other + ". " + other + " lost 30 HP.");
	    }
	} else{
	    this.setMP(this.getMP()-30);
	    return "The spell fizzled and died";
	}
    }	

}
