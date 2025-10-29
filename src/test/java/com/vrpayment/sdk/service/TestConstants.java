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
package com.vrpayment.sdk.service;

import com.vrpayment.sdk.model.AuthenticatedCardDataCreate;
import com.vrpayment.sdk.model.AuthenticatedCardRequest;

public abstract class TestConstants {

  public static final long APPLICATION_USER_ID = 140366;
  public static final String AUTHENTICATION_KEY = "dvZsZdp+CLyi6RqBJuJER88CrrROHLz3VNuAkZI5U6s=";

  public static final long SPACE_ID = 82470;
  public static final long TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID = 382448;
  public static final long TEST_CUSTOMER_ID = 1234;

  public static final AuthenticatedCardRequest MOCK_CARD_DATA =
    new AuthenticatedCardRequest()
      .cardData(
        new AuthenticatedCardDataCreate()
          .primaryAccountNumber("4111111111111111")
          .expiryDate("2026-12"))
      .paymentMethodConfiguration(TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID);

  private TestConstants() {
    throw new IllegalAccessError("Utility Test class");
  }
}
