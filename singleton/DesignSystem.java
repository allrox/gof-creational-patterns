package singleton;

// This class defines UI application's design system. It uses the Singleton pattern to ensure that only one instance of the design system exists throughout the application.
// Even if the application has multiple UI components, they will all refer to the same design system instance, ensuring consistency in design tokens across the application.
// This is the source of application design system tokens.
// Importante: Even if this class is instantiated multiple times, it will always refer to the same object, ensuring that all UI components use the same design tokens.

public class DesignSystem {
    
    // Private constructor to prevent instantiation from outside the class.
    // This ensures that the class cannot be instantiated directly, enforcing the Singleton pattern.
    
    // Static variable to hold the single instance of the class.
    private static DesignSystem instance;

    // Final variables to hold the design tokens. Declaring them as final ensures that they are immutable after initialization.
    private final ColorPalette colors;
    private final Typography typography;
    private final Spacing spacing;

    // Private constructor to initialize the design tokens. Defined as private, it can only be called from within the class itself.
    private DesignSystem(){
        colors = new ColorPalette();
        typography = new Typography();
        spacing = new Spacing();
    }

    // Static method to provide access to the single instance of the class.
    public static DesignSystem getInstance() {
        if (instance == null) {
            instance = new DesignSystem();
        }
        return instance;
    }

    // Here are our design tokens getters. These methods provide access to the design tokens defined in the class. Notice that they're read-only what grants consistency in the design system. 
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
