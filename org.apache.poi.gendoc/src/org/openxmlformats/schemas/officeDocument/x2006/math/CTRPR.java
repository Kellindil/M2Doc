/*
 * XML Type:  CT_RPR
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_RPR(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTRPR extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRPR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrprd468type");
    
    /**
     * Gets the "lit" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getLit();
    
    /**
     * True if has "lit" element
     */
    boolean isSetLit();
    
    /**
     * Sets the "lit" element
     */
    void setLit(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff lit);
    
    /**
     * Appends and returns a new empty "lit" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewLit();
    
    /**
     * Unsets the "lit" element
     */
    void unsetLit();
    
    /**
     * Gets the "nor" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getNor();
    
    /**
     * True if has "nor" element
     */
    boolean isSetNor();
    
    /**
     * Sets the "nor" element
     */
    void setNor(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff nor);
    
    /**
     * Appends and returns a new empty "nor" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewNor();
    
    /**
     * Unsets the "nor" element
     */
    void unsetNor();
    
    /**
     * Gets the "scr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTScript getScr();
    
    /**
     * True if has "scr" element
     */
    boolean isSetScr();
    
    /**
     * Sets the "scr" element
     */
    void setScr(org.openxmlformats.schemas.officeDocument.x2006.math.CTScript scr);
    
    /**
     * Appends and returns a new empty "scr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTScript addNewScr();
    
    /**
     * Unsets the "scr" element
     */
    void unsetScr();
    
    /**
     * Gets the "sty" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle getSty();
    
    /**
     * True if has "sty" element
     */
    boolean isSetSty();
    
    /**
     * Sets the "sty" element
     */
    void setSty(org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle sty);
    
    /**
     * Appends and returns a new empty "sty" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle addNewSty();
    
    /**
     * Unsets the "sty" element
     */
    void unsetSty();
    
    /**
     * Gets the "brk" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak getBrk();
    
    /**
     * True if has "brk" element
     */
    boolean isSetBrk();
    
    /**
     * Sets the "brk" element
     */
    void setBrk(org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak brk);
    
    /**
     * Appends and returns a new empty "brk" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak addNewBrk();
    
    /**
     * Unsets the "brk" element
     */
    void unsetBrk();
    
    /**
     * Gets the "aln" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getAln();
    
    /**
     * True if has "aln" element
     */
    boolean isSetAln();
    
    /**
     * Sets the "aln" element
     */
    void setAln(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff aln);
    
    /**
     * Appends and returns a new empty "aln" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewAln();
    
    /**
     * Unsets the "aln" element
     */
    void unsetAln();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR newInstance() {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
