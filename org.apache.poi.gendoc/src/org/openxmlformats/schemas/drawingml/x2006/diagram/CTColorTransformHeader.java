/*
 * XML Type:  CT_ColorTransformHeader
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_ColorTransformHeader(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTColorTransformHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTColorTransformHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcolortransformheadercbbbtype");
    
    /**
     * Gets a List of "title" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName> getTitleList();
    
    /**
     * Gets array of all "title" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] getTitleArray();
    
    /**
     * Gets ith "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName getTitleArray(int i);
    
    /**
     * Returns number of "title" element
     */
    int sizeOfTitleArray();
    
    /**
     * Sets array of all "title" element
     */
    void setTitleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] titleArray);
    
    /**
     * Sets ith "title" element
     */
    void setTitleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName title);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName insertNewTitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName addNewTitle();
    
    /**
     * Removes the ith "title" element
     */
    void removeTitle(int i);
    
    /**
     * Gets a List of "desc" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription> getDescList();
    
    /**
     * Gets array of all "desc" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] getDescArray();
    
    /**
     * Gets ith "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription getDescArray(int i);
    
    /**
     * Returns number of "desc" element
     */
    int sizeOfDescArray();
    
    /**
     * Sets array of all "desc" element
     */
    void setDescArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] descArray);
    
    /**
     * Sets ith "desc" element
     */
    void setDescArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription desc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription insertNewDesc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription addNewDesc();
    
    /**
     * Removes the ith "desc" element
     */
    void removeDesc(int i);
    
    /**
     * Gets the "catLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories getCatLst();
    
    /**
     * True if has "catLst" element
     */
    boolean isSetCatLst();
    
    /**
     * Sets the "catLst" element
     */
    void setCatLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories catLst);
    
    /**
     * Appends and returns a new empty "catLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories addNewCatLst();
    
    /**
     * Unsets the "catLst" element
     */
    void unsetCatLst();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "uniqueId" attribute
     */
    java.lang.String getUniqueId();
    
    /**
     * Gets (as xml) the "uniqueId" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueId();
    
    /**
     * Sets the "uniqueId" attribute
     */
    void setUniqueId(java.lang.String uniqueId);
    
    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId);
    
    /**
     * Gets the "minVer" attribute
     */
    java.lang.String getMinVer();
    
    /**
     * Gets (as xml) the "minVer" attribute
     */
    org.apache.xmlbeans.XmlString xgetMinVer();
    
    /**
     * True if has "minVer" attribute
     */
    boolean isSetMinVer();
    
    /**
     * Sets the "minVer" attribute
     */
    void setMinVer(java.lang.String minVer);
    
    /**
     * Sets (as xml) the "minVer" attribute
     */
    void xsetMinVer(org.apache.xmlbeans.XmlString minVer);
    
    /**
     * Unsets the "minVer" attribute
     */
    void unsetMinVer();
    
    /**
     * Gets the "resId" attribute
     */
    int getResId();
    
    /**
     * Gets (as xml) the "resId" attribute
     */
    org.apache.xmlbeans.XmlInt xgetResId();
    
    /**
     * True if has "resId" attribute
     */
    boolean isSetResId();
    
    /**
     * Sets the "resId" attribute
     */
    void setResId(int resId);
    
    /**
     * Sets (as xml) the "resId" attribute
     */
    void xsetResId(org.apache.xmlbeans.XmlInt resId);
    
    /**
     * Unsets the "resId" attribute
     */
    void unsetResId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader newInstance() {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
