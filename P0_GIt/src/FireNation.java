public class FireNation extends Nation {
    String uniqueUnit;
    int numofUnits;

    public FireNation(String name, int population, String uniqueUnit, int numofUnits) {
        super(name, population);
        this.uniqueUnit = uniqueUnit;
        this.numofUnits = numofUnits;
    }

    public String toString() {
        String str = super.toString();

            str += "It has " + numofUnits + " unique units of " +uniqueUnit + " . ";


        return str;
    }
}
