/*
 * XML Type:  CT_Bar3DChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Bar3DChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTBar3DChart extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBar3DChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbar3dcharte4c2type");
    
    /**
     * Gets the "barDir" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir getBarDir();
    
    /**
     * Sets the "barDir" element
     */
    void setBarDir(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir barDir);
    
    /**
     * Appends and returns a new empty "barDir" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir addNewBarDir();
    
    /**
     * Gets the "grouping" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping getGrouping();
    
    /**
     * True if has "grouping" element
     */
    boolean isSetGrouping();
    
    /**
     * Sets the "grouping" element
     */
    void setGrouping(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping grouping);
    
    /**
     * Appends and returns a new empty "grouping" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping addNewGrouping();
    
    /**
     * Unsets the "grouping" element
     */
    void unsetGrouping();
    
    /**
     * Gets the "varyColors" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getVaryColors();
    
    /**
     * True if has "varyColors" element
     */
    boolean isSetVaryColors();
    
    /**
     * Sets the "varyColors" element
     */
    void setVaryColors(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean varyColors);
    
    /**
     * Appends and returns a new empty "varyColors" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewVaryColors();
    
    /**
     * Unsets the "varyColors" element
     */
    void unsetVaryColors();
    
    /**
     * Gets a List of "ser" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer> getSerList();
    
    /**
     * Gets array of all "ser" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer[] getSerArray();
    
    /**
     * Gets ith "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer getSerArray(int i);
    
    /**
     * Returns number of "ser" element
     */
    int sizeOfSerArray();
    
    /**
     * Sets array of all "ser" element
     */
    void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer[] serArray);
    
    /**
     * Sets ith "ser" element
     */
    void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer ser);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer insertNewSer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer addNewSer();
    
    /**
     * Removes the ith "ser" element
     */
    void removeSer(int i);
    
    /**
     * Gets the "dLbls" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls getDLbls();
    
    /**
     * True if has "dLbls" element
     */
    boolean isSetDLbls();
    
    /**
     * Sets the "dLbls" element
     */
    void setDLbls(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls dLbls);
    
    /**
     * Appends and returns a new empty "dLbls" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls addNewDLbls();
    
    /**
     * Unsets the "dLbls" element
     */
    void unsetDLbls();
    
    /**
     * Gets the "gapWidth" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount getGapWidth();
    
    /**
     * True if has "gapWidth" element
     */
    boolean isSetGapWidth();
    
    /**
     * Sets the "gapWidth" element
     */
    void setGapWidth(org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount gapWidth);
    
    /**
     * Appends and returns a new empty "gapWidth" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount addNewGapWidth();
    
    /**
     * Unsets the "gapWidth" element
     */
    void unsetGapWidth();
    
    /**
     * Gets the "gapDepth" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount getGapDepth();
    
    /**
     * True if has "gapDepth" element
     */
    boolean isSetGapDepth();
    
    /**
     * Sets the "gapDepth" element
     */
    void setGapDepth(org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount gapDepth);
    
    /**
     * Appends and returns a new empty "gapDepth" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount addNewGapDepth();
    
    /**
     * Unsets the "gapDepth" element
     */
    void unsetGapDepth();
    
    /**
     * Gets the "shape" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTShape getShape();
    
    /**
     * True if has "shape" element
     */
    boolean isSetShape();
    
    /**
     * Sets the "shape" element
     */
    void setShape(org.openxmlformats.schemas.drawingml.x2006.chart.CTShape shape);
    
    /**
     * Appends and returns a new empty "shape" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTShape addNewShape();
    
    /**
     * Unsets the "shape" element
     */
    void unsetShape();
    
    /**
     * Gets a List of "axId" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getAxIdList();
    
    /**
     * Gets array of all "axId" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] getAxIdArray();
    
    /**
     * Gets ith "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getAxIdArray(int i);
    
    /**
     * Returns number of "axId" element
     */
    int sizeOfAxIdArray();
    
    /**
     * Sets array of all "axId" element
     */
    void setAxIdArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] axIdArray);
    
    /**
     * Sets ith "axId" element
     */
    void setAxIdArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt axId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt insertNewAxId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axId" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewAxId();
    
    /**
     * Removes the ith "axId" element
     */
    void removeAxId(int i);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
