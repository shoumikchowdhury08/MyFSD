package Course2_Module6.GPS;

public class Cellphone {
    String name;
    String brandName;

    /*
    WARNING: Do not touch the code above this
    TODO-1: Introduce has a relationship with GlobalPositioningSystem
    TODO-2: Create a parameterized constructor with parameters name, brandName and globalPositioningSystem
    */
    GlobalPositioningSystem version;
    Cellphone( String name, String brandName, GlobalPositioningSystem version) {
        this.brandName = brandName;
        this.name = name;
        this.version = version;
    }

    //WARNING: Do not touch the code below this
    public String getName() {
        return name;
    }
}
