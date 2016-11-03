class HumanFactory {
  public static Human getHuman(String greeting) {
    if (greeting.equals("French"))
      return new FrenchHuman();
    else if (greeting.equals("German"))
      return new GermanHuman();
    else if (greeting.equals("Portuguese"))
      return new PortugueseHuman();

    return null;
    //Not 100% sure why I have to return null but it wont work otherwise. Am I not stating I'm returning a Human object?
  }
}