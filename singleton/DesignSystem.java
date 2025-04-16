package singleton;

public class DesignSystem {
    
    private static DesignSystem instance;
    private final ColorPalette colors;
    private final Typography typography;
    private final Spacing spacing;

    private DesignSystem(){
        colors = new ColorPalette();
        typography = new Typography();
        spacing = new Spacing();
    }

    public static DesignSystem getInstance() {
        if (instance == null) {
            instance = new DesignSystem();
        }
        return instance;
    }

    public ColorPalette getColors() {
        return colors;
    }

    public Typography getTypography() {
        return typography;
    }

    public Spacing getSpacing() {
        return spacing;
    }

}
