module com.datavisualization {
    requires java.desktop;  // For GUI components
    requires org.jfree.jfreechart;
    requires org.jfree.jcommon;

    // Expose packages to other modules if needed
    exports com.datavisualization;
}
