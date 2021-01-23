public class GameDriver{
  public static void main(String[] args){
    Game person1 = new Game("Valorant","FPS", 5);

    System.out.println(person1.getName());
    System.out.println(person1.getGenre());
    System.out.println(person1.getRange());
    System.out.println(person1.isFavorite());

    person1.setName("CSGO");
    System.out.println(person1.getName());

    Game person2 = new Game("Chess","PuzZle", 4);

    System.out.println(person2.getName());
    System.out.println(person2.getGenre());
    System.out.println(person2.isFavorite());
    person2.giveRecomended();

    Game person3 = new Game("Cyberpunk 2077", "RPG", 3);
    person3.giveRecomended();
  }
}
