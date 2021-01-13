public class GameDriver{
  public static void main(String[] args){
    Game person1 = new Game("Valorant","FPS", 4);

    System.out.println(person1.getName());
    System.out.println(person1.getGenre());
    System.out.println(person1.getRange());
    System.out.println(person1.getFavorite());

    person1.setName("CSGO");
    System.out.println(person1.getName());
  }
}
