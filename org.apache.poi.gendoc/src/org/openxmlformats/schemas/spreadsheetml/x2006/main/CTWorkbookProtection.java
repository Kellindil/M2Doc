/*
 * XML Type:  CT_WorkbookProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_WorkbookProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTWorkbookProtection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTWorkbookProtection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctworkbookprotection56bctype");
    
    /**
     * Gets the "workbookPassword" attribute
     */
    byte[] getWorkbookPassword();
    
    /**
     * Gets (as xml) the "workbookPassword" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetWorkbookPassword();
    
    /**
     * True if has "workbookPassword" attribute
     */
    boolean isSetWorkbookPassword();
    
    /**
     * Sets the "workbookPassword" attribute
     */
    void setWorkbookPassword(byte[] workbookPassword);
    
    /**
     * Sets (as xml) the "workbookPassword" attribute
     */
    void xsetWorkbookPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex workbookPassword);
    
    /**
     * Unsets the "workbookPassword" attribute
     */
    void unsetWorkbookPassword();
    
    /**
     * Gets the "revisionsPassword" attribute
     */
    byte[] getRevisionsPassword();
    
    /**
     * Gets (as xml) the "revisionsPassword" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetRevisionsPassword();
    
    /**
     * True if has "revisionsPassword" attribute
     */
    boolean isSetRevisionsPassword();
    
    /**
     * Sets the "revisionsPassword" attribute
     */
    void setRevisionsPassword(byte[] revisionsPassword);
    
    /**
     * Sets (as xml) the "revisionsPassword" attribute
     */
    void xsetRevisionsPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex revisionsPassword);
    
    /**
     * Unsets the "revisionsPassword" attribute
     */
    void unsetRevisionsPassword();
    
    /**
     * Gets the "lockStructure" attribute
     */
    boolean getLockStructure();
    
    /**
     * Gets (as xml) the "lockStructure" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLockStructure();
    
    /**
     * True if has "lockStructure" attribute
     */
    boolean isSetLockStructure();
    
    /**
     * Sets the "lockStructure" attribute
     */
    void setLockStructure(boolean lockStructure);
    
    /**
     * Sets (as xml) the "lockStructure" attribute
     */
    void xsetLockStructure(org.apache.xmlbeans.XmlBoolean lockStructure);
    
    /**
     * Unsets the "lockStructure" attribute
     */
    void unsetLockStructure();
    
    /**
     * Gets the "lockWindows" attribute
     */
    boolean getLockWindows();
    
    /**
     * Gets (as xml) the "lockWindows" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLockWindows();
    
    /**
     * True if has "lockWindows" attribute
     */
    boolean isSetLockWindows();
    
    /**
     * Sets the "lockWindows" attribute
     */
    void setLockWindows(boolean lockWindows);
    
    /**
     * Sets (as xml) the "lockWindows" attribute
     */
    void xsetLockWindows(org.apache.xmlbeans.XmlBoolean lockWindows);
    
    /**
     * Unsets the "lockWindows" attribute
     */
    void unsetLockWindows();
    
    /**
     * Gets the "lockRevision" attribute
     */
    boolean getLockRevision();
    
    /**
     * Gets (as xml) the "lockRevision" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLockRevision();
    
    /**
     * True if has "lockRevision" attribute
     */
    boolean isSetLockRevision();
    
    /**
     * Sets the "lockRevision" attribute
     */
    void setLockRevision(boolean lockRevision);
    
    /**
     * Sets (as xml) the "lockRevision" attribute
     */
    void xsetLockRevision(org.apache.xmlbeans.XmlBoolean lockRevision);
    
    /**
     * Unsets the "lockRevision" attribute
     */
    void unsetLockRevision();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection newInstance() {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
