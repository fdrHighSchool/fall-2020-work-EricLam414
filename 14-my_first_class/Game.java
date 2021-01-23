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
  public void setName(String name){
    this.name = name;
  }
  public void setGenre(String genre){
    this.genre = genre;
  }
  public boolean isFavorite(){
    if(this.likeRange == 5){
      return true;
    }
    else{
      return false;
    }
  }
  public void giveRecomended(){
    String genre = this.genre.toLowerCase();
    if(genre.equals("fps")){
      System.out.println("Some recomended FPS games: CSGO, Valorant, Call of Duty, or Team Fortress 2");
    }
    else if (genre.equals("puzzle")){
        System.out.println("Some recomended Puzzle games: Tetris, Sudoku, 2048, or Mahjong");
    }
    else if (genre.equals("sandbox")){
        System.out.println("Some recomended Sandbox games: Minecraft, Roblox, Terraria and Growtopia ");
    }
    else{
      System.out.println("Sorry, we can not find any recomended games for your genre");
    }
  }
}
