//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.05 at 03:34:49 PM MST 
//


package gov.inl.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nodes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="node" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="enableDataSending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="enableDataPassThrough" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="isAggregate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="isCollapsed" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/>
 *                             &lt;element name="payload" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                             &lt;element name="maxLatency" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                             &lt;element name="xCoord" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="yCoord" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="endPoints">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="endPoint" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Edges">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="edge" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nodeList",
        "edgeList"
})
@XmlRootElement(name = "Gen")
public class Gen {

    @XmlElement(name = "Nodes", required = true)
    protected NodeList nodeList;
    @XmlElement(name = "Edges", required = true)
    protected EdgeList edgeList;

    public NodeList getNodeList() { return nodeList; }
    public void setNodeList(NodeList value) {
        this.nodeList = value;
    }

    public EdgeList getEdgeList() {
        return edgeList;
    }
    public void setEdgeList(EdgeList value) {
        this.edgeList = value;
    }


}
