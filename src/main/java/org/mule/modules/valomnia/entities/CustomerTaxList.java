/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
/**
 *
 */
package org.mule.modules.valomnia.entities;

public class CustomerTaxList {

	private String customerReference;

	private String taxListReference;

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	public String getTaxListReference() {
		return taxListReference;
	}

	public void setTaxListReference(String taxListReference) {
		this.taxListReference = taxListReference;
	}

}
