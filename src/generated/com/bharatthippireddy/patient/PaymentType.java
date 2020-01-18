//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.01.18 a las 04:25:03 PM CST 
//


package com.bharatthippireddy.patient;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cash" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insurance" type="{http://www.bharatthippireddy.com/Patient}Insurance"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "insurance",
    "cash"
})
public class PaymentType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Insurance insurance;
    protected Integer cash;

    /**
     * Obtiene el valor de la propiedad insurance.
     * 
     * @return
     *     possible object is
     *     {@link Insurance }
     *     
     */
    public Insurance getInsurance() {
        return insurance;
    }

    /**
     * Define el valor de la propiedad insurance.
     * 
     * @param value
     *     allowed object is
     *     {@link Insurance }
     *     
     */
    public void setInsurance(Insurance value) {
        this.insurance = value;
    }

    /**
     * Obtiene el valor de la propiedad cash.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCash() {
        return cash;
    }

    /**
     * Define el valor de la propiedad cash.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCash(Integer value) {
        this.cash = value;
    }

}
