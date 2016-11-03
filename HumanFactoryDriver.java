public class HumanFactoryDriver {
  public static void main(String[] args) {
    Human human = HumanFactory.getHuman("French");
    human.speak();

    human = HumanFactory.getHuman("German");
    human.speak();

    human = HumanFactory.getHuman("Portuguese");
    human.speak();
  }

}