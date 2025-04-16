package singleton;

// This is the main class that demonstrates the usage of the DesignSystem singleton.
public class Main {
    public static void main(String[] args) {
      
        // Here we are creating two instances of the DesignSystem class, defined as 'ds' and 'ds2'. 
        // Even if we are creating two instances, they will always refer to the same object in memory, ensuring that all UI components use the same design tokens.
        DesignSystem ds = DesignSystem.getInstance();
        DesignSystem ds2 = DesignSystem.getInstance();

        // Here we're using design system's getters to access the design tokens.
        // This is how we can use the design system in our application. We can access the design tokens through the getters defined in the DesignSystem class.
        // This ensures that we are using the same design tokens throughout the application, maintaining consistency in design.
        System.out.println("Getting design system instance...");
        System.out.println("Primary color: " + ds.getColors().primary);
        System.out.println("Secondary color: " + ds.getColors().secondary);
        System.out.println("Background color: " + ds.getColors().background);
        System.out.println("Font family: " + ds.getTypography().fontFamily);
        System.out.println("Base font size: " + ds.getTypography().baseFontSize);
        System.out.println("Heading font size: " + ds.getTypography().headingFontSize);
        System.out.println("Large spacing: " + ds.getSpacing().large + "\n");

        // Here is our test to check if the two instances are really the same.
        System.out.println("Now let's check if both instances are really the same...");
        System.out.println("Are both instances the same? " + (ds == ds2));
        System.out.println("The meaning is that both instances are the same object in memory and any update will propagate through the system.");

    }
}
