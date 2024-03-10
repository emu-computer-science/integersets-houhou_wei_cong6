public class RunIntegerSets {
    public static void main(String[] args) {
        CollectSetsOfIntegers sets = new CollectSetsOfIntegers();
        UserInteraction interaction = new UserInteraction(sets);
        interaction.interact();
    }
}