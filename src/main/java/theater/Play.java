package theater;

/**
 * Class representing a play.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}
