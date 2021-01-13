public class Game {
  // instance variables
  private String name;
  private String genre;
  private int likeRange;//How much the person likes from 1-5 1 being he hates it 5 being it is his favorite
  private boolean favorite;

  //------------------------------------------------//

  // constructor
  public Game(String n, String g, int l) {
    this.name = n;
    this.genre = g;
    this.likeRange = l;
  }//end constructor method

  public String getName(){
    return this.name;
  }
  public String getGenre(){
    return this.genre;
  }
  public int getRange(){
    return this.likeRange;
  }
  public boolean getFavorite(){
    return this.favorite;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setGenre(String genre){
    this.genre = genre;
  }
  public void isFavorite(){
    if(this.likeRange == 5){
      this.favorite = true;
    }
    else{
      this.favorite = false;
    }
  }
}
