/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.gexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GAddition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GAdditionExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGAdditionExpression()
 * @model
 * @generated
 */
public interface GAdditionExpression extends GBinaryOperatorExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gemoc.gexpressions.GAdditionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.gemoc.gexpressions.GAdditionOperator
	 * @see #setOperator(GAdditionOperator)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGAdditionExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	GAdditionOperator getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GAdditionExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.gemoc.gexpressions.GAdditionOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(GAdditionOperator value);

} // GAdditionExpression
