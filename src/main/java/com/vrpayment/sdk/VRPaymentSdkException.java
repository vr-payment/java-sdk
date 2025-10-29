/**
 * VR Payment Java SDK
 *
 * This library allows to interact with the VR Payment payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://www.vr-payment.de
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vrpayment.sdk;

/**
 * Exception thrown when an internal SDK error occurs
 */
public class VRPaymentSdkException extends RuntimeException {

  private static final long serialVersionUID = 1748345776895L;

  private final ErrorCode code;

  private final String message;

  /**
   * Constructor.
   *
   * @param code    SDK error code
   * @param message  exception message details
   */
  public VRPaymentSdkException(ErrorCode code, String message) {
    super();
    this.code = code;
    this.message = String.format("Error code: %d. %s", code.getCode(), message);
  }

  /**
   * @return SDK error code
   */
  public ErrorCode getCode() {
    return this.code;
  }

  /**
   * @return SDK error message
   */
  public String getMessage() {
    return this.message;
  }

}