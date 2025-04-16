package singleton;

public class Main {
    public static void main(String[] args) {
      
        DesignSystem ds = DesignSystem.getInstance();
        DesignSystem ds2 = DesignSystem.getInstance();

        System.out.println("Getting design system instance...");
        System.out.println("Primary color: " + ds.getColors().primary);
        System.out.println("Secondary color: " + ds.getColors().secondary);
        System.out.println("Background color: " + ds.getColors().background);
        System.out.println("Font family: " + ds.getTypography().fontFamily);
        System.out.println("Base font size: " + ds.getTypography().baseFontSize);
        System.out.println("Heading font size: " + ds.getTypography().headingFontSize);
        System.out.println("Large spacing: " + ds.getSpacing().large + "\n");

        System.out.println("Now let's check if both instances are really the same...");
        System.out.println("Are both instances the same? " + (ds == ds2));
        System.out.println("The meaning is that both instances are the same object in memory and any update will propagate through the system.");

    }
}
